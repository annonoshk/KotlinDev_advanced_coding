package thread

import java.util.concurrent.*


fun main() {
    //val executor: ExecutorService = Executors.newFixedThreadPool(4)
    val executor: ExecutorService = Executors.newFixedThreadPool(4)

    // submitting tasks

    executor.submit { println("Hello!") }
    
    executor.shutdown()

    val terminated = executor.awaitTermination(60, TimeUnit.MILLISECONDS)

    if (terminated) {
        println("The executor was successfully stopped")
    } else {
        println("Timeout elapsed before termination")
    }

    //
}
