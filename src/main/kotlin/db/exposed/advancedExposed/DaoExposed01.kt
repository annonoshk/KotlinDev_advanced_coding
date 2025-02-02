package db.exposed.advancedExposed

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

// Defining a table
object Users01 : IntIdTable() {
    val name = varchar("name", 50)
    val age = integer("age")
}

// Defining an entity corresponding to the table
class User01(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User01>(Users01)

    var name by Users01.name
    var age by Users01.age
}

// Usage
fun main() {
    // Initializing database and transaction...

    // Creating a new user
    val newUser = User01.new {
        name = "John Doe"
        age = 30
    }

    // Retrieving a user by ID
    val user = User01.findById(1)
}
