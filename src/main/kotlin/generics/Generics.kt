package generics
import kotlin.reflect.typeOf


class Box<T>(t: T) {

    /* Constructor accepts
    * a variable of "some type"
    * and sets it to a field */

    var value = t  // A field of "some type"
        get() = field
        set(value) {
            field = value;
        }

}

class Three<T, U, V>(var first: T, var second: U, var third: V)

class Pair<T, P>(var first: T, var second: P) {
    fun changeFirst(newValue: T) {
        first = newValue
    }

    fun changeSecond(newValue: P) {
        second = newValue
    }

    fun printData() {
        println("Values:")
        println("first = $first")
        println("second = $second")
    }
}
fun <T> calculateLength(list: List<T>): Int {
    return list.size
}

interface MyInterface<T>

fun <T, F : MyInterface<T>> genericFun() {}
class NonGenericClass {
    fun <T> someGenericMethod(t: T): T {
        //...//
        return t
    }
}

class GenericClass<T> {
    fun <U> someGenericMethod(t: T, u: U): U {
        //...//
        return u
    }
}

//fun doGeneric1(t: <T> ): String { return " "}

fun <T> doGeneric2(t:T):String { return " "}

//fun <String> doGeneric3(t:T) { return " "}

//fun T doGeneric4 (t:T): String { return " "}

//fun doGeneric5(t:T):String { return " "}


fun main() {
    val nameLastname: Pair<String, String> = Pair("John", "Smith")
    val nameAge: Pair<String, Int> = Pair("Kite", 18)

    nameLastname.changeFirst("John")
    nameLastname.changeSecond("Smith")

    nameAge.changeFirst("Kate")
    nameAge.changeSecond(19)

    nameLastname.printData()
    nameAge.printData()

    val fromExplicitType = typeOf<String>()
    println(fromExplicitType)

    var list = listOf("hello", "from", "hyperskill")
    println(calculateLength<String>(list)) // 3

    genericFun<_, MyInterface<String>>() // The first T is inferred as String,
// because the second T is explicitly defined as String.

    var item = NonGenericClass()
    var value = item.someGenericMethod("Hello!")
    println(value)// Hello!

    var item2 = GenericClass<String>()
    var value2 = item2.someGenericMethod<Int>("Hi",3 )
    println(value2)
}