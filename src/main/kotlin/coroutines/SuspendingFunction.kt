package coroutines

fun loadFile(): ByteArray {
    return ... // long operation, actual code skipped for brevity
}

fun calculateChecksum(fileData: ByteArray): String {
    return ... // another long operation, actual code skipped for brevity
}

fun main() {
    for (i in 1..10_000) {
        val fileData = loadFile()
        val checksum = calculateChecksum(fileData)
        println(checksum)
    }
}

/*
 * import kotlinx.coroutines.*

suspend fun loadFile(): ByteArray { // now it's a suspending function
    return ... // long operation
}

suspend fun calculateChecksum(fileData: ByteArray): String { // another suspending
    return ... // long operation
}

// 'runBlocking' and 'async' build coroutines, we'll learn about it in the next topic
//  so far you need to know that everything inside one of these builders is a coroutine
fun main() = runBlocking {
    for (i in 1..10_000) { // now we can have even more operations running concurrently
        async {            // async schedules background execution of a given coroutine
            val fileData = loadFile()
            val checksum = calculateChecksum(fileData)
            println(checksum)
        }
    }
} 
 */