package aggregateCollection

fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.maxByOrNull { it.length > 7 }

    println(res)
}