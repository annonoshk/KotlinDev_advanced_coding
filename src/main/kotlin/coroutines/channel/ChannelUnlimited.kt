package coroutines.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
 * Talking channels
Implement a program with two coroutines: sender and receiver.
Use a channel to enable communication between the sender and the receiver.
Choose an unlimited channel to ensure the sender never has to wait for the receiver.

The sender coroutine should read two messages from the user (console input) and
send them to the receiver via the channel.
The receiver coroutine should retrieve these messages from the channel and
print "Message received: [ given input ]".

Sample Input 1:

Hello
User

Sample Output 1:

Message received: Hello
Message received: User
 */

fun main() = runBlocking {
    val channel = Channel<String>(Channel.UNLIMITED)
    val senderJob = launch {
        sender(channel) // This will never suspend
    }
    val receiverJob = launch {
        receiver(channel)
    }
    senderJob.join()
    receiverJob.join()
}

suspend fun sender(channel: Channel<String>) {
    val messages = mutableListOf<String>()
    repeat(2) {
        val message = readlnOrNull() ?: ""
        messages.add(message)
    }
    for (message in messages )
        channel.send(message)

    channel.close()
}

suspend fun receiver(channel: Channel<String>) {
    for(message in channel)
        println("Message received: $message")
}
