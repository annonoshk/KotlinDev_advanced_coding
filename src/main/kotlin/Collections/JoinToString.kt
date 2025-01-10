package Collections

/*
 * List of students
You have a list of students. Please print the representation of a map where the key is the name of the student and the value is the length. It is limited to two values, and when it is truncated, we use "*"; the map key and value should be separated by "->".

Sample Input 1:

luis anne dimitry

Sample Output 1:

luis->4, anne->4, *
 */

fun main() {
    val list = readln().split(" ")
    // write your code here
   val map = list.associateWith { name-> name.length }
    //   map.entries.joinToString(", ") { "${it.key}->${it.value}" }
    val result=    map.entries.joinToString(
        separator = ", ",
        limit = 2,
        truncated = "*") {"${it.key}->${it.value}"}
    println(result)

    

}