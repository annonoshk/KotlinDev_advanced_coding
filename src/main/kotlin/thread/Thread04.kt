package thread

/*
 * Starting multiple threads - 1
Here's a class that extends the Thread class.

class WorkerThread(name: String) : Thread(name) {
    override fun run() {
        // the method does something
    }
}

1) Create two instances of the given class and set the names like "worker-X", where X is any suffix (use the constructor to set a name).

2) Start the created threads. The method run of each instance must be executed in a new thread.

Note: the given class will be added to your solution automatically.
 */


// Don't change the code below
class WorkerThread(name: String) : Thread(name) {
    val numberOfLines = 3

    override fun run() {
        val name = currentThread().name

        if (!name.startsWith("worker-")) {
            return
        }

        for (i in 0 until numberOfLines) {
            println("do something...")
        }
    }
}

fun main() {
    // create instances and start threads here
/*    val t1:Thread = WorkerThread("worker-1")
    t1.start()*/
    sequenceOf("worker-A", "worker-B")
        .map(::WorkerThread)
        .forEach(Thread::start)
}


