package coroutines.exception

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


fun main() {


}
fun stateException() {
    val handler = CoroutineExceptionHandler { _, exception ->
        // Your code here to handle the exception
        println("Scope failed")
    }

    val scope = CoroutineScope(Job() + handler)

    // Launch a coroutine that throws an IllegalStateException
    scope.launch(handler) {
        throw Exception("IllegalStateException")
    }


}