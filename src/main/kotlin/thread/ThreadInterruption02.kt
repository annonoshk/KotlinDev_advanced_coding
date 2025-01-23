package thread

import java.lang.Thread.sleep

class CountingTask: Runnable {
    override fun run() {
        println("Start counting")
        var i = 1 // the first number to print
        try {
            while (!Thread.interrupted()) {
                println(i)
                i++
                Thread.sleep(1000)
            }
        } catch (e: InterruptedException) {
            println("Sleeping was interrupted")
        }
        println("Finishing")
    }
}

fun main() {
    val counter: Thread = Thread(CountingTask())
    counter.start()
    sleep(4500L)
    counter.interrupt() // interrupt this thread
    counter.join()
}