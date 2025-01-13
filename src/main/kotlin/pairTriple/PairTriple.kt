package pairTriple

import java.awt.Component


/*
 * Resume with marks
You are given a Triple <String, Int, List<Double>> that represents the name of a student, the course number, and the marks received. Write a function named resume that receives this Triple and returns a new Pair as a resume with the student's name and the average of the marks.

Sample Input 1:

(Anne, 2, [8.0, 7.0, 9.0])

Sample Output 1:

(Anne, 8.0)
*/

fun resume(marks: Triple<String, Int, List<Double>>): Pair<String, Double> {
    // write your code here
    return Pair(marks.first, marks.third.average())
}
fun revert(pair: Pair<String, String>): Pair<String, String> {
    return Pair(pair.component2(),pair.component1())

}

fun isReversed(pair: Pair<String, String>): Triple<String, String, Boolean> {
    return Triple(pair.component1(),pair.component2(),pair.first.reversed() == pair.second)
}

fun main() {
    while(true) {
        val input = readln().split(" ")
        if(input[0] == "stop") break
        val inputPair = Pair(input[0],input[1])
        val triple = Triple("Anne", 2, listOf(8.0, 7.0, 9.0))
        println(resume(triple))
        println(revert(inputPair))
        println(isReversed(inputPair))
    }

}