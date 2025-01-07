package operatorOverloading

operator fun String.unaryMinus() = this.reversed()
operator fun String.unaryPlus() = this.uppercase()
operator fun String.not() =  "!" + this
operator fun String.inc() = this+this
operator fun Pair<Int, Int>.unaryMinus() = Pair(-first, -second)
operator fun Pair<Int, Int>.inc() = Pair(first + 1, second + 1)
operator fun Pair<Int, Int>.plus(other: Pair<Int, Int>) =
    Pair(first + other.first, second + other.second)
operator fun Pair<Int, Int>.contains(n: Int) = n in first..second

operator fun Pair<Int, Int>.get(n: Int) = when (n) {
    0 -> first
    1 -> second
    else -> throw IndexOutOfBoundsException()
}
operator fun Pair<Int, Int>.invoke(newLine: Boolean) {
    print("($first, $second)")
    if (newLine) println()
}

operator fun Pair<Int, Int>.invoke(plus:Int, newLine: Boolean) {
    print("(${first+plus},${second+plus})")
    if (newLine) println()
}
operator fun StringBuilder.plusAssign(other: String) {
    this.append(other)
}

class Point7(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Point7) {
            return other.x == x && other.y == y
        }
        return false
    }
}

class Point8(val x: Int, val y: Int) : Comparable<Point8> {
    override fun compareTo(other: Point8): Int {
        return if (x == other.x) y.compareTo(other.y) else x.compareTo(other.x)
    }
}

infix operator fun String.times(n: Int) = this.repeat(n)

fun main() {
    val name = "Kotlin"
    println(-name) // niltoK
    println(+name)
    println(!name)
    println(name)
    val s = "Kotlin"
    println(s * 3) //KotlinKotlinKotlin

    var p = Pair(1, 2)
    println(-p) // (-1, -2)
    println(++p) // (2, 3)

    var point1 = Pair(1, 2)
    var point2 = Pair(3, 4)
    println(point1 + point2) // (4, 6)

    var point3 = Pair(1, 2)
    println(1 in point3) // true

    var point4 = Pair(1, 2)
    println(point4[0]) // 1
    println(point4[1]) // 2

    var point5 = Pair(1, 2)
    point5(true) // (1, 2)

    var point6 = Pair(1,10)
    point6(1, true)

    val name2 = StringBuilder("Kotlin")
    name2 += " is awesome"
    println(name2) // Kotlin is awesome

    val p7 = Point7(1, 2)
    val p8 = Point7(1, 2)
    println(p7 == p8) // true

    val p1 = Point8(1, 2)
    val p2 = Point8(1, 2)
    println(p1 < p2) // false
    println(p1 <= p2) // true
    println(p1 >= p2)
}
