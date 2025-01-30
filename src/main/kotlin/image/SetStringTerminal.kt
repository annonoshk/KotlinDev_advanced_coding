package image

/*
 * Set string color to Green
The function setStringToGreen() is called with a string parameter and returns the same string wrapped in two ANSI sequences.
The first one – a 16-color ANSI sequence – sets the text color to Green, and the second one resets the colors to their default values. Example: "<set Green sequence><original string><reset sequence>".

Your task is to write the code for the setStringToGreen() function.

Write a program in Kotlin
 */
fun main() {
    println(setStringToGreen("Really cool"))
}

fun setStringToGreen(str: String): String {
    val greenCode = "\u001b[32m" // ANSI escape code for green text
    val resetCode = "\u001b[0m"    // ANSI escape code to reset colors
    return greenCode + str + resetCode

}