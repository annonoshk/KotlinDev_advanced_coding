package thread

import java.util.concurrent.Executors
/*
 * Asynchronous email sending
Some operations, like email sending, are often performed in a background thread. It allows reducing the load for main threads.

Here is the MailSender interface and the MockMailSender class, which simulate mail sending.

Implement the asyncSend function by iterating through messages and sending them via sender. Use a single thread pool executor, and do not forget to shut it down.
 */


fun main() {
    val messageCounts: Int = readln().toInt()
    val messages: MutableList<String> = mutableListOf<String>()
    for (i in 0 until messageCounts) {
        messages.add(readln())
    }
    val sender: MailSender = MockMailSender()
    asyncSend(sender, messages)
}

fun asyncSend(sender: MailSender, messages: List<String>) {
    // TODO
}

// Do not change it
interface MailSender {
    fun send(message: String)
}

// The class simulates mail sending
// Do not change it
class MockMailSender : MailSender {
    override fun send(message: String) {
        println("Message $message was sent")
    }
}