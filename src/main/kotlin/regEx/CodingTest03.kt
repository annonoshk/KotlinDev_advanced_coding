package regEx

/*
 * Web colors
Below is the code in which regex is used for looking for colors in the HTML format (e.g., #ABCDEF: the # sign and 6 hexadecimal characters) in the input string.

Find all matches with colorRegex in the input text and output all found colors, each on a new line.

Input: text: String

Output: found HEX color codes printed as Strings, each on a new line.

Tip: Remember about null safety.

Sample Input 1:

Web colors are colors used when displaying web pages. They can be represented as #123ABC: three pairs of hexadecimal digits. The first two digits are red, the two in the middle are green and the last two digits are blue. Example: #AABBCC, #ff0000.

Sample Output 1:

#123ABC
#AABBCC
#ff0000
 */
fun main() {
    val text = readLine()!!
    val regexColors = "#[0-9a-fA-F]{6}\\b".toRegex()
    // write your code here
}