package db.exposed

import org.jetbrains.exposed.exceptions.ExposedSQLException
import org.jetbrains.exposed.sql.transactions.transaction
import java.sql.SQLException

fun main() {
    try {
        transaction {
            // Operation that might fail
        }
    } catch (e: ExposedSQLException) {
        // Handle the specific Exposed exception
    } catch (e: SQLException) {
        // Handle general SQL exceptions
    }
}
