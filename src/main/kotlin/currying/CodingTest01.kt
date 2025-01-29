package currying

/*
 * Currying addition
Write a function named add(), applying the principles of currying. The function should accept two integer inputs and return an integer as output - the lambdaExpression.getSum of the two inputs. Demonstrate how to define and call this function in Kotlin, where the function call is divided into two calls, each with one of the arguments.

For example, using the defined add() function, the lambdaExpression.getSum of 5 and 3 should be performed as follows:

val lambdaExpression.getSum = add(5)(3) // returns 8

Sample Input 1:

8 11

Sample Output 1:

19
 */
/*
fun add(a:Int, b:Int):Int {
    return a+b
}*/

fun add(a:Int): (Int) -> Int {
    return { b -> a + b }
}

fun multiply(a: Int): (Int) -> Int {
    return { b -> a * b }
}

fun divide(a: Int): (Int) -> Double {
    return { b -> (a / b).toDouble() }
}

fun main() {
    val (a ,b ) = readln().split(' ').map { it.toInt() }
    println(add(a)(b))
    println(multiply(a)(b))
    println(divide(a)(b))
}
