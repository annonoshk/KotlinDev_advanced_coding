package generics

/*
 * Easy
804
2 days ago
 Report a typo
What is wrong
What is the result of the following code execution:
 */
class MyClass<T>(val t: T) {

    fun get(): T {
        return t
    }
}
class Box1<T> (var value: T) {

    fun set(newValue: T) {
        value = newValue
    }
}

class Box3<T,P>(var name: T, var weight: P)

fun main() {
    val box: Box1<String> = Box1<String>("")
    box.set("10L")

    val instance = MyClass("Hello!")
    println(instance.t)
}