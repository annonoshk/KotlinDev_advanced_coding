package thread

import kotlin.concurrent.thread


/*
 * Concurrent collections
To avoid all the problems associated with custom synchronization, the Java Class Library provides alternative collection implementations that are adapted for multithreaded applications and are fully thread-safe. You may find them in the java.util.concurrent package, which includes collections like ConcurrentMap, ConcurrentLinkedQueue, and CopyOnWriteArrayList. They make it easier to develop modern Java applications.

These concurrent collections allow you to avoid custom synchronization in many cases and have a high performance – close to that of classic collections. Concurrent collections do not use the @Synchronized annotation but rely on more complex synchronization primitives and a lock-free algorithm, which allows them to be both thread-safe and high-performance. However, if you do not really need multithreading, use classic collections, since they are still more efficient than concurrent ones.

You will learn about different types of concurrent collections later on.
 */
fun addNumbers(target: MutableList<Int>) {
    for (i in 0 until 100_000) target += i
}

fun main() {
    val numbers = mutableListOf<Int>()

    val writer = thread(start = false, name = "Thread 1", block = {
        addNumbers(numbers)
    })
    writer.start()

    addNumbers(numbers) // add a number from the main thread

    writer.join() // wait for the writer thread

    println(numbers.size) // the result can vary
}