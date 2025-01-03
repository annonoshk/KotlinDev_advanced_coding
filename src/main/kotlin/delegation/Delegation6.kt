package delegation

interface A {
    fun printA() = println("It's A")
    val msg: String
}

class B : A {
    override fun printA() = println(msg)
    override val msg: String = "It's B"
}

class C : A {
    override val msg: String = "it's C"
}

class D(base: A) : A by base {
    override val msg = "It's D"
    fun printB() = println(msg)
}

fun main() {
    D(B()).printB()
    println(C().msg)
    D(B()).printA()
    C().printA()
}