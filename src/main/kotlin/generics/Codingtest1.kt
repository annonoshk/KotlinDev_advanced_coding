package generics

class Holder1(var value: Any) {
    fun set(newValue: Any) {
        value = newValue
    }

    fun get(): Any {
        return value
    }
}

fun main() {
    val holder1: Holder1 = Holder1(0)
    holder1.set(256)

    // correct the line to make the code compile
    val value: Any = holder1.get()

    // do not change
    println(value)
}