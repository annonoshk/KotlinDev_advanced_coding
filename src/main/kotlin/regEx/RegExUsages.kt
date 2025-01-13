package regEx

val regexWithGroups = """(ho)+""".toRegex()
val text = "ho hoho hohoho"

fun main() {
    val resultWithGroups = regexWithGroups.findAll(text)
    for (res in resultWithGroups) println(res.value)

    val regex = Regex("""\d{4}(-|\/)\d{2}\1\d{2}""")
    val dates = regex.findAll("Date 1: 2022-06-06" +
            "Date 2: 2021/01/01; date 3: 2020-02-02")

    for (date in dates) println(date.value)

    //phone number
    val regexPhone = Regex("""\(?[\d]{3}\)?-?[\d]{3}-?[\d]{4}""")
    val phones = regexPhone.findAll("Ann's phone: 123-345-6789 " +
            "Dave's phone: (111)-234-5678, and next phone is (101)-234-5000")

    for (phone in phones) println(phone.value)

    //email
    val regexEmail = Regex("""([a-z0-9_\.-]+)@([a-z0-9_\.-]+)\.([a-z\.]{2,6})""")
    val email = regexEmail.findAll("We have the following emails: " +
            "abc@mail.com, joe_blow@address.ing")

    for (matches in email) println(matches.value)

    //url
    val regexUrl = Regex("""(https?:\/\/)?([\da-z\.-]+)\.([a-z\.]{2,6})([\/\w\.-]*)*\/?""")
    val url = regexUrl.findAll("Jet Brains Website: https://www.jetbrains.com/ " +
            "And here is information about Hyperskill: https://hi.hyperskill.org/how-we-teach")

    for (matches in url) println(matches.value)

    // coding test
    val regExTest = Regex("""([a-z0-9_\.-]+)@([a-z0-9_\.-]+)\.([a-z\.]{2,6})""")
  //  val result = regExTest.findAll("([a-z0-9_\.-]+)\.")
}
