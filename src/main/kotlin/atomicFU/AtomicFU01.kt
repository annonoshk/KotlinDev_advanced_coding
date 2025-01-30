package atomicFU

import kotlinx.atomicfu.atomic
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val counter = atomic(0)

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    runBlocking {
        val coroutines = List(100) {
            GlobalScope.launch {
                for (i in 1..1000) {
                    counter.incrementAndGet()
                   // println(counter)
                }
            }
        }
        coroutines.forEach { it.join() }

        println(counter.value) // Should print 100000

    }
}