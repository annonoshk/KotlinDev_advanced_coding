package euclideanDivision

/*
 * dividend = divisor * quotient + remainder

Now, let's understand how to get the quotient and remainder values with the dividend = 16 and the divisor = 5.
 */

fun main() {
    val quotient1 = 16 / 5
    val remainder1 = 16 % 5
    val divisor1 = 5

    println("The quotient is: " + quotient1) // The quotient is: 3
    println("The remainder is: " + remainder1) // The remainder is: 1
    println("The dividend = " + (divisor1 * quotient1 + remainder1) +"\n" + "negative numbers\n")


//Division with negative numbers

    val quotient2: Int  = -13 / 4
    val remainder2: Int = -13 % 4

    println("The quotient is: " + quotient2) // The quotient is: -3
    println("The remainder is: " + remainder2) // The remainder is: -1
    println("The dividend = " + (4 * (-3) + (-1))) // The dividend = -13

    println(11 / -4)   // prints -2
    println(11 % -4)   // prints 3
    println(-11 / 4)   // prints -2
    println(-11 % 4)   // prints -3
    println(-11 / -4)  // prints 2
    println(-11 % -4)  // prints -3

    println((-12).floorDiv(5)) // -3
    println((-12).mod(5))      // 3

    println(11.floorDiv(4))     // prints 2
    println(11.mod(4))          // prints 3
    println(11.floorDiv(-4))    // prints -3
    println(11.mod(-4))         // prints -1
    println((-11).floorDiv(4))  // prints -3
    println((-11).mod(4))       // prints 1
    println((-11).floorDiv(-4)) // prints 2
    println((-11).mod(-4))      // prints -3

    val n = 12345
    println("${8.mod(-3)} ${8 % (-3)} ${8.floorDiv(-3)}")

}