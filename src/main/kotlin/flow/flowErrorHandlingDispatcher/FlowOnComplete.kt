package flow.flowErrorHandlingDispatcher

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    try {
        flow { emit("") }
            .catch { println("Caught exception") }
            .map { throw Exception(); it }
            .map { println("Processed"); it.uppercase() }
            .onCompletion { exc -> exc?.let { println("Finished with error") } }
            .collect {}
    } catch (_: Exception) {
        println("Unhandled exception from flow")
    }
}