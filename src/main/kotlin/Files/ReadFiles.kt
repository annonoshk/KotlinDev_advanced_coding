package files

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.readLines


val separator: String = File.separator // ${separator}

const val fileName = "words_with_numbers.txt"
val path = Path("F:${separator}Codes${separator}simpleTest${separator}src${separator}main${separator}kotlin${separator}Files${separator}${fileName}")

fun main() {

    val linesWithNumbers = path.readLines().count { it.contains(Regex("\\d")) }
    println(linesWithNumbers)
}