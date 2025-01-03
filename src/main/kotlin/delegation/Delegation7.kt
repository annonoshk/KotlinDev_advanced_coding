package delegation

// Hello Delegate
interface IConsolePrinter {
    val message: String
    fun printMessage()
}

class BasicConsolePrinter(val x: String, val y: String) : IConsolePrinter {
    override val message: String
        get() = "$x $y"

    override fun printMessage() {
        print("Hello Kotlin")
    }
}

class DerivedConsolePrinter(base: IConsolePrinter) : IConsolePrinter by base {
    override fun printMessage() {
        print(message)
    }
}

fun main() {
    val h = "Hello"
    val d = "Delegate"
    val k = "Kotlin"

    // Do not change the code above!

    val delegate = BasicConsolePrinter(h,d)//?

    // Do not change the code below!

    val printer = DerivedConsolePrinter(delegate)
    printer.printMessage()
}