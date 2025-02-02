package db.exposed.advancedExposed

/* 1.
 * dependencies {
    implementation("org.jetbrains.exposed:exposed-core:0.45.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.45.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.45.0")
    implementation("com.h2database:h2:1.4.200")
}
 */
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Database

object Users02 : IntIdTable() {
    val name = varchar("name", 50)
    val age = integer("age")
}

class User02(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User02>(Users02)

    var name by Users02.name
    var age by Users02.age

}

fun main() {
    /*   2. Configure the Database:
    Choose your database and specify its configuration. For an H2 in-memory database, it could look like this:*/

    fun initDatabase() {
        Database.connect("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;", driver = "org.h2.Driver")
    }
    /*  3. Create a Connection:
Within your application code, establish a database connection by calling the initDatabase() method:
*/
    initDatabase()
    // Your code here
    /*Entities:
To define an entity in Exposed, create a class extending Entity and parameterize it with the table's primary key type. This entity then connects to a table object.

*/
}