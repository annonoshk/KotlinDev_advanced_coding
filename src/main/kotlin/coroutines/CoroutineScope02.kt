package coroutines

import kotlinx.coroutines.*


@OptIn(DelicateCoroutinesApi::class)
suspend fun loadScreenInOwnScope(): Unit = coroutineScope {
    launch { loadImage("image_1") }
    launch { loadImage("image_2") }
    launch { preCache("image_3") }
    //delay(75)
    //throw Exception("Unexpected failure") // simulate crash in scope
    this.coroutineContext.cancel()
}
suspend fun doSelfCancelingJob() = coroutineScope {
    launch { preCache("image_3") }
    for (i in 1..10) {
        println("Running long operation for ${i * 10}ms")
        delay(10)
        if (i == 5) {
            this.coroutineContext.cancel()
        }
    }
}
suspend fun main() {
    runCatching { // catch all exceptions
     //   loadScreenInOwnScope()
        doSelfCancelingJob()
    }
    delay(200) // wait long enough to see the results
}