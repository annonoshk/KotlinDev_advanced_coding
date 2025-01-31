package coroutines.exception

import kotlinx.coroutines.*

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        // Handle the primary exception
        println("Caught $exception")
        // Handle all suppressed exceptions
        exception.suppressed.forEach {
            println("Caught suppressed $it")
        }
    }
    val job = launch(handler) {
        launch {
            // This will be the primary exception
            throw Exception("Primary exception")
        }
        launch {
            // This exception will be suppressed
            throw Exception("Suppressed exception")
        }
    }
    job.join() // Wait for completion
}