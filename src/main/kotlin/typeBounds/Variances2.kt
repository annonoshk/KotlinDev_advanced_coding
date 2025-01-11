package typeBounds

/*
open class Animal
class Dog : Animal()
class Cat : Animal()
*/

class Ant : Animal()
class Box<T>(val item: T)

fun printItems(boxes: List<Box<*>>) {
    for (box in boxes) {
        println(box.item)
    }
}

fun main() {
    val dogBox = Box(Dog())
    val catBox = Box(Cat())
    val antBox = Box(Ant())
    val dummyString = Box("HuckKim")
    val dummyInt = Box(5)
    val boxes: List<Box<*>> = listOf(dogBox, catBox, antBox, dummyString, dummyInt)

    printItems(boxes)
}