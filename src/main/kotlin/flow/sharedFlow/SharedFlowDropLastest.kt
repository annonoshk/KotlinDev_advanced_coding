package flow.sharedFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    val sharedFlow = MutableSharedFlow<Int>(
        replay = 1,
        extraBufferCapacity = 1, // Set extra buffer capacity
        onBufferOverflow = BufferOverflow.DROP_LATEST
    )

    launch {
        repeat(10) { i ->
            println("Emitting $i")
            sharedFlow.emit(i) // Will drop the latest value if buffer is full
            delay(100) // Just to simulate some work
        }
    }

    delay(500) // Wait for some time before collecting

    sharedFlow.collect { value ->
        println("Collected $value")
    }
}