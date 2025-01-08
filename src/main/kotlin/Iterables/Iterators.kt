package Iterables


fun main() {
    val animals = setOf("dog", "cat", "snake", "mouse")
    var animalsIterator = animals.iterator();
    for(animal in animals){
        println(animal)
    }
    while (animalsIterator.hasNext()) {
        print("${animalsIterator.next()} ")
    }
    animalsIterator.next()
}