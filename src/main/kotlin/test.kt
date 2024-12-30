/*
fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {

    return wishList.filter { it.value <= limit}.toMutableMap()
}*/

/*
fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
    // write your code here

}
*/

/*fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    while (true) {
        val name = readLine()!!
        if(name == "stop") break

        val score = readLine()!!.toInt()

        if(name !in studentsMarks) {
             studentsMarks[name] = score
             println(studentsMarks)
         }
    }

}*/


fun addUser( userMap: Map<String, String>, login: String, password: String )
: MutableMap<String, String> {

    val result = mutableMapOf<String, String>()

    result.putAll(userMap)

    if(login in userMap)
        println("User with this login is already registered!")
    else
        result.put(login, password)

    return result
}
fun main() {
  val userMap = mutableMapOf<String,String>()
      userMap.put("user1@mail.com", "qwerty123")
      userMap.put("hi_john@mail.com", "abcdef00")
      userMap.put("dr_mike@mail.com", "000000")

    val login = "new_login"
    val password = "new_password"

   // {user1@mail.com=qwerty123, hi_john@mail.com=abcdef00, dr_mike@mail.com=000000, new_login=new_password}
    println(addUser(userMap, login, password)) // Output: {3=Earth, 1=Mercury}
}

