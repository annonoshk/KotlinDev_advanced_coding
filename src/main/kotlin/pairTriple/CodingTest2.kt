package pairTriple

fun sum(triple: Triple<Int, Int, Int>): Int {
    // write your code here
    return triple.first + triple.second + triple.component3()
}