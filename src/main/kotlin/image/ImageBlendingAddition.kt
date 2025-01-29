package image


/*
 * Addition blending mode
There are several simple blending modes based on basic arithmetic operations, like the Addition, Subtraction, Difference, and Divide blending modes.

Here, you will implement the Addition blending mode to write the code for the additionBlend() function. It reads two lines from stdin, each with 3 integers: Red, Green, and Blue (separated by a space). Each line represents the color components for a Color instance.

To produce each target color component, the two respective input values are added. For example, the target color component red is calculated as red = c1.red + c2.red. In the case of integer presentation, if the sum is greater than 255, then the color component is set to the value of 255. In the case of float presentation, if the sum is greater than 1, then the component is set to the value of 1.

Your function should print the 3 color components of the target pixel as integers (separated by a space).

Sample Input 1:

127 200 0
128 200 15

Sample Output 1:

255 255 15

Subtraction blending mode
There are several simple blending modes based on basic arithmetic operations, like the Addition, Subtraction, Difference, and Divide blending modes.

Here, you will implement the Subtraction blending mode to write the code for the subtractionBlend() function. It reads two lines from stdin, each with 3 integers: Red, Green, and Blue (separated by a space). Each line represents the color components for a Color instance.

To produce each target color component, the two respective input values are subtracted one from the other (the second value from the first one). For example, the target color component red is calculated as red = c1.red - c2.red. If the sum is less than 0, then the color component is set to the value of 0.

Your function should print the 3 color components of the target pixel as integers (separated by a space).

Sample Input 1:

255 20 30
100 40 10

Sample Output 1:

155 0 20
 */
fun main() {
    // additionBlend()
    subtractionBlend()
}
fun additionBlend() {
    // Write your code here
    val (red1, green1, blue1) = readLine()!!.split(' ').map { it.toInt() }

    // Read the second color components
    val (red2, green2, blue2) = readLine()!!.split(' ').map { it.toInt() }

    // Calculate the blended color components
    val red = (red1 + red2).coerceAtMost(255)
    val green = (green1 + green2).coerceAtMost(255)
    val blue = (blue1 + blue2).coerceAtMost(255)

    // Print the resulting color components
    println("$red $green $blue")
}

fun subtractionBlend() {
    // Write your code here
    val (red1, green1, blue1) = readLine()!!.split(' ').map { it.toInt() }

    // Read the second color components
    val (red2, green2, blue2) = readLine()!!.split(' ').map { it.toInt() }

    // Calculate the blended color components
    val red = (red1 - red2).coerceAtLeast(0)
    val green = (green1 - green2).coerceAtLeast(0)
    val blue = (blue1 - blue2).coerceAtLeast(0)

    // Print the resulting color components
    println("$red $green $blue")
}