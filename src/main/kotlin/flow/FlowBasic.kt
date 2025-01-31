package flow

import kotlinx.coroutines.flow.flowOf

suspend fun main() {
    val folderSizes = sequence<String> { // sequence builder lambda begins
        val folderNames = "Dir"
        for (folder in folderNames) {
            val size = calculateSize(folder) // long running operation that can block a thread
            yield(size)
        }
    }

    val numbersFlow = flowOf(1, 2, 3, 4) // create flow, the object is still cold

    numbersFlow.collect { print(it) } // collect flow, it will print 1234

    numbersFlow.collect { print(it) } // collect same flow, it will print 1234 again

    // can repeat as many times as needed with the same result
}
/*val folderSizes = flow { // flow builder lambda begins
    for (folder in folderNames) {
        val size = calculateSize(folder) // now it can be a suspending function
        emit(size)
    }
}*/
fun calculateSize(folder: Any): String {
    TODO("Not yet implemented")
}
