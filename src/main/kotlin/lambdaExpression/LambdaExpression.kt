package lambdaExpression



fun sum(a:Int, b:Int) = a + b
val sum2: (Int,Int) -> Int = { a: Int, b:Int -> a + b }
val mul2 = { a: Int, b: Int -> a * b }
val mod2 = { a: Int, b: Int -> a % b }
val div2 = { a: Int, b: Int -> if (b != 0) a / b else throw IllegalArgumentException("b must not be zero") }


fun placeArgument(value: Int, f: (Int, Int) -> Int): (Int) -> Int {
    return { i -> f(value, i) }
}
fun main() {
    val originalText = "I don't know... what to say...123456" 
    val textWithoutSmallDigits = originalText.filter {
        /*        val isNotDigit = !it.isDigit()
        val stringRepresentation = it.toString()

        isNotDigit || stringRepresentation.toInt() >= 5
        */
        if (!it.isDigit()) {
            return@filter true
        }

        it.toString().toInt() >= 5
    }
    println(textWithoutSmallDigits)

    val increment = placeArgument(1, ::sum)
    println(placeArgument(10,::sum)(4))
    val triple = placeArgument(3, mul2)
    val division = placeArgument(5, div2)


    println(increment(4))   // 5
    println(increment(40))  // 41
    println(triple(4))      // 12
    println(triple(40))     // 120
    println(division(5))
    println(division(4))
}

