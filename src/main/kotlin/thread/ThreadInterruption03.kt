package thread

import java.lang.Thread.interrupted

fun main() {
    val thread = thread(start = false, block = {
        if (!interrupted()) {
            println(interrupted())
        } else {
            while (true) {
                if (!interrupted()) {
                    println(interrupted())
                    break
                }
            }
        }
    })
    thread.start()
    thread.interrupt()
}

fun thread(
    start: Boolean,
    block: () -> Unit
): Thread {
    val thread = object : Thread() {
        override fun run() {
            block()
        }
    }
    return thread
}