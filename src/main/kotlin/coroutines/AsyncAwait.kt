package coroutines

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    val deferred:
    Deferred <String> = async  { "Hello, " }
    val result: String = deferred.await() + "World!"
    println(result)
}