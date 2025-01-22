package thread

import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

class Worker : Thread() {
    override fun run() {
        println("Starting a task")
        sleep(2000) // it solves a difficult task
        println("The task is finished")
    }
}
fun main() {
/*    println("Started")
    TimeUnit.SECONDS.sleep(2) // suspend current thread for 2 second
    println("Finished")*/

/*    val thread: Thread = Thread.currentThread()
    println("The start")

    thread.start() // start thread

    println("Do something useful")

    thread.join(2000)  // waiting for thread to die

    println("The end")*/
    val worker = Worker()
    worker.start() // start the worker
    Thread.sleep(100)
    println("Do something useful")

    worker.join(3000)  // waiting for the worker
    println("The program stopped")
}
