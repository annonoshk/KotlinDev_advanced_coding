package aggregateCollection
/*
 * Harry and the Spell Power
Easy
370
2 days ago
Harry Potter is learning different spells. He has a list of spells with their power values. He wants to know which spell is the most powerful.

Sample Input 1:

expetum-98 patronus-23 Axio-89 lithigum-23 madriketom-76

Sample Output 1:

Spell(name=expetum, power=98)
 */

data class Spell(val name: String, val power: Int)

fun main() {
/*    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }

    // write your code here
    val res1 = spells.maxByOrNull { it.power }

    println(res1)*/

    val list = readln().split(" ")
    // write your code here
    val res2 = list.sumOf { it.length }
    println(res2)
}