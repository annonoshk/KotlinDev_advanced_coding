package delegation

/*
 * Description : A delegate from within

Figure out the relation between classes and interfaces and then complete the implementation of the ErrorHandler class, which relies on the implementation of the ILogHolder interface. Currently, it lacks a proper delegate and the function logErrorMessage(), which would use the Logger implementation as a delegate to print something when it's called from main().

Sample Input 1:

Sample Output 1:

> Logger initialized.
> Access denied
> Out of memory
> I'm not an error

Write a program in Kotlin

*/

/* Do not change the code below */

// ILogHolder is an interface that defines methods for printing and collecting logs,
// and a property for holding the current log
interface ILogHolder {
    fun printLog()
    fun collectLog(log: String)
    var curLog: String
}

// Logger is a class that implements the ILogHolder interface
class Logger : ILogHolder {
    // Print the current log
    override fun printLog() {
        println(curLog)
    }

    // Collect a log message and add it to the current log
    override fun collectLog(log: String) {
        curLog += "\n> $log"
    }

    // Initialize the current log
    override var curLog: String = "> Logger initialized."
}
/* Do not change the code above */

// Introduce the delegate here, following the argument declaration
class ErrorHandler(base: ILogHolder) : ILogHolder by base // Your code here
{
    var errorMessage: String = "" // Current error message

    // Get an error message and log it
    fun getErrorMessage(msg: String) {
        errorMessage = msg
        logErrorMessage(errorMessage)
    }
    fun logErrorMessage(msg: String) {
        collectLog(msg)
    }
    // Implement here logErrorMessage() that adds the error message to the log
}

// Function to simulate some operations and generate error messages
fun doSomething(handler: ErrorHandler) {
    handler.getErrorMessage("Access denied")
    handler.getErrorMessage("Out of memory")
    handler.getErrorMessage("I'm not an error")
}

fun main() {
    val log = Logger() // Create a Logger object
    val handler = ErrorHandler(log) // Create an ErrorHandler object with the Logger object as a delegate

    doSomething(handler) // Do some operations and generate error messages

    handler.printLog() // Print the error log
}