package thread

import java.util.*
import kotlin.concurrent.thread

// choose the collection
fun createSynchronizedList(): MutableList<Int> {
    return Collections.synchronizedList(mutableListOf())
}

fun addNumbers03(numbers: MutableList<Int>) {
    for (i in 0 until 100_000) numbers.add(i)
}

fun main() {
    val numbers: MutableList<Int> = createSynchronizedList()
    
    val thread1 = thread(start = false, name = "Thread 1", block = {
        addNumbers03(numbers)
    })
    val thread2 = thread(start = false, name = "Thread 2", block = {
        addNumbers03(numbers)
    })

    thread1.start()
    thread2.start()
    addNumbers(numbers)

    thread1.join()
    thread2.join()

    println(numbers.size) // 300_000
}