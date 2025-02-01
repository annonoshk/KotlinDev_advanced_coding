package flow.flowErrorHandlingDispatcher

import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    flow
        .map { println("Passed $it"); it }
        .onCompletion { exc ->
            println("Completed 1, Exception: $exc")
        }
        .collect {
            println("Collected $it")
        }
}
