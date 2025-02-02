package db.exposed.advancedExposed

/*
Relationships Between Entities
Exposed allows relationships like one-to-one, one-to-many, and many-to-many to be defined. For instance, to define a one-to-many relationship between the User and Order entities:
*/
/*

object Users : IntIdTable() {
    val name = varchar("name", 50)
}

object Orders : IntIdTable() {
    val user = reference("user", Users)
}

class User(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User>(Users)
    var name by Users.name
    val orders by Order referrersOn Orders.user
}

class Order(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<Order>(Orders)
    var user by User referencedOn Orders.user
}
//Exposed provides a DSL to create SQL-like queries in a type-safe manner:
val complexQuery = Users.innerJoin(Orders)
    .select { Users.id eq 1 and (Orders.totalPrice greater 50) }
    .orderBy(Orders.createdAt, SortOrder.DESC)

Transactions
Transactions in Exposed are straightforward. All database interactions should be encased in a transaction block:

transaction {
    // Your database interactions here
}

*/

