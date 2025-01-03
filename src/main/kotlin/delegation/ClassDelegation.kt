package delegation

interface Greeting {
    fun greet()
}

class EnglishGreeting : Greeting {
    override fun greet() {
        println("Hello!")
    }
}

class FrenchGreeting : Greeting {
    override fun greet() {
        println("Bonjour!")
    }
}

class Greeter(private val greeting: Greeting) : Greeting by greeting

fun main() {
    val englishGreeting = EnglishGreeting()
    val frenchGreeting = FrenchGreeting()
//    Greeter(greeting = englishGreeting).greet()
    val greeter1 = Greeter(englishGreeting)
    val greeter2 = Greeter(frenchGreeting)

    greeter1.greet() // "Hello!"
    greeter2.greet() // "Bonjour!"
}