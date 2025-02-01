package flow.flowErrorHandlingDispatcher

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

// helper function to visualize current thread
fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() = runBlocking<Unit> {
    flow {
        log("Emitting") // this code will flow in context of IO dispatcher
        emit("some value")
    }
    .map { log("Processing $it"); it }
    .flowOn(Dispatchers.IO)   // everything below will stay in parent context
    .collect { value ->
        log("Collected $value")
    }
}