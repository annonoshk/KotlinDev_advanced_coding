package thread

import java.util.concurrent.ConcurrentLinkedQueue
import kotlin.concurrent.thread

fun addNumbers(target: ConcurrentLinkedQueue<Int>) {
    for (i in 0..99_999) target.add(i)
}

fun main() {
    // assigning thread-safe implementation
    val numbers = ConcurrentLinkedQueue<Int>()

    val writer = thread(start = false, name = "Thread 1", block = {
        addNumbers(numbers)
    })
    writer.start()

    addNumbers(numbers) // add number from the main thread

    writer.join() // wait for writer thread

    println(numbers.size) // it prints 200000
}