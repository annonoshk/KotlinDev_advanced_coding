package encoding

import java.util.Base64

fun main() {
    val text = "Comment vas-tu?!"
    val encodedText: String = Base64.getEncoder().encodeToString(text.toByteArray())
    println(encodedText) // SG9sYSE=

    val decodedText = String(Base64.getDecoder().decode(encodedText))
    println(decodedText) // Hola!

}