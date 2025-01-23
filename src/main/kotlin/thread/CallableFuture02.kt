package thread

import java.util.concurrent.*

val executor: ExecutorService = Executors.newSingleThreadExecutor()

val future = executor.submit(
    Callable {
        TimeUnit.SECONDS.sleep(5)
        70000
    }
)

fun main() {
    println(future.isDone) // most likely it is false

    val result1 = future.get()
    println(result1)
    
    val result2 = future.get(10, TimeUnit.SECONDS) // it blocks the current thread

    println(result2)
}