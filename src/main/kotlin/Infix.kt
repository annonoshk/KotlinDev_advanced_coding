// complete the definition
/*

infix fun Int.div(number: Int): Boolean =
    this % number == 0

infix fun Int.mod(x: Int): Int = this % x
infix fun IntRange.add(x: Int): IntRange = this.first + x..this.last + x

*//*    // complete the definition
    *///*?*/*//*.battle(ammunitionLimit: Int): List<String> {
        // write the rest of the code}/*/*/*
/*
data class Ship(val name: String, val ammunition: Int)

infix fun List<Ship>.battle(ammunitionLimit: Int): List<String> {
        // write the rest of the code
    return this.filter { it.ammunition > ammunitionLimit }.map { it.name }
}
*/
//Ford-11 Bismarck-200 Titanic-340 HMS-44
infix fun List<Int>.matrix(code: Int): Int {
    return this.filter { it % code == 0}.sum()
}

infix fun List<String>.secret(limit: Int): Int {
    return filter { it.length > limit }.map { it.length }.sum()
}

    // complete the definition
infix fun List<Double>.average(markLimit: Double): Double {
        return filter { it > markLimit }.average() // write the rest of the code
}
fun main() {
    val inputList = readln()!!.split(" ").map { it.toDouble() }
    val markLimit = readln()!!.toDouble()

   // val matrix = inputList[0].toInt()
    println(inputList)
    println(inputList average markLimit)
}

/*
    val shipList = mutableListOf<Ship>()

    for (list in inputList) {
        val ship = list.split('-')
        shipList.add(Ship(ship[0],ship[1].toInt()))
    }
    println(shipList)
    println(shipList battle 50 )*/

   // println(shipList battle 50)

/*    println(4.div(4))
    println("Hi, Kotlin" matches ".*Kotlin".toRegex() xor ("Kotlin".length > 4))
    println(167 mod 5 in 3..4 add 2)*/

