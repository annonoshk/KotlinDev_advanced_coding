package compare

class UserComparator : Comparator<User> {
    override fun compare(user1: User, user2: User): Int {
        return if (user1.age == user2.age) {
            user1.name.compareTo(user2.name)
        } else {
            user1.age.compareTo(user2.age)
        }
    }
}

data class User(val name: String, val age: Int, val email: String)

fun main() {
    val users = listOf(
        User("Alice", 25, "alice@example.com"),
        User("Bob", 30, "bob@example.com"),
        User("Charlie", 22, "charlie@example.com"),
        User("David", 28, "david@example.com"),
        User("Eve", 35, "eve@example.com")
    )
    val userComparator = UserComparator()
    println(users)
    println(users.sortedWith(userComparator))
}