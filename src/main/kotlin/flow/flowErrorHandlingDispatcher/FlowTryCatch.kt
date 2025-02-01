package flow.flowErrorHandlingDispatcher

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    flow {
        try {
            emit("Value")
        } catch (exc: Exception) { // intercept the exception that happens downstream
            println("Intercepted $exc")
        }
    }
    .collect {
        throw Exception()       // exception happens on collect
        @Suppress("UNREACHABLE_CODE")
        println("Collected $it")
    }
    println("This code should not be executed. Where did the exception go?")
}
