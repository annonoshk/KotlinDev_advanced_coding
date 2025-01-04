package foldReduce

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    // fold uses the parameter as the initial value of the accumulator
    var sum = list.foldRight(0) { i, acc ->
        println("acc: $acc, i: $i, acc + i: ${acc + i}")
        acc + i
    }
    println(sum) // 15

    var product = list.foldRight(1) { i, acc ->
        println("acc: $acc, i: $i, acc * i: ${acc * i}")
        acc * i
    }
    println(product) // 120

    // reduce uses the first element as the initial value of the accumulator
    sum = list.reduceRight() { acc, i ->
        println("acc: $acc, i: $i, acc + i: ${acc + i}")
        acc + i
    }
    println(sum) // 15

    product = list.reduceRight() { acc, i ->
        println("acc: $acc, i: $i, acc * i: ${acc * i}")
        acc * i
    }
    println(product) // 120
}