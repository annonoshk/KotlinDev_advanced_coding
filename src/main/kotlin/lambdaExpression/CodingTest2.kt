package lambdaExpression

/*
 * Add transformation
Implement the applyTransformation function.
It takes two parameters:
numbers: a list of integers,
transformation: a function that takes an integer as input and returns an integer.
3. The function should apply the transformation to each element in the numbers list.

4. Return a new list containing the transformed values.

Write a program in Kotlin
 */
val mod3 = { a: Int, b: Int -> a % b }
class Solution2 {
    fun applyTransformation(numbers: List<Int>, transformation: (Int) -> Int): List<Int> {
         // make your code here
        return numbers.map(transformation)
    }
}
fun main() {
    val numbers = listOf(1,2,3,4,5)

    val transformation: (Int) -> Int = { it * it }
    val transformedNumbers = Solution2().applyTransformation(numbers, transformation)
    println(transformedNumbers)
}