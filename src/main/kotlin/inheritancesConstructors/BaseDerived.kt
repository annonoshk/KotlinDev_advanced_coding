package inheritancesConstructors
/*
open class Base1(val beta: Int, val gamma: Int, var message: String = "") {
    constructor(beta: Int, message: String = "") : this(beta, 0, message)
}

class Derived1(val alpha: Int, beta: Int, gamma: Int, message: String = "") : Base(beta, gamma, message) {
    constructor(alpha: Int, beta: Int, message: String = "") : this(alpha, beta, 0, message)
}


open class Base(val beta: Int, val gamma: Int = 0, var message: String = "")

class Derived : Base {
    val alpha: Int

    constructor(alphaConstr: Int, beta: Int) : super(beta) {
        alpha = alphaConstr
    }

    constructor(alphaConstr: Int, beta: Int, gamma: Int) : super(beta, gamma) {
        alpha = alphaConstr
    }

    constructor(alphaConstr: Int, beta: Int, gamma: Int, message: String) : super(beta, gamma, message) {
        alpha = alphaConstr
    }

    constructor(alphaConstr: Int, beta: Int, message: String) : super(beta, message = message) {
        alpha = alphaConstr
    }
}*/

open class Base(val message: String, val email: String) {
    init { println("Base class init") }
    constructor(email: String) : this("No message", email) { println("Base class secondary") }
}

class Derived(email: String) : Base(email) {
    init { println("Derived class init") }
    constructor() : this("example.com") { println("Derived class secondary") }
}

open class Human(val age: Int, val height: Int, val name: String = "Unknown") {
    constructor(age: Int, name: String) : this(18, 185, name)
}

class DerivedHuman(val weight: Int, age: Int, height: Int, name: String = "Unknown") : Human(age, height, name)

/*fun main() {
    val someone = DerivedHuman(65, 21, 195)
}*/

fun main() {
    val myDerived = Derived()
    println(myDerived.message)
    println(myDerived.email)

    val myDerived2 = Derived("huck.kim@kangwon.ac.kr")
    println(myDerived2.message)
    println(myDerived2.email)

}
//fun main() {
/*    Base1(10)                    // beta is set
    Base1(10, 20)                // beta and gamma are set
    Base1(10, 20, "My message")  // beta, gamma, and a message are set
    Base1(10, "My message")      // beta and a message are set

    Derived1(0, 10)
    Derived1(0, 10, 20)
    Derived1(0, 10, 20, "My message")
    Derived1(0, 10, "My message")*/


//}