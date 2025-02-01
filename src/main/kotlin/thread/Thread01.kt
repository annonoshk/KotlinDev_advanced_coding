import kotlin.concurrent.thread

fun main() {
    val t: Thread = Thread.currentThread() // main thread

    println("Name: ${t.name}")
    @Suppress("DEPRECATION")
    println("ID: ${t.id}")
    println("Alive: ${t.isAlive}")
    println("Priority: ${t.priority}")
    println("Daemon: ${t.isDaemon}")
}