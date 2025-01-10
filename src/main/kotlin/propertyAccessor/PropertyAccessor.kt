package propertyAccessor

class IntegerRepository {
    private val _list = mutableListOf<Int>()
    val list: List<Int> get() = _list // backing property
}
/*
class Client {
    val name = "Unknown"
        get() {
            println("Somebody wants to know $field name")
            return field
        }
}
*/

class Client {
    var name: String = "Unknown"
    var age: Int = 18
     set(value) {
         field = if (value < 0) {
             println("Age cannot be negative. Set to $defaultAge")
             defaultAge
         } else
             value
     }
 val defaultAge = 18
    val info: String
        get() = "name = $name, age = $age"
}
/*class Client {
    var name = "Unknown"
    var age = 18
        set(value) {
            field = if (value < 0) {
                println("Age cannot be negative. Set to $defaultAge")
                defaultAge
            } else
                value
        }
    val defaultAge = 18
}*/



fun main() {
    val repository = IntegerRepository()
   // repository.list.add(1) // Error: variable list is a read-only collection
    println(repository.list)

   /* val name = client.name // prints Somebody wants to know Unknown name
    println(name)          // prints Unknown*/
/*
    val client = Client()
    println(client.info) // name = Unknown, age = 18
    client.name = "Lester"
    client.age = 20
    println(client.info) // name = Lester, age = 20*/

    val client = Client()
    client.age = -1      // Age cannot be negative. Set to 18.
    println(client.age)  // 18


}