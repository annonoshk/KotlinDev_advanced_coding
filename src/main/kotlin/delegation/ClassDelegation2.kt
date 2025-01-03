package delegation

interface Printable {
    fun print()
}

class Printer1 : Printable {
    override fun print() {
        println("Printing a document")
    }
}

class OfficePrinter(private val printer: Printable) : Printable by printer

fun main() {
    val printer = Printer1()
    val officePrinter = OfficePrinter(printer)
    officePrinter.print() // "Printing a document"
}