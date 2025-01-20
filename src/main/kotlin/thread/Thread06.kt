package thread

/*
 * Writing a thread for printing numbers
Write a class named NumbersThread that extends the Thread class.
The class must have a constructor that takes two integer numbers from and to as range borders.

Implement the method run. It must print all numbers from the given range (inclusive) to the standard output.

Use the provided template.

Sample Input 1:

1 3

Sample Output 1:

1
2
3
 */
class NumbersThread(private val from:Int, private val to: Int) : Thread() { //implement the constructor
    override fun run() {
        (from..to).forEach(::println)
    }
/*    val range = from..to
    override fun run() {

        for(i in range) {
            println(i)
        }
    }*/
}

fun main() {
    val t1: Thread = NumbersThread(0,21)
    t1.start()
}