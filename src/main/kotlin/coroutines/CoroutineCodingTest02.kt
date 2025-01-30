package coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    val connectToServerJob = GlobalScope.launch {
       doAllTheJob02()
    }
}
fun doAllTheJob02() {
    runBlocking { connectToServer() }
}