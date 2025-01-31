package flow.stateFlow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// A simple data class representing the state with a counter value
data class CounterState(val count: Int)

// The class that encapsulates the counter logic and state flow
class Counter {
    private val _stateFlow = MutableStateFlow(CounterState(1)) // Initialize with count 1
    val stateFlow: StateFlow<CounterState> = _stateFlow

    // Method to increment the counter every second
    @OptIn(DelicateCoroutinesApi::class)
    fun startIncrementing() = GlobalScope.launch {
        while (true) {
            delay(1000) // Wait for 1 second
            _stateFlow.value = CounterState(_stateFlow.value.count + 1) // Increment and change the state
        }
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking<Unit> {
    val counter = Counter() // Create an instance of Counter

    // Start incrementing the counter in the background
    counter.startIncrementing()

    // Function to simulate a client that reacts to the counter updates
    fun subscribeClient(clientId: Int) = GlobalScope.launch {
        counter.stateFlow.collect { state ->
            println("Client $clientId: ${state.count}")
        }
    }

    // Simulate three clients arriving at one-second intervals
    val client1 = subscribeClient(1) // First client subscribes immediately
    delay(1000) // Wait for 1 second
    val client2 = subscribeClient(2) // Second client subscribes
    delay(1000) // Wait for another second
    val client3 = subscribeClient(3) // Third client subscribes

    // Wait for some time to see the counter updates
    delay(10000) // Wait for 10 seconds

    // Cancel all the clients and the counter incrementing coroutine
    client1.cancel()
    client2.cancel()
    client3.cancel()
    counter.startIncrementing().cancel()
}