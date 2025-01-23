package thread

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {

    val executor: ExecutorService = Executors.newFixedThreadPool(4)

    for (i in 1..2) {
        val taskNumber: Int = i
        executor.submit { println("Starting task-$taskNumber") }
    }

    TimeUnit.MILLISECONDS.sleep(50) // the current thread waits for 50 ms

    executor.shutdown()

    println("Main completed")
}