package image

/*
 * Find resizing factors
The following program reads an image's dimensions (width and height) and the dimensions we want to resize it (newWidth and newHeight) from standard input. These data are converted to Float.

Then it calculates the required resizing ratio for each dimension, that is, factorX and factorY (both Float) for the horizontal and the vertical dimension respectively and prints them.

Your task is to fill in the missing code so that the program prints the correct factors.

Sample Input 1:

800 600 1920 1080

Sample Output 1:

2.4 1.8
 */

fun main() {
    val line = readLine()!!
    val (width, height, newWidth, newHeight) = line.split(" ").map{ it.toFloat() }

    // Fill the correct factorX and factorY assignments
    val factorX = newWidth / width
    val factorY = newHeight / height

    println("$factorX $factorY")
}