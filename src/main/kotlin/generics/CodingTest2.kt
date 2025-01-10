package generics


/*
 * Initialize an object of a generic class
Initialize an object of the generic class Holder to make the code in the main method compile.

The program should print This is an instance of String.

Sample Input 1:

Sample Output 1:

This is an instance of String
 */
class Holder<T>(val value: T) {

    fun get(): T {
        return value
    }
}
fun main() {
    // write your code here
    val holder: Holder<String> = Holder("This is an instance of String")

    // Do not change the code below
    val holderValue = holder.get()
    print(holderValue)
}