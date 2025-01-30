package coroutines.channel

/*
 * Robot factory
In a factory, there are two types of robots: producer robots and consumer robots.
The producer robots manufacture items and the consumer robots process these.
The factory operates in such a way that a producer robot must wait for a consumer robot to be ready to process an item before initiating production of the next one. Similarly, a consumer robot must wait for a producer robot to manufacture an item before it can start processing.

Here's what you need to do:

Create a Channel to represent the production line in the factory. This should be a rendezvous channel.

Create a producer coroutine that sends items (represented as integers) to the channel. It should produce a total of 10 items, with a delay of 100ms between each item production.

Create a consumer coroutine that receives items from the channel and processes them. For this task, processing an item means adding it to a list of processed items.

Ensure that the producer coroutine waits for the consumer coroutine to be ready before producing the next item, and that the consumer coroutine waits for the producer coroutine to produce an item before processing it.

Close the channel once all items have been produced and processed.

Return the list of processed items from your function.

Sample Input 1:

Sample Output 1:

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */

import io.ktor.util.collections.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
/*
 * val channel = Channel() // Rendezvous channel
launch {
    channel.send(1) // This will suspend until another coroutine is ready to receive
}
launch {
    println(channel.receive()) // This will suspend until another coroutine is ready to send
}
 */

fun main() {
    runBlocking {
        println(simulateFactory())
    }
}
@OptIn(DelicateCoroutinesApi::class)
suspend fun simulateFactory(): List<Int> {
    val channel = Channel<Int>(Channel.RENDEZVOUS)
    val processedItems = mutableListOf<Int>()

    val producer = GlobalScope.launch {
        for (i in 1..10) {
            delay(100)
            channel.send(i)
        }
        channel.close()
    }

    val consumer = GlobalScope.launch {
        for (item in channel) {
            processedItems.add(item)
        }
    }

    producer.join()
    consumer.join()

    return processedItems
}