package db.exposed

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Table
/*
 *
 * implementation("org.jetbrains.exposed:exposed-core:0.58.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.58.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.58.0")

    // Include the database driver you need, for example, H2
    implementation("com.h2database:h2:2.3.232")

    // Example using DSL
    object Cities : Table() {
        val id = integer("id").autoIncrement().primaryKey()
        val name = varchar("name", 50)
    }

    // Inserting a row using DSL
    Cities.insert {
        it[name] = "San Francisco"
    }
 */

fun main() {
    // Initialize the database connection
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver")

    // ... Your code to work with the database goes here ...

    /*
    Database.connect(
    "jdbc:postgresql://localhost:5432/mydb",
    driver = "org.postgresql.Driver",
    user = "dbuser",
    password = "dbpassword")
     */

//define table
/*    object Users : Table() {
        val id = integer("id").autoIncrement().primaryKey()
        val name = varchar("name", length = 50)
        val age = integer("age")
        val isSubscribed = bool("is_subscribed")
    }*/
}