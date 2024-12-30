/* Do not change code below */



// exilium gold silver bronze platinum
fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.map { it.reversed() }.find { it.startsWith('m') }

    println(res)
}









/*
data class Ship(val name: String, val ammunition: Int)

fun main() {
    val ships = readln().split(" ")
    val shipsList = ships.map { Ship(it.split("-")[0], it.split("-")[1].toInt()) }

    println(shipsList.find { it.ammunition  > 200 }?.name ?: "No ship found")

   // write your code here

}*/
