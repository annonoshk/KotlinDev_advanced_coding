package generics



/**
 * Generic box
Implement a generic 'Box' class that can store any type of item. Add methods set() and get().

Sample Input 1:

1
Hello

Sample Output 1:

The integer in the box is: 1
The string in the box is: Hello

*/
class BoxGeneric01<T> {
    var item: T? = null // Public property with default getter and setter

    // You can also define explicit getter and setter if needed for more control:

    get() = field // 'field' refers to the backing property
    set(value) {
        field = value // Update the backing property
    }

}

fun main() {
    val intBoxGeneric01 = BoxGeneric01<Int>()
    intBoxGeneric01.item = 1 // Setting the value using the default setter
    println("The integer in the box is: ${intBoxGeneric01.item}") // Getting the value using the default getter

    val stringBoxGeneric01 = BoxGeneric01<String>()
    stringBoxGeneric01.item = "Hello"
    println("The string in the box is: ${stringBoxGeneric01.item}")

    // Example with null handling:
    val emptyBoxGeneric01 = BoxGeneric01<Double>()
    val doubleValue = emptyBoxGeneric01.item
    if (doubleValue != null) {
        println("The double in the box is: $doubleValue")
    } else {
        println("The box is empty.")
    }


    val charBoxGeneric01: BoxGeneric01<Char> = BoxGeneric01<Char>()
    charBoxGeneric01.item = 'A'
    println("The char in the box is: ${charBoxGeneric01.item}")

}