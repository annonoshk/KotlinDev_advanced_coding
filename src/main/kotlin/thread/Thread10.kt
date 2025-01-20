package thread

import kotlin.concurrent.thread

/*
 * String processor
Write a thread with the name stringProcessor by using the method thread().
The class must have a method that reads strings (line by line) from the standard input.
If a read string has a lower case character, the processor must output the string in the upper case;
otherwise, the processor must output "FINISHED" and stop the processing.

Sample Input 1:

Multithreading
Concurrency
Parallel
PROGRAMMING

Sample Output 1:

MULTITHREADING
CONCURRENCY
PARALLEL
FINISHED
 */

fun main() {
    val stringProcessor = thread(block = {
        while (true) {
            val input = readLine() ?: break
            if (input.any { it.isLowerCase() }) {
                println(input.uppercase())
            } else {
                println("FINISHED")
                break
            }
        }
    })
    stringProcessor.join() // Wait for the thread to finish
}
