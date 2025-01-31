package collections



/*
 * The Empire strikes back
The Resistance is organizing ships to confront the Empire. They are going to reload the weapons. R2D2 has a list with the names of the ships and another one – with the initial ammunition that ships with the same index carry. The droid should get a single list with the ship names and the reloaded ammunition, which should be a double value of the initial ammunition. You must code R2D2's AI to print the list that solves this problem of organizing the ships.

Sample Input 1:

XWing-100 YWing-200 TWing-50 TIEFighter-300

Sample Output 1:

[(XWing, 200), (YWing, 400), (TWing, 100), (TIEFighter, 600)]
 */

data class Ship(val name: String, val ammunition: Int)

fun main() {
    val ships = readln().split(" ")
    val shipsList = ships.map { Ship(it.split("-")[0], it.split("-")[1].toInt()) }
    val shipsNames = shipsList.map { ship -> ship.name }
    val shipsAmmo = shipsList.map { ship -> ship.ammunition }

    // write your code here
    val res = shipsList.map { ship -> Pair(ship.name, ship.ammunition * 2) }


    println(res)
}