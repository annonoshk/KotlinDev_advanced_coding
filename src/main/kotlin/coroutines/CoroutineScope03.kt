package coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

suspend fun loadImage03(name: String) {
    if (name.endsWith("2")) {
        throw Exception("Error loading image")
    }
    delay(50) // imitate long-running operation
    println("Loaded $name")
}

// ... the rest is the same

suspend fun loadScreenInOwnScope03(): Unit = coroutineScope {
    launch { loadImage03("image_1") }
    launch { loadImage03("image_2") }
    launch { preCache("image_3") }
}
suspend fun loadScreenInSupervisedScope() = supervisorScope {
    val job1 = launch { loadImage03("image_1") }
    val job2 = launch { loadImage03("image_2") }
    val job3 = launch { throw Exception("Fail optional job") }
}

suspend fun main() {
    runCatching { // catch all exceptions
     //   loadScreenInOwnScope()
        loadScreenInSupervisedScope()
    }
    delay(200) // wait long enough to see the results
}