package delegation

interface MyInterface3 {
    fun print()
    val amount: Int
}
class AdditionPrinter : MyInterface3 {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 3 + 7 // 10
}

class SubtractionPrinter : MyInterface3 {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 23 - 15 // 8
}

class MultiplicationPrinter : MyInterface3 {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 3 * 4 // 12
}

// Write the correct class here

class Printer(base: MyInterface3) : MyInterface3 by base {
    override fun print() {
        for (i in 1..(amount + 2)) print("*")
    }
}

fun main() {

    // Your code here
    //val base = SubtractionPrinter()
    val p = Printer(SubtractionPrinter())//?

    // Do not change the code below
    p.print()
}