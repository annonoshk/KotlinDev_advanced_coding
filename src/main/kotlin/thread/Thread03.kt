package thread
import kotlin.concurrent.thread

class PrintMessageTask(s: String) : Runnable {
    val _s = s
    override fun run() {
        println(_s)
    }

}



fun main() {
    val task: Runnable = PrintMessageTask("Hi, I'm good.")
    val worker = Thread(task)
    worker.start()
}


