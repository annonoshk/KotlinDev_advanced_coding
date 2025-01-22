package thread

import kotlin.concurrent.thread

fun main() {
    val thread = CustomThread()
    thread.start()
    thread.join() // wait for the thread with an exception to terminate
    println("I am printed!") // this line will be printed

    thread(block = {
        println("Hello from the custom thread!")
    })
    print(2 / 0)
    println("Hello from the main thread!")
}


class CustomThread : Thread() {
    override fun run() {
        println(2 / 0)
    }
}