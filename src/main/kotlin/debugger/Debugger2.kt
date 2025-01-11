package debugger

fun main() {
    val casper = Cat("Casper", -1)
}

class Cat(val name: String, val age: Int) {
    val enoughCat = false // Of course, it's a false, there are never enough cats!
    init {
        check(!enoughCat) { "You cannot add a new cat" } // IllegalStateException
        require(age >= 0) { "Invalid age: $age" }        // IllegalArgumentException
    }
}