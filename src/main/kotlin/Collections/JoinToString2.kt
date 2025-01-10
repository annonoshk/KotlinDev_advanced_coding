package Collections

/*
 * Harry and the Spell Power
Harry Potter is learning different spells. He has a list of spells and a list of power values. He wants to join each spell with its power in a single list – to print it using the delimiter "-" and to start and end the collection with "|". Please help Harry print the string representation of the Harry Potter' Spell List.

Sample Input 1:

Expetum-98 Patronus-23 Axio-89 Lithigum-23

Sample Output 1:

|(Expetum, 98)-(Patronus, 23)-(Axio, 89)-(Lithigum, 23)|
 */

data class Spell(val name: String, val power: Int)

fun main() {
    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }
    val result = spells.joinToString(separator = "-", prefix = "|", postfix = "|") { "(${it.name}, ${it.power})" }
    println(result)
}
