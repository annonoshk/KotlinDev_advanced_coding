package coroutines.exception

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

val handler = CoroutineExceptionHandler { _, exception ->
    println("Coroutine Exception Handled: $exception")
}

fun main() {
    val scope = CoroutineScope(Job())

    scope.launch(handler) { // Coroutine body with exception handler in context
        throw Exception("Coroutine exception")
    }
}
