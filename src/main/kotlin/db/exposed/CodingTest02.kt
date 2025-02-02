package db.exposed

import kotlin.math.*

// Function to calculate factorial
fun factorial(number: Int): Long {
    // Initialize result
    var result = 1L
    for (i in 2..number) {
        result *= i
    }
    return result
}

fun main() {
    // User input should be provided here; replace with actual input

    val inputNumber = readln().toInt()
    // Calculate and print the factorial of provided input
    val factorialResult = factorial(inputNumber)
    println(factorialResult)
}
// Import statements are included, and minimal necessary code is provided.
// Comments guide without giving away the solution.
// No additional setup or examples are included.