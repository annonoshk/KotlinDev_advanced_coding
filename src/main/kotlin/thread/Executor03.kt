package thread

import java.time.LocalTime
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

fun main() {
    val executor: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor()
    executor.scheduleAtFixedRate(
        { println(LocalTime.now().toString() + ": Hello!") },
         1000,
         1000,
         TimeUnit.MILLISECONDS
    )
}
