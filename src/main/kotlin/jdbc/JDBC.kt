package jdbc

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement


object DatabaseManager : AutoCloseable {
    private var connection: Connection? = null
    private val url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;"
    private val user = "sa"
    private val password = ""

    fun open(): Connection {
        try { connection = DriverManager.getConnection(url, user, password)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return connection!! }
    override fun close() {
        try {
            connection?.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

data class User(val id: Int, val name: String)

fun createTable() {
    val sql = """CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(100))"""
    DatabaseManager.open().use { conn ->
        conn.prepareStatement(sql).use {
            it.executeUpdate()
        }
    }
}

fun insertData(user: User) {
    val sql = """INSERT INTO users (id, name) VALUES (?, ?)"""
    DatabaseManager.open().use { conn ->
        conn.prepareStatement(sql).use { stmt ->
            stmt.setInt(1, user.id)
            stmt.setString(2, user.name)
            stmt.executeUpdate()
        }
    }
}

fun updateData(user: User) {
    val sql = """UPDATE users SET name = ? WHERE id = ?"""
    DatabaseManager.open().use { conn ->
        conn.prepareStatement(sql).use { stmt ->
            stmt.setString(1, user.name)
            stmt.setInt(2, user.id)
            stmt.executeUpdate()
        }
    }
}

fun deleteData(user: User) {
    val sql = """DELETE FROM users WHERE id = ?"""
    DatabaseManager.open().use { conn ->
        conn.prepareStatement(sql).use { stmt ->
            stmt.setInt(1, user.id)
            stmt.executeUpdate()
        }
    }
}
fun selectData(): List<User> {
    val sql = """SELECT * FROM users"""
    val users = mutableListOf<User>()
    DatabaseManager.open().use { conn ->
        conn.prepareStatement(sql).use { stmt ->
            val rs = stmt.executeQuery()
            while (rs.next()) {
                users.add(User(rs.getInt("id"), rs.getString("name")))
            }
        }
    }
    return users
}

fun main() {
    val user1 = User(1, "John Doe")
    val user2 = User(2, "Jane Doe")
    val user3 = User(3, "John Smith")
    val user4 = user1.copy(name = "John Doe Updated")

    insertData(user1)
    insertData(user2)
    insertData(user3)
    updateData(user4)
    deleteData(user2)

    selectData().forEach { println(it) }
// User(id=1, name=John Doe Updated)
// User(id=3, name=John Smith)
}
