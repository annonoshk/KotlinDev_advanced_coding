package kotlinxSerialization

/*
 * Print JSON
The following program reads the name and the position of an employee from the standard input. Then, it prints this information in the JSON format (see the sample input and output).

Write the missing code for serializing the data and printing the relevant JSON string.

Sample Input 1:

Jack Peters,Engineer

Sample Output 1:

{"name":"Jack Peters","position":"Engineer"}
 */

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class Employee(val name: String, val position: String)

fun main() {
    val (name, position) = readln().split(",")
    val employee = Employee(name, position)
    val json = Json { prettyPrint = false }
    println(json.encodeToString(employee))
    // Write your code here
}