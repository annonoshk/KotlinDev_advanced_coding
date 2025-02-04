package encoding

import org.apache.commons.codec.binary.Base64

fun main() {
    val text = "Q29tbWVudCB2YXMtdHU/IQ=="
    val encodedText: String = String(Base64.encodeBase64(text.toByteArray()))
    println(encodedText) // SG9sYSE=

    println(String(Base64.decodeBase64("Q29tbWVudCB2YXMtdHU/IQ=="))) // Hola!

}