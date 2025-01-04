package foldReduce

fun main() {
    // empty list
    val emptyList = listOf<Int>()

    // fold uses the parameter as the initial value of the accumulator
    val sum = emptyList.fold(0) { acc, i ->
        println("acc: $acc, i: $i, acc + i: ${acc + i}")
        acc + i
    }
    println(sum) // 0

    // with fold you can change the type of the accumulator
    val list2 = listOf("a", "b", "c", "d", "e")
    val string = list2.fold(StringBuilder()) { acc, s ->
        acc.append(s)
        
    }
    println(string) // abcde
}