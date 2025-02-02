package db.exposed

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID


fun main() {
/*    // 1. DSL
    // create
    val id = Users.insert {
        it[name] = "John Doe"
        it[email] = "john@example.com"
    } get Users.id

    // read

    val user = Users.select { Users.id eq id }.single()
    println("Name: ${user[Users.name]}, Email: ${user[Users.email]}")

    //Update

    Users.update({ Users.id eq id }) {
        it[name] = "Jane Doe"
        it[email] = "jane@example.com"
    }

    //Delete

    Users.deleteWhere { Users.id eq id }

    // DAO

    class User(id: EntityID) : IntEntity(id) {
        companion object : IntEntityClass(Users)
        var name by Users.name
        var email by Users.email
    }

    // create
    val user = User.new {
        name = "John Doe"
        email = "john@example.com"
    }

    //Read:

    val user = User.findById(id)
    user?.let {
        println("Name: ${it.name}, Email: ${it.email}")
    }

    //Update:

    user?.apply {
        name = "Jane Doe"
        email = "jane@example.com"
    }

    //Delete:

    user?.delete()*/
}