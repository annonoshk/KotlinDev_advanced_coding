package db.exposed

import org.jetbrains.exposed.sql.Database

fun connectToDatabase() {
    try {
        Database.connect(
            "jdbc:postgresql://localhost:5432/postgres",
            driver = "org.postgresql.Driver",
            user = "postgres",
            password = "123"
        )
        println("Successfully connected to the database.")
    } catch (e: Exception) {
        println("Failed to connect to the database: ${e.message}")
    }
}

fun main() {
    connectToDatabase()
    // ... Your code to work with the database goes here ...
}