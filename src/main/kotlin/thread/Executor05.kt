package thread

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun findSum(num: Int): Int {
    val executor = Executors.newSingleThreadExecutor()
    var sum = 0

    for (i in 1..5) {
        executor.submit { sum += num / i }
    }

    executor.shutdown()
    executor.awaitTermination(60, TimeUnit.MILLISECONDS)

    return sum
}

fun main() {
    println(findSum(10))
}