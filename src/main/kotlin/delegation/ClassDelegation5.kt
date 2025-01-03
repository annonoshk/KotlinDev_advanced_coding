package delegation
interface Auth {
    fun login()
    fun logout()
}

class AdminAuth : Auth {
    override fun login() {
        println("Admin logged in.")
    }

    override fun logout() {
        println("Admin logged out.")
    }
}

class UserAuth : Auth {
    override fun login() {
        println("User logged in.")
    }

    override fun logout() {
        println("User logged out.")
    }
}

class SystemUser(val username: String, isAdmin: Boolean) : Auth by if (isAdmin) AdminAuth() else UserAuth()
// make your code here
fun main() {
    val adminUser = SystemUser("admin", true)
    val regularUser = SystemUser("user", false)
    adminUser.login()
    adminUser.logout()
    regularUser.login()
    regularUser.logout()
}