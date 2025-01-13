package pairTriple

/*
 * Personal Info
Write a whole program that reads a person's name and his/her age and then prints a Pair with the respective personal details.

Sample Input 1:

Joe 21

Sample Output 1:

(Joe, 21)

Sample Input 2:

Anne 23

Sample Output 2:

(Anne, 23)
 */

fun main() {
    // put you code here
    val (name, age) = readln()!!.split(' ')
    val pairResult = Pair(name,age.toInt())
    println(pairResult)
}