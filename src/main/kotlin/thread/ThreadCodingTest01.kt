package thread

/*
 * Calculate the number of distinct characters
Below is the code that reads a string from the standard input and calculates the number of distinct characters in the string.
For some reason, the developer Rebecca decided to perform calculations in a new thread. Sadly,
her solution doesn't work correctly. Try to fix it.

Additional explanations: the implemented class SlowStringProcessor extends Thread and overrides the method run().
It calculates the number of distinct characters passed to the constructor.
The class has a field NumberOfUniqueCharacters that contains the calculated number or 0
if the thread has not calculated the number yet.
Keep in mind that SlowStringProcessor works quite slow.

Sample Input 1:

multithreading

Sample Output 1:

12
 *
 */

// Fix this function
fun main() {
    val str: String = readLine()!!
    val processor = SlowStringProcessor(str)
    processor.start()
    processor.join()
    println(processor.numberOfUniqueCharacters)
}

// do not change the code below

val mainThreadId = Thread.currentThread().id

class SlowStringProcessor(val s: String) : Thread() {
    @Volatile
    var numberOfUniqueCharacters: Int = 0
        private set

    override fun run() {
        val currentId = currentThread().id
        if (currentId == mainThreadId) {
            throw RuntimeException("You must start a new thread!")
        }
        try {
            sleep(2000)
        } catch (e: Exception) {
            throw RuntimeException("Do not interrupt the processor", e)
        }
        numberOfUniqueCharacters = s.split("").filter { it != "" }.toTypedArray().distinct().size
    }
}