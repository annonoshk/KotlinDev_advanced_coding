package nullCollection

val list = listOf<String>()

var nullableList: List<Int>? = listOf<Int>(1, 2, 4, 6)

val listWithNullableElements: List<Int?> = listOf<Int?>(1, 2, 4, null, null)

var absolutelyNullableList: List<Int?>? = listOf<Int?>(1, 2, 4, null, null)

/*val num: Int = listWithNullableElements[1]? ?: 150

val list: List<Int> = nullableList? ?: listOf<Int>()

val num: Int = listWithNullableElements[1]? ?: 150*/

val emptySet: Set<Int>? = setOf()
val nullSet: Set<Int>? = null
val set = setOf<Int?>(null, null)

fun main() {
  //  val list = listOf(0, 1, 2)
    val list1 = listOf<Int>()

    val list = listOf(0, 1, 1, 2, 5, 7, 6)
    val num = list.firstOrNull { it > 3 }
    val num1 = list.lastOrNull { it == 1 }

    val set = setOf<Int?>(null)
    println(set)
    println(set.isNullOrEmpty())
    println("$num, $num1")
    println(list.randomOrNull()) // returns some element
    println(list1.randomOrNull()) // null because the collection is empty
/*
    println(emptySet.isNullOrEmpty()) // true because the collection is empty
    println(nullSet.isNullOrEmpty()) // true because the collection is equal to null
    println(set.isNullOrEmpty()) // false because the collection has two elements with null value*/

}
