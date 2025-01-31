package coroutines.contextDispatcher

import kotlinx.coroutines.*

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
fun main() {
    runBlocking {
        launch { // context of the parent, main runBlocking coroutine
            println("main         : ${Thread.currentThread()}")
        }
        launch(Dispatchers.Unconfined) { // will work on main thread, then on another one
            println("Unconfined A : ${Thread.currentThread()}")
            delay(1)            // suspension point
            println("Unconfined B : ${Thread.currentThread()}")
        }
        launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
            println("Default      : ${Thread.currentThread()}")
        }
        launch(newSingleThreadContext("MyThread1")) { // will get its own new thread
            println("new thread 1 : ${Thread.currentThread()}")
        }
        launch(newSingleThreadContext("MyThread2")) { // will get a different new thread
            println("new thread 2 : ${Thread.currentThread()}")
        }
    }
}   