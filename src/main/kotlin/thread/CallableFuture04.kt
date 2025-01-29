package thread

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val executor: ExecutorService = Executors.newSingleThreadExecutor()

    val future = executor.submit(
        Callable {
            Callable {
                100 + 100
            }
        }
    )

    future.cancel(true)
    println(future.get())
    executor.shutdown()
}

/*
 * import java.util.concurrent.*

fun executeCallableObjects(items: List<Future<Callable<Int>>>): Int {
    val executor = Executors.newSingleThreadExecutor()
    var lambdaExpression.getSum = 0

    try {
        for (i in items.indices.reversed()) {
            val future = items[i]
            val callable = future.get()
            val result = executor.submit(callable).get()
            lambdaExpression.getSum += result
        }
    } finally {
        executor.shutdown()
    }

    return lambdaExpression.getSum
}

 */

/*
 * fun executeCallableObjects(items: List<Future<Callable<Int>>>): Int = items.reversed().sumOf { it.get().call() }
 */