package files

import java.nio.file.Paths
import kotlin.io.path.*


val sourceDir = "${absolutePath}sourceDir"
val destDir = "${absolutePath}destDir"

@OptIn(ExperimentalPathApi::class)
fun main() {
    val sourcePath = Path("${sourceDir}${separator}file.txt")
    val destinationPath = Path("${destDir}${separator}file.txt")

    // List all files in the 'sourceDir' directory
    val filesInDir = Path("sourceDir").listDirectoryEntries()
    println("Files in sourceDir: $filesInDir")
    println(filesInDir)
    // Copy the file from 'sourceDir' to 'destDir'
    sourcePath.copyTo(destinationPath, overwrite = true)
    println("File copied from sourceDir to destDir.")

    // Move the file within 'destDir' to a new file
    val movedPath = destinationPath.moveTo(Paths.get("destDir/movedFile.txt"), overwrite = true)
    println("File moved to: $movedPath")

    // Write text to the moved file
    movedPath.writeText("Hello, world!")
    println("Text written to file.")

    // Read the text from the file
    val text = movedPath.readText()
    println("Text read from file: $text")

    // Read the lines from the file as a collection
    val lines = movedPath.readLines()
    println("Lines read from file: $lines")

    // Walk all files and directories within 'destDir'
    val walkedPaths = Path("destDir").walk().toList()
    println("Walked paths: $walkedPaths")

    // Copy 'sourceDir' to 'copyDir' recursively
    Path("sourceDir").copyToRecursively(
        target = Paths.get("copyDir"),
        overwrite = true,
        followLinks = true,
    )
    println("Directory copied recursively.")
}