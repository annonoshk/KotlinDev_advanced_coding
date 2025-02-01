package flow.flowErrorHandlingDispatcher

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map

// fully encapsulated flow
val ioFlow = flow {
    log("Emitting") // this code will keep flowing in IO dispatcher
    emit("some value")    //
}.flowOn(Dispatchers.IO)

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
fun main() = runBlocking<Unit> {
    ioFlow
    	.map { log("Processing $it"); it } // this code will run with Default dispatcher
        .flowOn(newSingleThreadContext("1CPU")) // change upstream again up to previous flowOn
        .collect { value ->                // still collect in the parent context
            log("Collected $value")
        }
}