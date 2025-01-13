package regEx

fun main() {
    val regex = """(\d{4})-(\d{2})-(\d{2})""".toRegex()
    val input = readln() // The event will happen on 2024-04-12.

    val matchResult = regex.find(input)

    printGroups(matchResult)
}

fun printGroups(matchResult: MatchResult?) {
    if (matchResult != null) {
        println("Full match: ${matchResult.value}")
        println("Year: ${matchResult.groupValues[1]}")
        println("Month: ${matchResult.groupValues[2]}")
        println("Day: ${matchResult.groupValues[3]}")
    } else {
        println("No match found.")
    }
}
