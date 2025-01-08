package aggregateCollection

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val words = listOf("anne", "michael", "caroline", "dimitry", "emilio")

    //maxOrNull/minOrNull()
   /* println(numbers.maxOrNull()) //10
    println(numbers.minOrNull()) //1

    // maxByOrNull/minByOrNull
    println(words.maxByOrNull { it.length }) // caroline
    println(words.minByOrNull { it.length }) // anne

    //maxOfOrNull/minOfOrNull
    println(words.maxOfOrNull { it.length }) // 8
    println(words.minOfOrNull { it.length }) // 4

    // maxByOrNull/minByOrNull
    println(words.count { it.length > 5 }) // 4
    println(words.maxByOrNull { it.length > 5 }) // michael
    println(words.minByOrNull { it.length > 5 }) // anne

    // maxWithOrNull/minWithOrNull
    println(words.maxWithOrNull(compareBy { it.length })) // caroline
    println(words.minWithOrNull(compareBy { it.length })) // anne

    // maxOfWithOrNull/minOfWithOrNull
    println(words.maxOfWithOrNull(naturalOrder()) { it.length }) // 8
    println(words.minOfWithOrNull(naturalOrder()) { it.length }) // 4*/
    println(words.minByOrNull { it.length > 5 }) // anne
}