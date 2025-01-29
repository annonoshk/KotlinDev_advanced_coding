package requireCheckAssert

/*
Androids list
Luke Skywalker has a function that accepts as parameters a list of android objects that have an id (Int) and an energy value (Int) as properties, and we want to calculate the total lambdaExpression.getSum of energy following: fun calculateTotalEnergy(androids: List<Android>): Int . We have the following restrictions:

If the list is empty, we will get an exception of type IllegalArgumentException with the message: "List of androids cannot be empty".
If an android has energy less than zero, we will return the exception IllegalStateException with the message: "Android energy must be greater than or equal to zero".
Complete the code using check and require to write the required function.

 Input 123:20 234:30 345:40
 Output 90
 */
data class Android(val id: Int, val energy: Int)

fun calculateTotalEnergy(androids: List<Android>): Int {
    require(androids.isNotEmpty()) { "List of androids cannot be empty" }

    var totalEnergy = 0
    for (android in androids) {
        check(android.energy >= 0) { "Android energy must be greater than or equal to zero" }
        totalEnergy += android.energy
    }

    return totalEnergy
}


fun main() {
    while(true) {
        val androidList = mutableListOf<Android>()
        val input = readln()
        println(input)
        if(input.equals("stop")) break

        val inputList = input.split(" ")


        for (i in inputList) {
            val middle = i.split(":")
            androidList.add(Android(middle[0].toInt(),middle[1].toInt()))
        }
        println(calculateTotalEnergy(androidList))
        androidList.clear()
    }

}