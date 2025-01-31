/*
package flow.sharedFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Define an EventBus with a buffer capacity of 2
class EventBus {
    private val eventFlow = MutableSharedFlow<String>(replay = 0, extraBufferCapacity = 2)

    suspend fun postEvent(event: String) {
        eventFlow.emit(event)
    }

    fun subscribe(): SharedFlow<String> = eventFlow.asSharedFlow()
}

fun main() = runBlocking {
    val eventBus = EventBus()

    // Subscribe to the EventBus
    val job = launch {
        eventBus.subscribe().collect { event ->
            println("Subscriber received: $event")
            delay(500) // Simulate processing delay
        }
    }

    // Post events
    launch {
        eventBus.postEvent("Event 1")
        eventBus.postEvent("Event 2")
        eventBus.postEvent("Event 3")
        eventBus.postEvent("Event 4")
    }

    // Wait for a while before canceling the subscriber to see some output
    delay(2000)
    job.cancel()
}*/
