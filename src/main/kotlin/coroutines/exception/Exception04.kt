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
    try {
        job.join() // Wait for completion
    } catch (e: CancellationException) {
        // CancellationException will carry the primary exception as its cause
        // Suppressed exceptions will be attached to it
    }
}