/*
package flow.sharedFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    val sharedFlow = MutableSharedFlow<Int>(
        replay = 0,
        extraBufferCapacity = 0,
        onBufferOverflow = BufferOverflow.SUSPEND
    )

    launch {
        repeat(10) { i ->
            println("Emitting $i")
            sharedFlow.emit(i) // This will suspend when the buffer is full
            delay(100) // Just to simulate some work
        }
    }

    delay(500) // Wait for some time before collecting

    sharedFlow.collect { value ->
        println("Collected $value")
    }
}*/
