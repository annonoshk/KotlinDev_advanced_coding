package coroutines.exception

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

val scope = CoroutineScope(Job())

fun main() {
    scope.launch {
        coroutineScope {
            launch { // Child 1
                println("Child 1 finished")
                throw ArithmeticException()
            }
            launch { // Child 2
                println("Child 2 finished")
            }
        }
        println("Parent finished")
    }
}
