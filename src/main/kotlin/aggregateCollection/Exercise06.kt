package aggregateCollection

fun main() {
    val names = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    // Grouping and using aggregate to get the size of the group
    // we don't use the key, so we use "_"
    val groupedNames6 = names.groupingBy { it.first() }
        .aggregate { _, accumulator: Int?, _, first ->
            if (first) 1 else accumulator!! + 1
        }
    println(groupedNames6) // {J=4, M=2, P=2}

    // Grouping and using aggregate, returning even or odd size according to the size of the group
    val groupedNames7 = names.groupingBy { it.first() }
        .aggregate { _, accumulator: Boolean?, element, first ->
            if (first) element.length % 2 == 0 else accumulator!! && element.length % 2 == 0
        }
    println(groupedNames7) // {J=true, M=true, P=false}

}