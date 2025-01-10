package delegation

import kotlin.properties.Delegates

val lazyValue: String by lazy {
    print("Computed! ")
    "Hello"
}
class User1 {
    var rank: String by Delegates.observable("<no rank>") {
        prop, old, new -> println("${prop.name}: $old -> $new")
    }
}
var max: Int by Delegates.vetoable(0) { prop, old, new ->
    new > old
}
class Person{
    var name: String by Delegates.notNull()
}

class User(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}

fun main() {
    println(lazyValue) // Computed! Hello
    println(lazyValue) // Hello
    println(lazyValue)

    val user1 = User1()
    user1.rank = "second" // rank: first -> second

    println(max) // 0
    max = 10
    println(max) // 10
    max = 5
    println(max) // 10

    val person = Person()
  /*  person.name // Throws IllegalStateException:
                // Property name should be initialized before get.*/
    person.name = "Ahmed Omar"
    println(person.name) // Prints "Ahmed Omar"

    val user = User(mutableMapOf(
        "name" to "Ahmed Omar",
        "age"  to 25
    ))

    println(user.name) // Prints "Ahmed Omar"
    println(user.age)  // Prints 25

    user.name = "Ahmed Omar"
    user.age = 30

    println(user.name) // Prints "Ahmed Omar"
    println(user.age)  // Prints 30
}
