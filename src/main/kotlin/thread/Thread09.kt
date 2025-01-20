package thread

/*
 * Starting runnables
Implement a method that takes an array of runnables.
The method must start each runnable in a new thread.
*/

fun startRunnables(runnables: Array<Runnable>) {
    // implement the method
    runnables.forEach { runnable ->
        Thread(runnable).start()
    }
}

