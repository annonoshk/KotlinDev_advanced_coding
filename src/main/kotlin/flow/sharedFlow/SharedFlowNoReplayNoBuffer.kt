/*
package flow.sharedFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Define an EventBus with no replay and no extra buffer
class EventBus {
    private val eventFlow = MutableSharedFlow<String>(replay = 0)

    suspend fun postEvent(event: String) {
        eventFlow.emit(event)
    }

    fun subscribe(): SharedFlow<String> = eventFlow.asSharedFlow()
}

fun main(): Unit = runBlocking {
    val eventBus = EventBus()

    // Subscribe to the EventBus
    eventBus.subscribe().collect { event ->
        println("Subscriber received: $event")
    }
    // Post events
    launch {
        eventBus.postEvent("Event 1")
        eventBus.postEvent("Event 2")
        eventBus.postEvent("Event 3")
    }
}*/
