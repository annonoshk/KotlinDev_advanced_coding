package coroutines

import kotlinx.coroutines.*


/*
 * import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Starting")
    val importantJob = GlobalScope.launch {
        doLotsOfWorkWithFile("important_file") // waits for 5s
        println("Important file processed")    // will only print after 5s
    }
    val notImportantJob = GlobalScope.launch {
        doLotsOfWorkWithFile("optional_file")  // also waits
        println("Optional file processed")
    }
    println("Finishing")
}                                              // exits immediately, not waiting for background jobs
 */
/*
@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Starting")
    val importantJob = GlobalScope.launch {
        doLotsOfWorkWithFile("important_file") // waits for 5s
        println("Important file processed")
    }
    val notImportantJob = GlobalScope.launch {
        delay(500)                            // add extra delay
        doLotsOfWorkWithFile("optional_file") // so total wait is 5.5s
        println("Optional file processed")
    }
    runBlocking {                             // block main until 6s delay is over
        delay(6_000)                          // by this time both jobs should finish
    }
    println("Finishing")
}                                              // exits immediately, not waiting for background jobs
*/

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    println("Starting")
    val importantJob = GlobalScope.launch {
        doLotsOfWorkWithFile("important_file")
        println("Important file processed")
    }
    val notImportantJob = GlobalScope.launch {
        doLotsOfWorkWithFile("optional_file")
        println("Optional file processed")
    }
    // we still have to use runBlocking because join() is a suspending function
    runBlocking {
        importantJob.join()  // join() suspends until the job is done
    }
    notImportantJob.cancel() // cancel non important job if it's not done yet
    println("Finishing")
}