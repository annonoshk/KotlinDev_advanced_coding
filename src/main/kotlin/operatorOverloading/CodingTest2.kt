package operatorOverloading
/*
 * Hacking the Matrix

Neo is trying to hack the Matrix. He has a list of codes, and to solve this challenge, he must invoke the list and return the sum of the elements that are divisible by a certain code. For example:

val listOfInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
println(listOfInt(5))

In this case, when running the snippet above, the output should be 15.

Write a program in Kotlin
 Report a typo
Code Editor
IDE
1
2
3
4

 */

// define the function
operator fun List<Int>.invoke(code: Int): Int {
    return this.filter { it % code == 0 }.sum()
// and write your code here
}

fun main() {
    val listOfInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listOfInt(5))
}