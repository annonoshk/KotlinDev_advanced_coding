package sealedAbstractClasses

abstract class Animal {
    abstract fun move()
    abstract fun makeSound()

    fun eat(): Boolean = false
    fun sleep(): Boolean = false
}

class Cat : Animal() {
    override fun move() {
        // Implementation specific to how the cat moves
    }

    override fun makeSound() {
        // Implementation specific to what sound the cat makes
    }
}

fun main() {
    val cat: Animal = Cat()
    cat.move()
    cat.makeSound()
}