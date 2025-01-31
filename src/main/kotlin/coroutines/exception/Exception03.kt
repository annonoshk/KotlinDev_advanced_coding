package coroutines.exception

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
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
    // Handle exceptions (e.g., print them)
}