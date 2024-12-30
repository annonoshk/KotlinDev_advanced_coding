
fun upperEvenLetters(message: String): String {
    return buildString {
        message.forEachIndexed { index, ch ->
            if (index % 2 == 0) append(ch.uppercaseChar()) else append(ch)
        }
    }
}
fun decodeMessage(encodedMessage: String): String {
    val sb = StringBuilder()
    encodedMessage.forEachIndexed {
        index, ch ->
        if( ch in setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'))
            sb.append(ch)
        else if(ch.isLowerCase())
            sb.append(ch.uppercaseChar())
    }
    return sb.toString()
}
fun concatenate(list: List<String>, separator: String): String {
    return list.joinToString(separator = separator)
}

fun reverseSentence(sentence: String): String {
    val words = sentence.split(" ")
    val sb = buildString {
        append(words.reversed().joinToString(" "))
       // words.reversed().joinToString(" ")
    }
    return sb
    // Write you code here
}
// I love big letters
fun main() {
    val secretMessage = readln()!! //"MXQE!"

    val encryptedMessage = buildString {
        for (char in secretMessage) {
            if (char.isLetter()) {
                val shiftedChar = char.code + 3
                val wrappedChar = if (shiftedChar > 'Z'.code) {
                    'A' + (shiftedChar - 'Z'.code - 1)
                } else {
                    shiftedChar.toChar()
                }
                append(wrappedChar)
            } else {
                append(char)
            }
        }
    }

    println(encryptedMessage)
}