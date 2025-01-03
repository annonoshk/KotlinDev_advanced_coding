package delegation
/*
 * Attaching a counting delegate on one, two... go!
Medium
383
23 hours ago
You are given an interface (ICounter) and a class (Counter) that implements this interface. Your task is to complete the Iterator class that uses the Counter class as a delegate to keep track of how many times a function next() is invoked.

The function next() doesn't need to implement anything beyond what's already provided by the delegate.

Sample Input 1:

0

Sample Output 1:

5
 */

interface ICounter {
    var count: Int
    fun increaseCount()
    fun getCurrentCount(): Int
}

class Counter(override var count: Int) : ICounter {
    // In case we need to count differently, this function can be altered
    override fun increaseCount() {
        count++
    }

    override fun getCurrentCount(): Int = count
}

// Do not change the code above

class Iterator(counter: ICounter): ICounter by counter {
    fun next() {
        increaseCount()
    }
    // Your code here
}

// Do not change the code below

fun main() {
    val a = readln().toInt()

    // Set initial value to counter
    val counter = Counter(a)

    // Create iterator
    val it = Iterator(counter)

    // Do some test iterations
    for (i in 1..5) {
        it.next()
    }

    println(it.getCurrentCount())
}