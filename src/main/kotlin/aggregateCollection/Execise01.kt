package aggregateCollection
/*
 *he Empire strikes back
Medium
687
2 days ago
The Resistance is organizing ships to confront the Empire. R2D2, a droid loyal to Luke Skywalker, using its AI must select the ship for combat knowing that the one with the least ammunition will always be selected first.

Sample Input 1:

HMS-100 USS-200 BMS-50 BMS-150 USS-10

Sample Output 1:

Ship(name=USS, ammunition=10)
 */

data class Ship(val name: String, val ammunition: Int)

fun main() {

    val list = readln().split(" ")
    // write your code here
    val res1 = list.maxOrNull()
    println(res1)
    val names = listOf("anne", "michael", "caroline", "dimitry", "emilio")
    println(names.count { it.length > 6 })

    val ships = readln().split(" ")
    val shipsList = ships.map {
        Ship(it.split("-")[0], it.split("-")[1].toInt())
    }

    // write your code here
    val res2 = shipsList.minByOrNull { it.ammunition }


    println(res2)
}