

data class User1(val name: String, val age: Int, val isAdmin: Boolean)

val anonym = User1("Anonym", 999, false)

class User2(val name: String, val age: Int, val isAdmin: Boolean){
    operator fun component1(): String = name
    operator fun component2(): Int = age
    operator fun component3(): Boolean = isAdmin
}

// now we can use default destructuring syntax
fun checkIsAdmin(suspiciousUser: User2) {
    // destructuring
    val (name, age, isAdmin) = suspiciousUser

    if (isAdmin)
        println("Have a nice day!")
    else
        println("Sorry, you should not be here.")
}

/*fun processList(customerInfo: MutableList<String>) {
    if (customerInfo.size < 3) return
    val (firstName, lastName, city) = customerInfo
    showCustomerName(firstName, lastName)
    findPopularSellersInCity(city)
}

fun processAnalytics(usersData: MutableList<User1>) {
    for ((name, age, isAdmin) in usersData) {
        if (!isAdmin)
            sendAnalyticsToCompany(name, age)
    }
}*/



fun main() {
    //val (userName, userAge, isAdmin) = anonym

    val usersData1 = mutableListOf<User1>()
    for ((_, _, isAdmin) in usersData1) {
        // /~
    }

    val usersData2 = mutableListOf<User1>()
    for ((name, age, ) in usersData2) {
        // /~
    }


    val userName = anonym.component1()
    val userAge = anonym.component2()
    val isAdmin = anonym.component3()

    println(userName)  // prints Anonym
    println(userAge)   // prints 999
    println(isAdmin)   // prints false


}
