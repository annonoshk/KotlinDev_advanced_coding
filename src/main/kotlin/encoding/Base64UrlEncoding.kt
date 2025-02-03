package encoding

import java.util.Base64

fun main() {
    val url = "https://hyperskill.org/study-plan"
    val encodedUri = Base64.getUrlEncoder().encode(url.toByteArray())
    println(String(encodedUri)) // aHR0cHM6Ly9oeXBlcnNraWxsLm9yZy9zdHVkeS1wbGFu

    println(String(Base64.getUrlDecoder().decode(encodedUri))) // https://hyperskill.org/study-plan
}