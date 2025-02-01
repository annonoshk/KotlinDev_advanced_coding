package bigDecimal

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
/*    val firstBigDecimal = BigDecimal("10000000000000.5897654329")
    val secondBigDecimal = BigDecimal(readln()) // Store the input number

    val bigDecimal1 = BigDecimal(1.000000000000059E13)

    val number = 100000.50000
    val bigDecimal2 = number.toBigDecimal()*/

    println(0.1 + 0.2)

    var first = BigDecimal("0.2")
    val second = BigDecimal("0.1")

    val addition = first + second   // 0.3
    val subtraction = first - second   // 0.1
    val multiplication = first * second // 0.02
    val division = first / second   // 2.0
    val remainder = first % second // 0.0

    // decrement
    val decrement = --first //  -0.8
    // increment
    val increment = ++first //  0.2
    // unary minus, turning to opposite sign
    val reverse = -first  //  -0.2
    // absolute value
    val module = first.abs()  //  0.2
    // raise to the power, works only with Int
    val power = first.pow(3)

    var number = BigDecimal("2.001")
    number += BigDecimal.ONE
    number = -number
    number.setScale(1, RoundingMode.HALF_DOWN)
    print(number)
}
