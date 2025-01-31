package coroutines.contextDispatcher

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    // starts in main thread
    println("root              : ${Thread.currentThread()} ${this.coroutineContext}")

    withContext(CoroutineName("A")) { // continues in the same thread, but overrides coroutine name in context
        println("coroutine A       : ${Thread.currentThread()} ${this.coroutineContext}")

        withContext(Dispatchers.IO) { // jumps to IO thread pool
            println("coroutine A->IO   : ${Thread.currentThread()} ${this.coroutineContext}")
        }
    }
    // returns back to the main thread, after IO operation is done
    println("root again        : ${Thread.currentThread()} ${this.coroutineContext}")
}