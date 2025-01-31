package coroutines.contextDispatcher

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val handler = CoroutineExceptionHandler { _, exception ->
    println("Caught ${exception.message}")
}

fun main(): Unit = runBlocking(handler) {
    println("root              : ${this.coroutineContext}")
    launch { // uses context of the parent, creates a new job
        println("first             : ${this.coroutineContext}")

        launch { // still same context, another new job
            println("first->same       : ${this.coroutineContext}")
        }

        launch(Dispatchers.Default) { // overrides the dispatcher
            println("first->default    : ${this.coroutineContext}")

            launch(Dispatchers.IO) { // overrides the dispatcher once more
                println("first->default->IO: ${this.coroutineContext}")
            }
        }
    }
}