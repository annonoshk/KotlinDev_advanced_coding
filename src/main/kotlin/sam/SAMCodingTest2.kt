package sam

fun interface IntBinaryOperation {
    fun apply(a: Int, b: Int): Int
}
fun performOperation(a:Int, b: Int, operation: IntBinaryOperation): Int {
    return operation.apply(a,b)
}

fun main() {
    val input = readlnOrNull()
    if (input != null) {
        val numbers = input.split(" ")
        if(numbers.size == 2 ) {
            val num1 = numbers[0].toIntOrNull() ?: 0
            val num2 = numbers[1].toIntOrNull() ?: 0
            val product = performOperation(num1, num2, IntBinaryOperation { x,y -> x * y  })
            println(product)
        }
    }

}