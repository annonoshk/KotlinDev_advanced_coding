package sam

import java.util.function.Predicate

class View() {}

fun interface ClickListener {
    fun onClick(view: View)
}

val clickListener = ClickListener { view ->
    // Handle click event
}

/*
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}
*/

fun <T> filter(numbers: List<T>, predicate: Predicate<T>): List<T> {
    return numbers.filter { predicate.test(it) }
}


fun comparator(): Comparator<Int> {
    return Comparator { a, b -> a - b }
}

fun main() {
  //  val isEven = IntPredicate { it % 2 == 0 }
    val isOdd =  Predicate<Int> { it % 2 != 0 }
    val isEven = Predicate<Int> { it % 2 == 0 }

    val evenNumbers = filter(listOf(1, 2, 3, 4), isEven)
    val oddNumbers = filter(listOf(1, 2, 3, 4), isOdd)

    println(evenNumbers) // output: [2, 4]
    println(oddNumbers)
    // return function as a value



    val compareInts = comparator()

    println(compareInts.compare(10, 2)) // output: 8

}
