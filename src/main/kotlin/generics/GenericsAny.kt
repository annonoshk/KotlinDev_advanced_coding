package generics


class PairGeneric<T, P>(var first: T, var second: P) {
    fun changeFirst(newValue: T) {
        first = newValue
    }

    fun changeSecond(newValue: P) {
        second = newValue
    }
    fun printData() {
        println("Value:")
        println("first = $first")
        println("second = $second")
    }
}

class PairNonGeneric(var first: Any, var second: Any) {
    fun changeFirst(newValue: Any) {
        first = newValue
    }

    fun changeSecond(newValue: Any) {
        second = newValue
    }
    fun printData() {
        println("Value:")
        println("first = $first")
        println("second = $second")
    }
}

fun main() {
    val genericPair: PairGeneric<String, Int> = PairGeneric("John", 8)
    val nonGenericPair: PairNonGeneric = PairNonGeneric("Kate", 18)

    genericPair.changeFirst("Huck Kim") // It does not compile
    genericPair.changeSecond(49)
    nonGenericPair.changeFirst("Int") // It works
    nonGenericPair.changeSecond(44) // It works

    genericPair.printData()
    nonGenericPair.printData()
}