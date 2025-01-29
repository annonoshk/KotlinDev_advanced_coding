package inheritancesConstructors



// Programmer("My Name", 30, 5)  // name, age, yearsOfWork
// Programmer("My Name", 30)     // name, age


open class Employee(val name: String, val age: Int, var yearsOfWork: Int = 0) {
    override fun toString(): String {
        return "name: $name, age: $age, yearsOfWork = $yearsOfWork"
    }
}

class Programmer : Employee {
    constructor(name: String, age: Int, yearsOfWork: Int): super(name,age,yearsOfWork)
    constructor(name: String, age: Int) : super(name,age)
}

fun main() {
    println(Programmer("My Name", 30, 5))  // name, age, yearsOfWork
    println(Programmer("My Name", 30))     // name, age


}