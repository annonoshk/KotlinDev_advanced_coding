package coroutines

import kotlinx.coroutines.*

suspend fun loadImage(name: String) {
    delay(50) // imitate long-running operation
    println("Loaded $name")
}

suspend fun preCache(name: String) {
    delay(100) // imitate long-running operation
    println("Cached $name")
}

@OptIn(DelicateCoroutinesApi::class)
suspend fun loadScreenInGlobalScope() {
    GlobalScope.launch { loadImage("image_1") }
    GlobalScope.launch { loadImage("image_2") }
    GlobalScope.launch { preCache("image_3") }
    throw Exception("Unexpected failure") // simulate crash in main code
}

suspend fun main() {
    runCatching { // shortcut to ignore all exceptions with try/catch
        loadScreenInGlobalScope()
    }
    delay(200) // wait long enough to see the results
}