package thread

class SynchronizedCounter {

    var count = 0

    @Synchronized
    fun increment() {
        count++
    }

    //@Synchronized
    fun getValue(): Int {
        return count
    }
}

class WorkerThread01(val counter: SynchronizedCounter) : Thread() {
    override fun run() {
        for (i in 1..10_000_000) {
            counter.increment()
        }
    }
}

fun main() {
    val counter = SynchronizedCounter()

    val worker1 = WorkerThread01(counter)
    val worker2 = WorkerThread01(counter)

    worker1.start()
    worker2.start()

    worker1.join()
    worker2.join()

    println(counter.getValue()) // the result is 20_000_000
}