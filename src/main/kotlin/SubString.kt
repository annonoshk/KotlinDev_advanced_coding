/*Convert a date
Medium
3053
1 day ago
Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.

Sample Input 1:
*/
//fun Int.isEven() = this % 2 == 0




fun main() {
    val input = readln().lowercase()
    (input.indexOf("the") ?: -1).let(::println)



}


enum class Rainbow(val color: String ) {
    RED("Red"),
    ORANGE("Orange")
}

