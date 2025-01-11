package sam
/*
 * Implementing the interface using a lambda expression
We have defined a functional interface called NumberPredicate with one abstract method, accept(), which takes an integer parameter and returns a boolean.

Use a lambda expression to implement this interface, enabling the filtering of even numbers from a list. In the main function, read a line of input representing space-separated integers, turn them into a list, and utilize the 'NumberPredicate' implementation to filter and print the even numbers.

Sample Input 1:

5 4 3 8

Sample Output 1:

4 8
 */

fun interface NumberPredicate {
    fun accept(n: Int): Boolean
}

fun main() {
    val isEven = NumberPredicate { it % 2 == 0 }
    val inputList = readln()!!.split(" ").map { it.toInt() }
    println(inputList.filter { isEven.accept(it) }.joinToString(" "))

    // make your code here
}