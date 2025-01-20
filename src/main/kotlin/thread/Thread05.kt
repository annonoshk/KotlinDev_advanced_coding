package thread
/*
 * Starting multiple threads - 2
You have a class that implements the Runnable interface.

class RunnableWorker : Runnable {
    override fun run() {
        // the method does something
    }
}

1) Create three threads using instances of RunnableWorker. Set names to these threads like "worker-X", where X is any suffix. Use the Thread(Runnable target, String name) constructor to pass a thread name on thread creation.

2) Start all the created threads. The method run of each instance must be executed in a new thread.

Note: you don't need to rewrite the given class; it will be added to your solution automatically.

Write a program in Kotlin
 */
fun main() {
    // create threads and start them using the class RunnableWorker
/*    val t1 = Thread(RunnableWorker(),"worker-1")
    val t2 = Thread(RunnableWorker(),"worker-2")
    val t3 = Thread(RunnableWorker(),"worker-3")
    t1.start()
    t2.start()
    t3.start()*/

    Array(3) { Thread(RunnableWorker(), "worker-$it") }.forEach { it.start() }

}
// Don't change the code below
class RunnableWorker : Runnable {
    override fun run() {
        val name = Thread.currentThread().name
        if (name.startsWith("worker-")) {
            println("too hard calculations...")
        } else {
            return
        }
    }
}