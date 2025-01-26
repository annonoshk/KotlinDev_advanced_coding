package thread

fun main() {
    val thread: Thread = thread(start = true, block = {})
    println(thread.state)
}