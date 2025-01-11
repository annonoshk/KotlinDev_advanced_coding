package debugger

import java.util.concurrent.locks.ReentrantLock


fun main() {

    var sharedResource = 0
    fun increment() { for (i in 1..1000) { sharedResource++ } }

    // Example of a simple deadlock
    val resource1 = Any()
    val resource2 = Any()
    Thread {
        synchronized(resource1)
        {
            Thread.sleep(100)
            synchronized (resource2)
            { println("Thread 1: Locked resource 2") }
        }
    }.start()
    Thread { synchronized(resource2) { Thread.sleep(100)
        synchronized (resource1) { println("Thread 2: Locked resource 1") } } }.start()

    val lock = ReentrantLock()
    fun greedyWorker() {
        lock.lock()
        try { // Long-running task
        } finally {
            lock.unlock()
        }
    }

    fun politeWorker() {
        if (lock.tryLock()) {
            try { // Quick task
            } finally {
                lock.unlock()
            }
        }
    }
}