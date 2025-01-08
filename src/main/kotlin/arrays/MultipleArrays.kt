package arrays



val arrayOfChar2D = arrayOf(
    charArrayOf('k'),
    charArrayOf('o', 't'),
    charArrayOf('l', 'i', 'n'))

fun main() {
    println(arrayOfChar2D.contentDeepToString())	// [[k], [o, t], [l, i, n]]

    val string = "string"
    val index = readln().toInt()
    if (index <= string.length - 1)
        println(string[index])
    else
        println("The check works, there is no exception.")


    val elements = listOf<String?>(null,"huck","hi")
    println(elements.filterNot { x -> x != null }) // a
    println(elements.filterIsInstance<String>()) // b
    println(elements.partition { it == null }.first)  // c


}