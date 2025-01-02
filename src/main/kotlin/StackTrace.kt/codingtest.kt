package StackTrace.kt

fun demoList(input: String) {
    val inputList = input.split(" ")
    println(inputList[-1])
}

fun main() {
    val input = "110 111 32 101 114 114 111 114 32 59 41".split(" ")
    input.forEach { print(it.toInt().toChar()) }


    val input2 = "1 2 3 4 5 6 7 8 9 10"
  //  demoList(input2)

    val demoArray = intArrayOf(0, 1, 2, 3, 4, 5)
    println(demoArray[10])
}
