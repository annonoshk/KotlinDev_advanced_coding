package flow.flowErrorHandlingDispatcher

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

val flow= flow<String> { emit("Value") }

fun main() = runBlocking {
    try {
        flow
            .map { println("Passed $it"); it }
            .map {
                throw Exception("Exception in Map-1")
                it
            }
            .catch { println("Catch 1: $it") } // Catch everything upstream
            .map {
                throw Exception("Exception in Map-2")
                it
            }
            .catch { println("Catch 2: $it") } // Catch everything upstream, past previous catch
            .collect {
                println("Collected $it")
            }
    } catch (e: Exception) {      // Catch all uncaught exceptions in the flow (past last .catch)
        println("Uncaught $e")
    }
}