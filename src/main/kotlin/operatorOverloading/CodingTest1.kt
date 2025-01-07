package operatorOverloading

operator fun String.div(number: Int): Int {
    return this.toInt() / number
}
operator fun StringBuilder.timesAssign(n: Int) {
    this.append(this.toString().repeat(n - 1))
}

operator fun String.contains(n: Int) = n in 0..this.length

fun main() {
    println("13" / 8) // Output: 1
    println("12" / 2) // Output: 6

    val sb = StringBuilder("Kotlin")
    sb *= 3
    println(sb)

    val s = "Kotlin"
    println(1 in s)
}

/*
// define the function
*/
/*?*//*
(number: Int): Int {
    // and write your code here
}*/
