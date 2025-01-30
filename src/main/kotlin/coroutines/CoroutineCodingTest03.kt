package coroutines
/*
 * Background notifications
Loading data from the server can be a long operation, so we want to entertain a user while the computer is busy loading the content. To do that let's launch a function that writes a message every second that the app is still alive. When the loading is done our app should finish and so should our loading and notification functions.

Start two coroutines. Start `loadData` in a blocking way so the app doesn't finish before it's done. Start `printProgress` in a fire-and-forget way to keep printing the message in the background while the app is running.

Tip: `launch` coroutine builder requires a scope as the receiver, for example `GlobalScope.launch()`
 */
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

import kotlinx.coroutines.*

suspend fun connectToServer3() {
    // Simulate a long-running operation
    delay(2000)
    println("Connected to server")
}

suspend fun loadData3() {
    // Simulate a long-running operation
    delay(5000)
    println("Data loaded")
}

@OptIn(DelicateCoroutinesApi::class)
fun printProgress() {
    GlobalScope.launch {
        while (true) {
            println("Loading...")
            delay(1000)
        }
    }
}

fun main() {
    runBlocking {
        printProgress()
    }

    runBlocking {
        loadData3()
    }

    println("All tasks completed")
}
