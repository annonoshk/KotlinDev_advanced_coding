package customExceptionfun

fun main() {
    while (true) {
/*        val input = readln()
        if (input == "stop") break
        try {
            println(100 / input.toInt())
        } catch (e: NumberFormatException) {
            println("You didn't type an INT number!")
        } catch (e: ArithmeticException) {
            println("You typed 0!")
        } catch (e: Exception) {
            println("What else can go wrong!")
        }*/

        val input = readln()
        try {
            println(100 / input.toInt())
        } catch (e: Exception) {
            when (e) {
                is NumberFormatException -> println("You didn't type an INT number!")
                is ArithmeticException -> println("You typed 0!")
                else -> println("What else can go wrong!")
            }
        }
    }

}
