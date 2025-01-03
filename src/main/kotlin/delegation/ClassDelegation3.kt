/*
 * Fresh from the lines
Medium
159
14 minutes ago
Below is program code, in which the Counter class delegates the implementation of the following Increment interface:
 */


package delegation

interface Increment {
    fun increment()
}

class IncrementHandler(private val counter: Counter1) : Increment {
    override fun increment() {
        counter.count++
    }
}
class Counter1(var count: Int, incrementHandlerFactory: (Counter1) -> Increment) : Increment {
    private val incrementHandler: Increment = incrementHandlerFactory(this)
    override fun increment() {
        incrementHandler.increment()
    }
}

fun main() {
    val counter1 = Counter1(0) { IncrementHandler(it) }
    for (i in 1..5) {
        counter1.increment()
        println("Count: ${counter1.count}")
    }
}

