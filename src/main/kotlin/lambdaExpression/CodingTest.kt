package lambdaExpression
/*
 * Filter long strings
Write a function named filterLongStrings that takes a list of strings as input and returns a new list containing only the strings that have a length greater than or equal to a given length.

Write a program in Kotlin


 */
class Solution {
    fun filterLongStrings(strings: List<String>, length: Int): List<String> {
        // Your code here
        return strings.filter { it.length >= length }
    }
}

fun main() {
    val list = listOf("Huck","Jeon","Eum")
    val solution = Solution()
    println(solution.filterLongStrings(list,4))
}