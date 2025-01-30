package coroutines

import kotlinx.coroutines.runBlocking

/*
 * Server job
Our job is to connect to the server and load some data from it.
We already have convenient functions connectToServer and loadData implemented and imported for us.
All we need to do is call them in the right order.
We also need to make sure that loading starts after the connection is established (when function connectToServer returns).

Both connectToServer and loadData are suspending functions, so we'll need to use a builder to call them.

Write a program in Kotlin
 */
fun doAllTheJob() {
    // put your code here

    runBlocking {
        connectToServer()
        loadData()
    }// use suspending functions
    // connectToServer() and loadData()
}

fun loadData() {
    TODO("Not yet implemented")
}

fun connectToServer() {
    TODO("Not yet implemented")
}

fun validateConnection() {
    runBlocking {
        connectToServer()
    } // suspending function that doen't compile now
}