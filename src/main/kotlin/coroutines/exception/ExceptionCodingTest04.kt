package coroutines.exception

import kotlinx.coroutines.*
import kotlinx.io.IOException


fun main() {
    nestedExceptions()
}
fun nestedExceptions() {
    runBlocking {
        try {
            coroutineScope {
                val job = launch {
                    throw IOException()
                }

                launch {
                    try {
                        job.join() // Wait for the specific job to complete
                    } catch (e: IOException) {
                        println("Nested exception caught")
                    }
                }
            }
        } catch (e: IOException) {
            println("Nested exception caught") // This won't be printed
        }
    }
}