package regEx

val regex: Regex = """a(\d+)b""".toRegex()
val input = "a123b a4bc"

val firstMatch: MatchResult? = regex.find(input)

fun main() {
    println(firstMatch?.value) // prints: a123b
    println(firstMatch?.range) // prints: 0..4
    println(firstMatch?.groups)

    val regex = """(\d{4})-(\d{2})-(\d{2})""".toRegex()
    val input = "2024-01-01"

    val secondMatch = regex.find(input)!!

    val (year, month, day) = secondMatch.destructured

    println("Year: $year")   // Year: 2024
    println("Month: $month") // Month: 01
    println("Day: $day")     // Day: 01

    println(firstMatch?.next()?.groupValues) // prints: [a4b, 4]
// prints: [MatchGroup(value=a123b, range=0..4), MatchGroup(value=123, range=1..3)]
}