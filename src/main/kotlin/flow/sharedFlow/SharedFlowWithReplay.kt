/*
package flow.sharedFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Define an EventBus with a replay capacity of 2
class EventBus {
    private val eventFlow = MutableSharedFlow<String>(replay = 2)

    suspend fun postEvent(event: String) {
        eventFlow.emit(event)
    }

    fun subscribe(): SharedFlow<String> = eventFlow.asSharedFlow()
}

fun main(): Unit = runBlocking {
    val eventBus = EventBus()

    // Post events before subscription
    launch {
        eventBus.postEvent("Event 1")
        eventBus.postEvent("Event 2")
        eventBus.postEvent("Event 3")
    }

    // Delay to ensure events are posted before subscribing
    delay(100)

    // Subscribe to the EventBus
    eventBus.subscribe().collect { event ->
        println("Subscriber received: $event")
    }
}*/
