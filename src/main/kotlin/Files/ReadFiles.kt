package Files

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.io.path.readText

val separator = File.separator // ${separator}

val fileName = "words_with_numbers.txt"
val path = Path("F:${separator}Codes${separator}simpleTest${separator}src${separator}main${separator}kotlin${separator}Files${separator}${fileName}")

fun main() {

    val linesWithNumbers = path.readLines().count { it.contains(Regex("\\d")) }
    println(linesWithNumbers)
}