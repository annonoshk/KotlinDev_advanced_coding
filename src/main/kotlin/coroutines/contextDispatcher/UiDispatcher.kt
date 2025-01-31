package coroutines.contextDispatcher

import coroutines.loadData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/*
 * Load data in IO pool and print in UI thread
Let's replicate a very common patten in UI applications: load some data, wait for it to enter the IO thread without blocking the UI, then display it in the UI thread, and let the IO code do its job.

There is no Dispatchers.Main available for our console app, so use UiDispatcher instead.

Tip: launch() can take any context element as a parameter, so use it to set the right dispatcher.
 */

/*
fun main() = runBlocking(Dispatchers.Default) {
    // Modify this code to make sure data loading and storing
    // happens in Dispatchers.IO, but data printing in `UiDispatcher`
    // which is already defined for you as a replacement for Dispatchers.Main
    val mainJob = mainScope.launch {
        val data = withContext(Dispatchers.IO) {
            loadData()
        }
        withContext(UiDispatcher) {
            printData(data)
        }
        withContext(Dispatchers.IO) {
            storeData(data)
        }
    }
    mainJob.join()
}
*/
