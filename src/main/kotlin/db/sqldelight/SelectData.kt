package db.sqldelight

// Select all users
/*fun main() {
    val allUsers = usersQueries.selectAll().awaitAsList()
    println("All users: $allUsers")

    // Select by id
    val userById = usersQueries.selectById(2).awaitAsOne()
    println("User by id: $userById")

    // Delete user
    usersQueries.delete(2)
    val deletedUser = usersQueries.selectById(2).awaitAsOneOrNull()
    println("Deleted user: $deletedUser")

    // Prepare a flow of users, to get notified when the table changes
    val usersFlow = usersQueries.selectAll().asFlow().mapToList(Dispatchers.IO)

    scope.launch {
        // collect the flow
         usersFlow
             .onStart { println("Notifications for users are ready...") }
             .collect { users ->
                  println("Users are updated: $users")
             }
    }

    // Insert users
    println("Inserting users")
    usersQueries.insert("John Doe")
    usersQueries.insert("Jane Doe")
    usersQueries.insert("John Smith")

    // Update user
    println("Updating a user")
    usersQueries.update("Jane Doe 2", 2)

    // Delete user
    println("Deleting a user")
    usersQueries.delete(2)*/

    /*
     * mapToOne(): returns a flow with the element.
mapToOneNotNull(): returns a flow with a non-null element.
mapToOneOrDefault(): returns a flow with the element or a default value.
mapToOneOrNull(): returns a flow with the element or null value.
     */
//}
