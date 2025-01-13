package regEx

/*
fun CharSequence.split(
    regex: Regex,
    limit: Int = 0
): List<String> {
    return emptyList<String>()
}
fun CharSequence.replace(
    regex: Regex,
    replacement: String
): String {
    return ""
}
*/


fun main() {
    //val parts = number.split("-") // {"+1", "213", "345", "6789"}

    "(-\\(|\\)-|-)".toRegex()

    val number = "+1-213-345-6789"
    val brackets = "+1-(213)-345-6789"
    // splitting all substrings in number with brackets
    val splitBrackets = brackets.split("(-\\(|\\)-|-)".toRegex()) // {"+1", "213", "345", "6789"}
    // splitting only two substring
    val splitFirstBrackets = number.split("(-\\(|\\)-|-)".toRegex(), 2) // {"+1", "213-345-6789"}
    // splitting all substrings in number without brackets
    val splitNumber = number.split("(-\\(|\\)-|-)".toRegex()) // {"+1", "213", "345", "6789"}

    val withDigits = "The first test flight of Falcon 9 was on June 4, 2010, " +
                     "from Cape Canaveral, Florida, and the first resupply mission " +
                     "to the ISS was made on October 7, 2012."
    val processedString = withDigits.replace("\\d+".toRegex(), "[digits]")
    println(processedString)

    val regex = """[+]?[(]?[0-9]{1,4}[)]?[-0-9]*""".toRegex() // phone number template
    val matchResult = regex.find("Her phone number is +1-234-567-89-01. You can also call the second one: +1-111-568-01-01")!!
    print(matchResult.value) // +1-234-567-89-01

    val regex2 = """\b(?<city>[A-Za-z\s]+),\s(?<state>[A-Z]{2}):\s(?<areaCode>[0-9]{5})\b""".toRegex()
    val input = "Coordinates: Madrid, SP: 28080"

    val match = regex2.find(input)!!
    println(match.groups["city"]?.value)
    // Madrid
    println(match.groups["state"]?.value)
    // SP
    println(match.groups["areaCode"]?.value)
    // 28080

}