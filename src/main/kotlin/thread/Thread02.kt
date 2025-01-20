/*package thread

fun getThreadName(thread: Thread): String {
    return thread.name
 }

fun printIfDaemon(thread: Thread) {
    if(thread.isDaemon) "daemon" else "not daemon"
}

fun printCurrentThreadInfo() {
    // name: my-thread
    // priority: 5
    println("name: ${Thread.currentThread().name}")
    println("priority: ${Thread.currentThread().priority}")
}

fun main() {
    val minPriority = Thread.MIN_PRIORITY
    val maxPriority = Thread.MAX_PRIORITY
    println("$minPriority $maxPriority")
    val t: Thread = Thread.currentThread()

    println("Thread name : ${getThreadName(t)}")
    println(printCurrentThreadInfo())
}*/
