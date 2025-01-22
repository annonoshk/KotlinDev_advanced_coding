package thread

class MyCustomThread : Thread() {
    override fun run() {
        throw NumberFormatException("This is a custom NumberFormatException")
    }
}

fun main() {
    val thread = MyCustomThread()
    try {
        thread.start()
        thread.join()
    } catch (e: NumberFormatException) {
        println("Caught exception: ${e.message}")
    }
}
