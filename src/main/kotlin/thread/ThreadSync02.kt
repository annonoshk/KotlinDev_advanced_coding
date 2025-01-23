package thread

class SomeClass(val className: String) {
    @Synchronized
    fun doSomething() {
        val threadName = Thread.currentThread().name
        println("$threadName entered the method of $className")
        println("$threadName leaves the method of $className")
    }
}


//sync in a part of code

class SomeClass2 {
    var value = 0
    fun changeValue(newValue: Int) {

        // unsynchronized code
        print("I'd like to change the value for $newValue")
        synchronized(this) { // synchronization on the class
            // synchronized code
            value = newValue
        }
        print("The value has been changed successfully!")
    }
}
class MyThread(val classInstance: SomeClass) : Thread() {
    override fun run() {
        classInstance.doSomething()
    }
}

fun main() {
    val instance1 = SomeClass("instance-1")
    val instance2 = SomeClass("instance-2")

    val first = MyThread(instance1)
    val second = MyThread(instance1)
    val third = MyThread(instance2)

    first.start()
    second.start()
    third.start()
}