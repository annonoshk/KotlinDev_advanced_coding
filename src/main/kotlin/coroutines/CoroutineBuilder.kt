package coroutines

import kotlinx.coroutines.delay // kotlinx.coroutines is the primary package for coroutines
import kotlinx.coroutines.runBlocking

// pretend we're busy here, there would be some long operation in real-life code
// but delay() is a suspending function so it's a fair example
suspend fun doLotsOfWorkWithFile(file: String) = delay(5_000)

fun main() {
    runBlocking {
        println("Preparing for hard work...")
        doLotsOfWorkWithFile("a") // compilation error here ! }
        doLotsOfWorkWithFile("b")
    }

    println("Work is done!")
}