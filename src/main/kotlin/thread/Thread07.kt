package thread

/*
 * Message notifier as a thread
Write a service that takes a message and the number of its repetitions as constructor parameters and
prints the message in the standard output the specified number of times.

Use the provided template for your class.

The testing system will start the service as a regular thread.

Sample Input 1:

Hello, Mary
3

Sample Output 1:

Hello, Mary
Hello, Mary
Hello, Mary

Write a program in Kotlin
 */
class MessageNotifier(private val msg: String, private val times: Int ) : Thread() { // implement the constructor
    override fun run() {
        // implement the method to print the message stored in a field
        repeat(times) {
            println(msg)
        }
    }
}
fun main() {
    MessageNotifier("Hello Huck", 4).start()
}