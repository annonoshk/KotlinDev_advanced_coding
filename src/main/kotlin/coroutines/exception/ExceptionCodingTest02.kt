package coroutines.exception

/*
 * Aggregate exceptions
Write a function aggregateExceptions that launches several coroutines within a scope, with two coroutines throwing different exceptions. Use a CoroutineExceptionHandler to catch the primary exception and print "Primary exception caught". Then, the suppressed exception should print "Suppressed exception caught". Make sure to structure your coroutines so that multiple exceptions are thrown and can be aggregated.

Sample Input 1:

Sample Output 1:

Primary exception caught
Suppressed exception caught
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    aggregateExceptions()
    // Handle exceptions (e.g., print them)
}

suspend fun aggregateExceptions() {
    runBlocking {
        val job = launch {
            launch {
                // This will be the primary exception
                throw Exception("Primary exception caught")
            }
            launch {
                // This exception will be suppressed
                throw Exception("Suppressed exception caught")
            }
        }
        job.join() // Wait for completion//write your code here
    }
}