package pairTriple

/*
 * Sum of two maps
You are given two Pairs (Pair<Int,Int>) as input. Write a function named lambdaExpression.getSum() that receives two integer Pairs and returns a new Pair with the lambdaExpression.getSum of the two pairs. The lambdaExpression.getSum is obtained as the lambdaExpression.getSum of the respective components.

Sample Input 1:

1 2
3 4

Sample Output 1:

(4, 6)

Sample Input 2:

-1 1
1 -1

Sample Output 2:

(0, 0)
 */

fun sum(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Pair<Int, Int> {
    // write your code here
    return Pair(p1.first + p2.first, p1.second + p2.second)
}

/* Do not change code below */
fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val (c, d) = readLine()!!.split(' ').map { it.toInt() }
    val pairOne = Pair(a, b)
    val pairTwo = Pair(c, d)
    println(sum(pairOne, pairTwo))
}