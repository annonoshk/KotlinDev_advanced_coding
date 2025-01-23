package thread

fun main() {
    val customThread: Thread = CustomThread01()
    customThread.start()
    println(Thread.currentThread().id)
    customThread.interrupt() // interrupt this thread
}
class CustomThread01: Thread() {
    override fun run() {
        while (!isInterrupted) {
            try {
                sleep(1000) // it may throw InterruptedException
            } catch (e: InterruptedException) {
                println("sleeping was interrupted")
                break // stop the loop
            }
        }
        print("${currentThread().id} finished")
    }
}

/*
 * class CustomThread: Thread() {
    override fun run() {
        while (!isInterrupted) {
            try {
                doAction()
                sleep(1000) // it may throw InterruptedException
            } catch (e: InterruptedException) {
                println("sleeping was interrupted")
                break // stop the loop
            }
        }
        print("$name finished")
    }

    private fun doAction() {
        // something useful
    }
}
 */

/*
 * class CountingTask: Runnable {
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
 */