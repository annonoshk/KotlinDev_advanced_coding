package thread

/*
 * Check whether a number is prime
Write a program that reads integer numbers from the standard input and prints only those of them that are prime, in any order. A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers, for example: 2, 3, 5, 7, 11, and so on.

The main thread must read all the input integer numbers. For each number, it should create a task to check whether the number is prime. If that is true, the number has to be printed in a new line. All tasks must be submitted to an ExecutorService. After executing all tasks, your program should stop correctly; otherwise, you will get a "Time limit exceed" error.

Use the provided template with the main function and the PrintIfPrimeTask class.

Sample Input 1:

1 2 3 4 5 6 7 8 9 10 11

Sample Output 1:

2
3
5
7
11


 */
import java.util.concurrent.*

fun main() {
    val executor: ExecutorService = Executors.newFixedThreadPool(4) // assign an object to it
    val numbers: List<Int> = readln().split(" ").map { el -> el.toInt() }
    for (number in numbers) {
        executor.submit(PrintIfPrimeTask(number))
    }
    executor.shutdown()
    executor.awaitTermination(1, TimeUnit.MINUTES)
}

class PrintIfPrimeTask(private val number: Int) : Runnable {
    override fun run() {
        if (isPrime(number)) {
            println(number)
        }
    }

    private fun isPrime(num: Int): Boolean {
        if (num <= 1) return false
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}
