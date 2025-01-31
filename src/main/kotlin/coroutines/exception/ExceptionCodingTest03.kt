package coroutines.exception

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.cancellation.CancellationException

/*
 * Detect primary exception
Write a function detectPrimaryException that launches several coroutines within a scope, with at least one coroutine throwing an exception. Use a CoroutineExceptionHandler to catch and handle the first thrown exception (primary exception) and then print "Primary exception caught". Ensure that your coroutines are structured such that a primary exception is thrown before any other exceptions.

Sample Input 1:

Sample Output 1:

Primary exception caught
 */

suspend fun detectPrimaryException() {
    //write your code here
    val handler = CoroutineExceptionHandler { _, exception ->
        // Handle the primary exception
        println("Caught $exception")
        // Handle all suppressed exceptions
        exception.suppressed.forEach {
            println("Caught suppressed $it")
        }
    }
    runCatching {  }

}

/*
fun cancellationException() {
    //write your code here
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
        println("Caught cancellation exception")
    }
}*/
