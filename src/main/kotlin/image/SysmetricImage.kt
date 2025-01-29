package image

/*
 * Symmetrical position across horizontal axis
Following is the code of the symAcrossHorAxis(width: Int, height: Int, x: Int, y: Int) function,
where width and height are the width and height of an image respectively,
and (x, y) is the position of a pixel (x can be from 0 to width - 1 and y from 0 to height - 1).
This function prints the position of the symmetrical pixel across the image's horizontal axis.

Your task is to complete the code so that the function works correctly.

The input is read in main() and then passed to our function.

Sample Input 1:

100 200 99 0

Sample Output 1:

99 199
 */
/*
 *   x,y -------w
 *   |
 *   |
 *   |
 *   h
 */
fun symAcrossHorAxis(width: Int, height: Int, x: Int, y: Int) {
    // fill the correct x2, y2 assignments
    val x2 = x
    val y2 = height - 1 - y

    println("$x2 $y2")
}

fun main() {
    val (s1, s2, s3, s4) = readLine()!!.split(" ")
    val width = s1.toInt()
    val height = s2.toInt()
    val x = s3.toInt()
    val y = s4.toInt()
    symAcrossHorAxis(width, height, x, y)
}