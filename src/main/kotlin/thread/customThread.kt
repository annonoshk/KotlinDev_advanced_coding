package thread

import kotlin.concurrent.thread

class HelloThread : Thread() {
    override fun run() {
        val helloMsg = "Hello, i'm $name"
        println(helloMsg)
    }
}

class HelloRunnable : Runnable {
    override fun run() {
        val threadName = Thread.currentThread().name
        val helloMsg = "Hello, i'm $threadName"
        println(helloMsg)
    }
}

class SquareWorkerThread(name: String) : Thread(name) {
    override fun run() {
        while (true) {
            val number = readln().toInt()
            if (number == 0) {
                break
            }
            println(number * number)
        }
        println("$name's finished")
    }
}

fun main() {
    val t1 = HelloThread() // a subclass of Thread
    val t2 = Thread(HelloRunnable()) // passing runnable

    val myThread = Thread(HelloRunnable(), "my-thread")

    val t4 = thread(start = false, name = "Thread 4", block = {
        println("Hello, I'm ${Thread.currentThread().name}")
    })

    val t5 = thread(start = false, block = {
        println("Hello, I'm 5 ${Thread.currentThread().name}")
    })
    t5.start()

    val t6 = thread(block = {
        println("Hello, I'm 6 ${Thread.currentThread().name}")
    })

    val t7 = HelloThread()
    val t8 = HelloThread()
    t7.start()
    t8.start()

    println("Finished")

    val workerThread = SquareWorkerThread("square-worker")
    workerThread.start() // start a worker (not run!)

    for (i in 0 until 5_555_555_543L) {
        if (i % 1_000_000_000 == 0L) {
            println("Hello from the main!")
        }
    }

}