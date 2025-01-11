package debugger

fun main() {
    // Start profiling session here
    val problematicCode = Thread {
        // Simulate complex operation
        Thread.sleep(1000)
    }
    problematicCode.start()
    problematicCode.join()
    // End profiling session and analyze results
}