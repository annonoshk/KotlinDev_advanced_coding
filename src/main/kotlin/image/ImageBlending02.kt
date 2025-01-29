package image

import java.awt.Color

/*
 * Print Color with floats
Write the code for the function printColorFloat(). It reads 3 integers Red, Green, and Blue from stdin (separated by a space). These integers denote the 3 color components of a Color instance. If any of these values is outside the range 0 to 255, then print Invalid input. Otherwise, create a Color instance and print the 3 color components as floats (separated by a space).

Sample Input 1:

0 255 0

Sample Output 1:

0.0 1.0 0.0

Print Color with integers
Write the code for the function printColorInt(). It reads 3 floats Red, Green, and Blue from stdin (separated by a space). These floats denote the 3 float color components of a Color instance. If any of these values is outside the range 0 to 1, then print Invalid input. Otherwise, create a Color instance and print the 3 color components as integers (separated by a space).

Sample Input 1:

1.0 0.0 1.0

Sample Output 1:

255 0 255
 */
fun main() {
    printColorFloat()
    printColorInt()
}


fun printColorFloat() {
    val (r,g,b) = readln().split(" ").map { it.toInt() }
    if(r !in 0..255 || g !in 0..255 || b !in 0..255) {
        println("Invalid input")
    } else {
        val color = Color(r, g, b)
        println("${color.red / 255.0} ${color.green / 255.0} ${color.blue  / 255.0}")
    }

}

fun printColorInt() {
    val (r,g,b) = readln().split(" ").map { it.toFloat() }
    if(r !in 0.0..1.0 || g !in 0.0..1.0 || b !in 0.0..1.0) {
        println("Invalid input")
    } else {
        val color = Color(r, g, b)
        println("${color.red} ${color.green} ${color.blue}")
    }
}