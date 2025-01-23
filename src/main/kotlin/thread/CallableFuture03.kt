package thread

import java.util.concurrent.*

val executor03 = Executors.newFixedThreadPool(4)

// three "difficult" tasks

fun main() {
    val callables = listOf(
        Callable { 1000 },
        Callable { 2000 },
        Callable { 1500 }
    )

    val futures = executor03.invokeAll(callables)
    var sum = 0
    for (future in futures) sum += future.get() // blocks on each future to get the result
    println(sum)
}
