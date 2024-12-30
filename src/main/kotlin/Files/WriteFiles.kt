package Files

import java.io.File
import kotlin.io.path.Path

val seperator = File.separator // ${seperator}
val workingDirectory = System.getProperty ("user.dir")
val absolutePath = "${workingDirectory}${seperator}src${seperator}main${seperator}kotlin${seperator}Files${seperator}"

val textFile = Path("${absolutePath}textFile.txt") // path to the file
val bytesFile = Path("${absolutePath}bytesFile.txt") // path to the file
fun main() {

    val fileName = "${
        absolutePath}Myfile.txt"
    val fileName2 = "${
        absolutePath}MyfileByteArray.txt"
    val textToFile = "If we learn to process our code carefully, we’ll grow as programmers."
    File(fileName).writeText("1\n")
    File(fileName).writeText("2")
    File(fileName).appendText("3")
  
    val arrayOfBytes = byteArrayOf(1, 2, 3) // create an array
    // another way:
    // val arrayOfBytes = mutableListOf<Byte>(1, 2, 3).toByteArray()

    File(fileName2).writeBytes(arrayOfBytes)

    val arrayOfBytes2 = byteArrayOf(0, 1, 2)
    File(fileName2).appendBytes(arrayOfBytes2)

}