package db.exposed.advancedExposed

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable


// CRUD Operations with Exposed DAO

/*
 * Create:

To create a new entry, firstly define an Entity class corresponding to your table:
*/
object Users : IntIdTable() {
    val name = varchar("name", 50)
    val age = integer("age")
}

class User(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User>(Users)

    var name by Users.name
    var age by Users.age
}

val newUser = User.new {
    name = "John Doe"
    age = 30
}

fun main() {
    /*Read:

Reading entries can be carried out using various querying methods provided by Exposed:*/

    val user01 = User.findById(1)
    val youngUsers = User.find { Users.age less 18 }.toList()

    /*Update:

    To update a record, simply modify the entity properties and call flush:*/

    val user02 = User.findById(1) ?: return
    user02.name = "Jane Doe"
    user02.age = 25
    user02.flush()

    /*Delete:

    Just call delete on an entity instance to erase a record:*/

    val user03 = User.findById(1) ?: return
    user03.delete()
}
