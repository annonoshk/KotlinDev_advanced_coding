package typeBounds

open class Animal1 {
    fun feed() = println("The animal is fed")
}

class Dog1 : Animal1() {
    fun pet() = println("The dog is petted")
}

class Cat1 : Animal1() {
    fun ignore() = println("The cat ignores you")
}

class Box1<in T, out R>(private var t: T, private val r: R) {
    fun put(t: T) {
        this.t = t
    }

    fun take(): R {
        return r
    }
}

fun main() {
    val dogBox: Box1<Animal1, Dog1> = Box1(Dog1(), Dog1())
    dogBox.put(Cat1())  // OK: Cat is a subtype of Animal
    val dog: Dog1 = dogBox.take()  // OK: take() returns Dog

    val catBox: Box1<Dog1, Animal1> = Box1(Dog1(), Cat1())
    // Error: Can't put Cat in Box<Dog, Animal>
    // catBox.put(Cat())
    val animal: Animal1 = catBox.take()  // OK: take() returns Animal

    println("dog: $dog, catBox: $catBox, animal: $animal")
}