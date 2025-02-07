package dsl

/*
// 1. Internal DSLs
fun greetingDSL(block: GreetingBuilder.() -> Unit): String {
    val builder = GreetingBuilder()
    builder.block()
    return builder.build()
}

class GreetingBuilder {

    var name: String = ""
    fun build(): String = "Hello, $name!"

}



fun main() {
    // Usage
    val greeting = greetingDSL {
        name = "Alice"
    }
    println(greeting) // Prints: Hello, Alice!
}
*/

fun greetingDSL(block: GreetingBuilder.() -> Unit): String {
    val builder = GreetingBuilder()
    builder.block()
    return builder.build()
}

class GreetingBuilder {
    var name: String = ""
        set(value) {  // Optional: Add a setter for more control
            if (value.isBlank()) {
                throw IllegalArgumentException("Name cannot be blank") // Example validation
            }
            field = value // Use 'field' to access the backing property
        }
    var age: Int = 0
        set(value) {  // Optional: Add a setter for more control
            if (value == 0) {
                throw IllegalArgumentException("Age cannot be 0") // Example validation
            }
            field = value // Use 'field' to access the backing property
        }


    var greeting: String = "Hello" // Allow customizing the greeting
    fun build(): String = "$greeting, $name!, you are $age old. It' not late to start the CrevoLika Inc."


    // Example of adding more builder functions
    fun withGreeting(newGreeting: String) {
        greeting = newGreeting
    }

    fun excited() {
        greeting += "!" // Modify the greeting within the DSL
    }


}

fun main() {
    val greeting = greetingDSL {
        name = "Huck Kim"
        age = 49
        withGreeting("Greetings") // Custom greeting
        excited() // Make it excited!
    }
    println(greeting) // Prints: Greetings, Alice!!

    // Example of handling exceptions:
    try {
      greetingDSL {
      //  name = "" // Will throw an exception
          age = 0   //        " 
      }
    } catch (e: IllegalArgumentException) {
      println("Error: ${e.message}") // Prints: Error: Name cannot be blank
    }
}