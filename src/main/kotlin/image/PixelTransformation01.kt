package image

/*
 * RescaleOp.filter() functionality
Write the code for the function

newColorValue(colorValue: Int, factor: Float, offset: Int): Int

which has the same functionality as the RescaleOp class, but for only one color value.
It calculates newColorValue = (colorValue * factor) + offset taking into account the type of each argument
and then truncates the result if needed.

colorValue is the value of a color (integer representation) and the same holds for the function return type.

Sample Input 1:

100 2.0 55

Sample Output 1:

255
 */

fun main() {
    val (x1, x2, x3) = readLine()!!.split(" ")
    val colorValue = x1.toInt()
    val factor = x2.toFloat()
    val offset = x3.toInt()

    println(newColorValue(colorValue, factor, offset))

}

fun newColorValue(colorValue: Int, factor: Float, offset: Int): Int {
    // Write your code here
    val newColorValue = (colorValue * factor) + offset

   return newColorValue.toInt().coerceIn(0, 255)
}