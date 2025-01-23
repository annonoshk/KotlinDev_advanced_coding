package stringBuffer

fun main() {
    val secretMessage = StringBuffer()

    secretMessage
        .append("like")
        .insert(3, "srepyHigh")
        .delete(9, 13)
        .replace(0, 1, "ll")
        .reverse()

    println(secretMessage) // "Hyperskill"
}