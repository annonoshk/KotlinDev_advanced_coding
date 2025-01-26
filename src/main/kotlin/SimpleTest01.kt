


/*
 * Number in a set
Write a program that checks if a set of N numbers contains a number M.

The first line contains the N number.
The next N lines contain the set of numbers one number per line.

The last line contains one integer number M.

You need to output either YES or NO.

Sample Input 1:
 */

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

