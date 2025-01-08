
abstract class Computer {
    abstract val price: Double

}

class Laptop(val brand: String, val model: String) : Computer() {
    override val price: Double
        get() = if(brand == "Apple" && model == "MacBook Pro") 2000.0 else 1000.0
}


fun main() {
    val laptop = Laptop("Apple", "MacBook Pro")
    println(laptop.price)

    val names = listOf("Pablo", "John", "Jane", "John", "Jane", "Anne", "Pedro")
    println(names.distinctBy { it.last() })
}