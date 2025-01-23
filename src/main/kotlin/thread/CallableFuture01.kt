package thread

import java.util.concurrent.*

val generator = Callable {
    TimeUnit.SECONDS.sleep(5)
    70000
}

fun main() {
    println(generator.call()) // after 5 seconds, 70000 will be printed
}