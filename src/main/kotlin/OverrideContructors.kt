class Friend1 {
    private var name: String = "Alex"

    constructor(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return this.name
    }
}

fun main() {
    val friend = Friend1("Huck")
    println(friend)

}


/*
class Friend1 private constructor()
{
    var name: String = "Default Name"
    constructor(name: String) : this() {
        this.name = name
    }

    override fun toString(): String {
        return this.name
    }
} // Example usage:
*/

 // This will print: Alice }
/*
class Student1 private constructor(val name: String) {
    var age: Int = 0

    constructor(name: String, _age: Int) : this(name) {
        age = _age
    }
}
*/

/*open class Animal(val name: String, val age: Int)

class Dog(name: String, age: Int) : Animal(name, age) {
    lateinit var breed: String

    // Secondary constructor
    constructor(name: String, age: Int, breed: String) : this(name, age) {
        this.breed = breed
    }
}*/
/*
fun main() {
    val anna = Student1("Anna", 9, 19)
    anna.printInfo()
   // anna.getAge()     //Cannot access 'getAge': it is private in 'Student'
}

class Student1(
    private val name: String,
    private val id: Int,
    private val age: Int
) {

    fun printInfo() {
        println("Id: $id Name: $name")
        getAge()
    }

    private fun getAge() {
        print("Age: $age ")
    }
}*/
/*class Animal() {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog():Animal() {
    override fun makeSound() {
        println( "The dog barks")
    }
}*/
/*
open class Animal(val name:String, val age: String) // Add your code here

class Dog(name:String, age: String): Animal(name,age) // Add your code here
*/

// Example usage:
/*
fun main() {
    val dog = Dog("Buddy", 3, "Golden Retriever")
    println("Name: ${dog.name}, Age: ${dog.age}, Breed: ${dog.breed}")  // This will print: Name: Buddy, Age: 3, Breed: Golden Retriever
}
*/
