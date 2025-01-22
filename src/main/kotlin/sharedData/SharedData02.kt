package sharedData

class Counter2 {
    var value = 0

    fun increment() {
        value++
    }
}

class MyThread2(val counter: Counter2): Thread() {
    override fun run() {
        counter.increment()
        counter.increment()
        counter.increment()
    }
}

fun main() {
    // inside the main function

    val counter2: Counter2 = Counter2()

    counter2.increment()

    counter2.increment()

    val thread: MyThread2 = MyThread2(counter2)

    thread.start()

    thread.join() // waiting for the thread

    val result: Int = counter2.value

    println(result)
}