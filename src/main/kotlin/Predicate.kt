import kotlin.random.Random

fun shuffledNumbers(numbers: List<Int>): List<Int> {
    return numbers.shuffled(Random(1))
}

// Sample usage
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val winningSequence = shuffledNumbers(numbers)
    println(winningSequence)
}


/*

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    // write your code here
    val res = list.all {it % 2 == 0 && it <= 20}


    println(res)
}*/

/*

fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.any {it.equals( "abracadabra",ignoreCase = true)}


    println(res)

    fun main() {
        val list = readln().split(" ").map { it.toInt() }
        // write your code here
        val res =list.all {it % 2 == 0 && it.length <= 20}


        println(res)
    }

}
*/
