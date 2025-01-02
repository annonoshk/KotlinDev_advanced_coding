package delegation

interface MyInterface1 {
    fun print()
    val msg: String
}

class MyImplementation : MyInterface1 {
    override fun print() {
        println(msg)
    }

    override val msg: String = "MyImplementation sends regards!"
}

class MyNewClass(base: MyInterface1) : MyInterface1 by base {
    override val msg = "Delegate sends regards."

}

fun main() {
    // We create an instance of class, implementing MyInterface
    val delegate = MyImplementation()

    // Then we pass this implementation instance as a parameter
    val delegatingObj = MyNewClass(delegate)
    println(delegatingObj.msg)

    delegatingObj.print()
}