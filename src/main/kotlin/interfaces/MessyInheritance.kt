package interfaces



//1
//
 /*
interface MyInterface {
    val myProperty: Int
    fun myMethod(): Int = 10
    fun mySecondMethod() { print("Hola!") }
}

interface MyInterface2 {
    val myProperty: Int
    fun myThirdMethod() = print("Hola amigos!")
}

class MyClass : MyInterface, MyInterface2 {
    override val myProperty: Int = 10

    override fun myMethod(): Int { return 127312 }

    override fun mySecondMethod() { print("Hello.") }
}*/

/* 2.
interface MyInterface {
    val myProperty: Int
        get() = 10

    fun myMethod(): Int = 10
    fun mySecondMethod() { print("Hola!") }
}

interface MyInterface2 {
    val myProperty: Int
        get() = 15

    fun myThirdMethod() = print("Hola amigos!")
}

class MyClass : MyInterface, MyInterface2 {}
*/

/* 3.
interface MyInterface {
    val myProperty: Int
        get() = 10

    fun myMethod(): Int = 10
    fun mySecondMethod() { print("Hola!") }
}

interface MyInterface2 {
    val myProperty: Int
        get() = 15

    fun myThirdMethod() = print("Hola amigos!")
}

class MyClass : MyInterface, MyInterface2 {
    override val myProperty: Int = 10
}*/

/* 4.
interface MyInterface {
    val myProperty: Int
        get() = 10

    fun myMethod(): Int = 10
    fun mySecondMethod() { print("Hola!") }
}

interface MyInterface2 {
    val myProperty: Int
        get() = 15

    fun myThirdMethod() = print("Hola amigos!")
}

class MyClass : MyInterface, MyInterface2 {
    override val myProperty: Int = 10
    override fun myMethod(): Int { return myProperty }
    override fun mySecondMethod() { print("Hello") }
    override fun myThirdMethod() { print("Hello people!") }
}*/



/*interface PrinterInterface {
    fun printSomething() = print("something")
    fun printSomethingElse() = print("something else")
}

interface NewLinePrinterInterface {
    fun printSomething() = println("new line something")
    fun printSomethingElse() = println("new line something else")
}

class MultiPrinterClass : PrinterInterface, NewLinePrinterInterface {
    override fun printSomething() = print("classy something")

    override fun printSomethingElse() {
        // Change only the following line
        super<NewLinePrinterInterface>.printSomethingElse()
    }
}*/


interface Weight {
    fun getWeight(): Int
    fun affectedByGravity(): Boolean
}

interface Form {
    fun getVolume(): Int
}

class HeavyBrick : Weight, Form {
    override fun getWeight(): Int = 50
    override fun affectedByGravity(): Boolean = true
    override fun getVolume(): Int = 20
}

class HeavyBrickComposition : Weight by Heavy, Form by Brick

// Do not change the code above.

object Brick: Form {override fun getVolume(): Int = 50 }// ?

object Heavy: Weight {
    override fun getWeight(): Int  = 50
    override fun affectedByGravity(): Boolean = true
}


fun main() {
    val multiPrinter = MultiPrinterClass()
    multiPrinter.printSomethingElse()

    val hbc = HeavyBrickComposition()
    println(hbc.getWeight())
    println(hbc.affectedByGravity())
    println(hbc.getVolume())


}