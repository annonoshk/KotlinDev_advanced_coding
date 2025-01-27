/*
 * Number in a set
Write a program that checks if a set of N numbers contains a number M.

The first line contains the N number.
The next N lines contain the set of numbers one number per line.

The last line contains one integer number M.

You need to output either YES or NO.

Sample Input 1:
 */
/*

val hello = "Hello world"

fun main() {
    val n = readLine()!!.toInt()
    val numbers = mutableSetOf<Int>()
    repeat(n) {
        numbers.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()
    if (m in numbers) {
        println("YES")
    } else {
        println("NO")
    }

    println(hello.substring(5, 11))

    println(hello.substring(6))

    println(hello.replace("Hello ", ""))

    println(hello.substringAfter('w'))
}
*/
/*
 * List of names
You have a list of names of your students. Please return the first student name that starts with "j" and ends with "e".

Sample Input 1:

john jane joe jill pack
 */
//Input String
/*
fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.filter { it.startsWith('j') && it.endsWith('e') }.firstOrNull()

    println(res)
}
*/

fun main() {
    println(convertToString(5))
}

fun convertToString(obj: Any): String {
    return obj as String
}
