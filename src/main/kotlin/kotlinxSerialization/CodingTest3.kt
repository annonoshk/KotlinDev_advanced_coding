package kotlinxSerialization

/*
 * Easy
180
2 weeks ago
 Report a typo
Read JSON information
The input to the following program is a JSON string containing data about a city: its name and population. The program processes this string and prints the relevant data.

Fill in the missing code.

Sample Input 1:

{"name":"Barcelona","population":170000}

Sample Output 1:

Barcelona 170000
 */

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class City(val name: String, val population: Int)

fun main() {
    val jsonString = readln()

    val city = Json.decodeFromString<City>(jsonString)

    println("${city.name} ${city.population}")

    println(10 / (2 + 2) + 4 * 8)
}