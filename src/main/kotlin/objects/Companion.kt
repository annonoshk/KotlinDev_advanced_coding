package objects

/*
 * Fix an error
You want to create a function getPlayerInfo() that receives a player and returns information using the getInfo() function. However, the Player class code contains an error. You need to find it, fix the problem, and complete the function.

Write a program in Kotlin
 */

class Player3(val id: Int, val name: String) {

    fun getInfo() = "$id, $name, $role"

    companion object {
        var role = "playable character"
    }
}

fun getPlayerInfo(player: Player3) = player.getInfo() // TODO

fun main() {
    val result = getPlayerInfo(Player3(4,"Huck Kim"))
    println(result)
}