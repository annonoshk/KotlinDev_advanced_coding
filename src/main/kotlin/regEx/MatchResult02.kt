package regEx

val regex5 = """(?<year>\d{4})-(?<month>\d{2})-(?<day>\d{2})""".toRegex()
val input5 = "2023-12-31"

val matchResult = regex5.find(input5)!!

fun main() {
    println(matchResult?.groups?.get("year")?.value)  // prints: 2023
    println(matchResult?.groups?.get("month")?.value) // prints: 12
    println(matchResult?.groups?.get("day")?.value)   // prints: 31

    println(matchResult.groups["year"]?.value)
    println(matchResult.groups["month"]?.value)
    println(matchResult.groups["day"]?.value)

    println(matchResult.groups[1]?.value) // same as groups["year"]
}
