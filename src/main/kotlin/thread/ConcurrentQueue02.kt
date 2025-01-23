package thread

import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

fun main() {
    val queue = ConcurrentLinkedQueue<Int>()

    val generator = thread(start = false, name = "Thread 1", block = {
        try {
            queue.add(10)
            TimeUnit.MICROSECONDS.sleep(10)
            queue.add(20)
            TimeUnit.MILLISECONDS.sleep(10)
            queue.add(30)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    })

    val poller = thread(start = false, name = "Thread 2", block = {
        var countRead = 0
        while (countRead != 3) {
            val next: Int? = queue.poll()
            if (next != null) countRead++
            println(next)
            try {
                TimeUnit.MILLISECONDS.sleep(10)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    })

    generator.start()
    poller.start()
}