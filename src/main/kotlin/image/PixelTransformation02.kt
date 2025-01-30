package image

import java.awt.color.ColorSpace
import java.awt.image.ColorConvertOp

/*
Grayscale
Let's create the simplest function that converts a 24-bit color to 8-bit grayscale.

Write the code for the function

colorValueToGrayscale(red: Int, green: Int, blue: Int): Int

which takes as parameters a pixel's 3 color values (red, green, and blue) and returns a grayscale value,
which is the mean value of the input parameters (use integer operations).

Sample Input 1:

0 100 200

Sample Output 1:

100

Write a program in Kotlin
*/

fun main() {
    val (x1, x2, x3) = readLine()!!.split(" ")
    val red = x1.toInt()
    val green = x2.toInt()
    val blue = x3.toInt()

    println(colorValueToGrayscale(red, green, blue))
    println("\\u001b")

}

fun colorValueToGrayscale(red: Int, green: Int, blue: Int): Int {
    // Write your code here
/*    val cs = ColorSpace.getInstance(ColorSpace.CS_GRAY)

    // Create a ColorConvertOp instance
    val op = ColorConvertOp(cs, null)

    // Convert the image to grayscale
    val grayscale = op.filter(image, null)*/
    return (red + green + blue) / 3
    //
}