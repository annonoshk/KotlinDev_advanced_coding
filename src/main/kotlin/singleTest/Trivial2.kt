package singleTest

import lambda.sum

/*
 *Hacking the Matrix
Neo is trying to hack the Matrix. He has a list of codes, but to solve this challenge,
he must write the total sum of the lengths of the codes greater than or equal to 4. Could you please help him?

Sample Input 1:

1234mom daddy4456 god hack me

Sample Output 1:

20
 *
 */

fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.filter { it.length >= 4  }.run { sumOf {it.length}}

    println(res)
}

/*

fun main() {
    val list = readln().split(" ")
    // write your code here
    var sum = 0
    for (code in list) {
        if (code.length >= 4) {
            sum += code.length
        }
    }
    println(sum)
}*/
