/*
package flow.sharedFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

// Event Bus
class EventBus1(private val coroutineScope: CoroutineScope) {
    private val eventFlow = MutableSharedFlow<String>()

    // Make postEvent a suspending function
    suspend fun postEvent(event: String) {
        // Emit the event to all subscribers
        eventFlow.emit(event)
    }

    fun subscribe(): SharedFlow<String> {
        // Return the shared flow for collecting events
        return eventFlow.asSharedFlow()
    }
}

// Client
class Client(private val name: String, private val coroutineScope: CoroutineScope) {
    fun startListening(eventBus: EventBus1) {
        // Collect events from the event bus
        coroutineScope.launch {
            eventBus.subscribe().collect { event ->
                println("$name received event: $event")
            }
        }
    }
}

suspend fun main() = coroutineScope {
    val eventBus1 = EventBus1(this)
    val client1 = Client("Client 1", this)
    val client2 = Client("Client 2", this)

    // Start listening for events
    client1.startListening(eventBus1)
    client2.startListening(eventBus1)

    // Post some events
    launch {
        eventBus1.postEvent("Event 1")
        eventBus1.postEvent("Event 2")
        eventBus1.postEvent("Event 3")
    }
    // We delay the coroutine
    delay(1000)

}*/
