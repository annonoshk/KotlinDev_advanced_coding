package thread

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val NUMBER_OF_TASKS = 10
    val POOL_SIZE = 4
    val executor: ExecutorService = Executors.newFixedThreadPool(POOL_SIZE)

    for (i in 0..NUMBER_OF_TASKS) {
        executor.submit {
            val taskName: String = "task-$i"
            val threadName: String = Thread.currentThread().name
            println("$threadName executes $taskName")
        }
    }
    executor.shutdown()
}