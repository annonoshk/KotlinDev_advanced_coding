package stringBuffer

const val N = 99999999 // Number of iterations for the test

fun main() {
    var time: Long
    var executionTime: Long

    println("For the same task:")

    // Using StringBuffer
    val buffer = StringBuffer()
    time = System.currentTimeMillis() // We save the start time of the task
    for (i in N downTo 1) {
        buffer.append("")
    }
    executionTime = System.currentTimeMillis() - time // We find the execution time of the task
                                                      // by subtracting the start time from the end time
    println("StringBuffer gets it finished in $executionTime ms,")

    // Using StringBuilder
    val builder = StringBuilder()
    time = System.currentTimeMillis()
    for (i in N downTo 1) {
        builder.append("")
    }
    executionTime = System.currentTimeMillis() - time
    println("while StringBuilder gets it finished in just $executionTime ms!")
}