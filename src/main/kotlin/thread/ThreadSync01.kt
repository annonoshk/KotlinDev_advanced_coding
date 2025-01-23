package thread

import kotlin.concurrent.thread

class Counter {
    var count = 0

    fun inc() {
        count++
    }
}

fun main() {
    val counterInstance = Counter()

    val thread1 = thread(block = {
        for (i in 1..10_000_000) {
            counterInstance.inc();
        }
    })
    val thread2 = thread(block = {
        for (i in 1..10_000_000) {
            counterInstance.inc();
        }
    })
    thread1.join()
    thread2.join()
    println("The result of the threads' work: ${counterInstance.count}")
}

