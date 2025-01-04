package foldReduce

fun exe1() {
    val list = readln().split(" ")
    // write your code here
    val res = list.filterIndexed { index, _ -> index % 2 == 0 }
    .sumOf { it.length }

    println(res)
}


fun main() {
/*    val list = readln().split(" ").map { it.toDouble() }
    // write your code here
    val res = list.average()


    println(res)*/
    //exe1()
    val names = listOf("Alice", "Bob", "Carol", "Dave", "Eve")
    val sum = names.fold(0) { acc, name ->
            if (name.length >= 3) acc + name.length else acc
        }
    println(sum)
}

