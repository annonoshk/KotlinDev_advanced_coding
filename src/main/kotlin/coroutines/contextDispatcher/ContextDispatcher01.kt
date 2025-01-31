package coroutines.contextDispatcher

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

/*
fun main() {
    val supervisedScope = CoroutineScope(SupervisorJob())

    println(supervisedScope)
}*/

val handler01 = CoroutineExceptionHandler { _, exception ->
    println("Caught ${exception.message}")
}

fun main() {
    val supervisedScope = CoroutineScope(SupervisorJob() + handler01)

    println(supervisedScope)
}
