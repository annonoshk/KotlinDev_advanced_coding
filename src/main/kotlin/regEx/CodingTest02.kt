package regEx

val regex1 = "\\+3[4567][1-9]".toRegex()
val regex2 = "1[456][7-9]1".toRegex()


fun main() {
    println("+34".matches(regex1))
    println("+370".matches(regex1))
    println("+377".matches(regex1))
    println("+353".matches(regex1))

    println("1451".matches(regex2))
    println("1471".matches(regex2))
    println("1681".matches(regex2))
    println("145781".matches(regex2))

}