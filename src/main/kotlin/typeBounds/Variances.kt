package typeBounds

open class Animal
class Dog : Animal()
class Cat : Animal()

fun copyAnimals(source: MutableList<out Animal>, destination: MutableList<in Animal>) {
    destination.addAll(source)
}

fun main() {
    val dogs: MutableList<Dog> = mutableListOf(Dog(), Dog())
    val cats: MutableList<Cat> = mutableListOf(Cat(), Cat())

    val animals: MutableList<Animal> = mutableListOf()

    copyAnimals(dogs, animals)
    copyAnimals(cats, animals)

    println(animals)
}