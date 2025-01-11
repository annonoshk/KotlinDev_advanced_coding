package lambdaExpression

/*
 * Big function
Create a function called bigFunction that takes two arguments:

1. An integer (Int).
2. Another function that takes two integers (Int) as arguments and returns an integer (Int).
Your bigFunction should return a function ((Int) -> Int) that transforms the second argument function so that it takes a single argument instead of two arguments.

Write a program in Kotlin
 */

class Solution3 {
    fun bigFunction(value: Int, transform: (Int, Int) -> Int): (Int) -> Int {
        return { i: Int -> transform(value, i) }
    }
}

fun main() {
    val solution = Solution3()
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val addFive = solution.bigFunction(5, add)
    println(addFive(10)) // Output: 15
}
