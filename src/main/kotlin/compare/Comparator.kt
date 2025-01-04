package compare


data class User(val name: String, val age: Int, val email: String)

class UserComparator : Comparator<User> {
    override fun compare(user1: User, user2: User): Int {
        return if (user1.age == user2.age) {
            user1.name.compareTo(user2.name)
        } else {
            user1.age.compareTo(user2.age)
        }
    }
}

fun main() {
    
    
}