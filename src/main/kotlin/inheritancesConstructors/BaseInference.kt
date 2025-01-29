package inheritancesConstructors

open class Base1(val id: Int = 1, val length: Float = 1.3f, val message: String = "Huck")

class Derived1 : Base1 {
    constructor(id: Int) : super(id)
    constructor(id: Int, length: Float) : super(id, length)
    constructor(id: Int, length: Float, message: String) : super(id, length, message)
}

fun main() {
    Derived1(1)
    Derived1(2, 0.4F)
    Derived1(3, 5F, "New")
}