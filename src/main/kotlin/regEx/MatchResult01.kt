package regEx

fun main() {
    // Create a regular expression to match numbers with optional decimal point
    val regex = Regex("""\d+(\.\d+)?""")

    // Define a string with number information
    val input = "The price is $12.99 for the first item, and $9.99 for each additional item."

    // Create a string builder to store the modified string
    val output = StringBuilder()

    // Find the first match in the input string
    var match = regex.find(input)

    // Keep track of the last index of the previous match
    var lastIndex = 0

    // Loop until there are no more matches
    while (match != null) {
        // Append the substring from the input string before the current match
        output.append(input.substring(lastIndex, match.range.first))

        // Convert the matched value to a double and multiply it by 1.1
        val number = match.value.toDouble()
        val increasedNumber = number * 1.1

        // Round the increased number to two decimal places and append it to the output
        output.append("%.2f".format(increasedNumber))

        // Update the last index to the end of the current match
        lastIndex = match.range.last + 1

        // Find the next match using the next() method
        match = match.next()
    }

    // Append the remaining substring from the input string after the last match
    output.append(input.substring(lastIndex))

    // Print the output string
    println(output)
}