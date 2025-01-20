package thread

import kotlin.concurrent.thread

/*
 * Numbers filter
Create a thread with the name numbersFilter by using the function thread().
It should read integer numbers from the standard input (line by line).
If the number is even, the filter must print it to the standard output (each number on a new line);
if the number is 0, the filter must stop.

Sample Input 1:

1
2
3
4
0

Sample Output 1:

2
4
 */

fun main() {
/*    val numbersFilter = thread(block = {
        val evenNumbers = mutableListOf<Int>()
        while (true) {
            val input = readLine()?.toIntOrNull() ?: break
            if (input == 0) break
            if (input % 2 == 0) evenNumbers.add(input)
        }
        evenNumbers.forEach(::println)
    })
    numbersFilter.join() // Wait for the thread to finish*/

    generateSequence(::readLine)
        .mapNotNull(String::toIntOrNull)
        .takeWhile { it != 0 }
        .filter { it % 2 == 0 }
        .forEach(::println)
}
