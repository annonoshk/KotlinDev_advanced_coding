package coroutines

import kotlinx.coroutines.cancel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

/*
 * Connecting...
Imagine that you're trying to fetch data from a database. Firstly,
you need to make a connection using connectToDb(), after that you can fetch the data using fetchData().

Here we use the measureTimeMillis function for measuring time.

If the total time of connection and fetching is greater than 100,
you need to cancel the whole coroutine scope and print I'm tired of waiting! Closing the connection....

Add the functionality to the existing code.
 */
suspend fun workingWithDb(): Unit = coroutineScope {
    val timeInMillis = measureTimeMillis {
        launch { cconnectToDb() }
        launch { fetchData() }

    }

    if (timeInMillis > 100) {
        // write your code here
        this.coroutineContext.cancel()// write your code here
    }
}

fun fetchData() {
    TODO("Not yet implemented")
}

fun cconnectToDb() {
    TODO("Not yet implemented")
}
