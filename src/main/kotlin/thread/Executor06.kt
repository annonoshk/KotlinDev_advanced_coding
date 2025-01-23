package thread

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {
    val executor: ExecutorService = Executors.newSingleThreadExecutor()

    val task: Runnable = Runnable {
        try {
            TimeUnit.MILLISECONDS.sleep(1000)
            println("Hello!")
        } catch (e: Exception) {
            println(e.stackTraceToString())
        }
    }

    executor.submit(task)
    executor.submit(task)
}
