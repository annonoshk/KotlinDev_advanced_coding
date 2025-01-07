package sqldelight

/*
// Create a SqlDriver
val driver: SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
// Create a Database
Database.Schema.create(driver)
// Get a reference to the queries
val usersQueries: UsersQueries = Database(driver).usersQueries
// or
// val usersQueries: UsersQueries = UsersQueries(driver)
// Insert users
usersQueries.insert("John Doe")
usersQueries.insert("Jane Doe")
usersQueries.insert("John Smith")

// Select last inserted
val lastInserted = usersQueries.selectLastInserted().executeAsOne()
println("L*///ast inserted: $lastInserted") //  User(id=3, name=John Smith)