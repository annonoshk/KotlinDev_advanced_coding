/*
 * The average of your scores

We have a list of scores from your Kotlin tests. Please obtain the average of your scores.

Sample Input 1:

10.0 9.5 8.0 7.5 6.0 5.5

Sample Output 1:

7.75
 *
 */


package aggregateCollection

fun main() {
    val list = readln().split(" ").map { it.toDouble() }
    // write your code here
        val res = list.average()


    println(res)
}

