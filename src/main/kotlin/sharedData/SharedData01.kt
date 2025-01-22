package sharedData

class Counter1 {
    var value = 0

    fun increment() {
        value++
    }
}

class MyThread(
    val
    counter: Counter1
) : Thread() {
    override fun run() {
        counter.increment()
    }
}

fun main() {
    val counter1: Counter1 = Counter1()

    val thread1: MyThread = MyThread(counter1)
    thread1.start()
    thread1.join()

    val thread2: MyThread = MyThread(counter1)
    thread2.start()
    thread2.join()

    println(counter1.value)
}