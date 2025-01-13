package regExe


fun main() {
    val string = "cat" // creating the "cat" string
    val regex1 = string.toRegex() // creating the "cat" regex

    val regex2 = Regex("cat") // creating a "cat" regex

    val regex3 = Regex("cat") // creating the "cat" regex

    val stringCat = "cat"
    val stringDog = "dog"
    val stringCats = "cats"

    println(regex3.matches(stringCat))   // true
    println(regex3.matches(stringDog))   // false
    println(regex3.matches(stringCats))  // false

    val regex4 = Regex("...")
    val regex6 = "...".toRegex()
    val string1 = "..."
    val regex = string1.toRegex()

}

