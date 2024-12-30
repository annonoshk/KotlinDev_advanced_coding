
//val dec: (Int) -> Int = Int::dec
val dec: (Int) -> Int = {x -> x.dec()}


class Person(val name: String, val lastname: String) {

    fun printFullName(): String {
        return("full name: $name $lastname")
    }
}
//Here, we create a function reference:

val person: Person = Person("Sara", "Rogers")
val personFun: () -> String = person::printFullName

//And now, we call the function by using a special function invoke:
fun main(args: Array<String>) {
    println(person.printFullName() + personFun() + personFun.invoke())
    println(dec(4))
//    println(personFun.invoke())
//    print(personFun())
}


//Actually, you can also call the function without the function invoke:



/*white fabric is created
black dots pattern is printed on the fabric*//*


//val fabric = Fabric("white", "dots", "black")
class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"
    init {
        println("$color fabric is created")
    }

    constructor(color: String, pattern: String) : this(color) {
        this.pattern = pattern
        println("$patternColor $pattern pattern is printed on the fabric")
    }
    constructor(color: String, pattern: String, patternColor: String) : this(color) {
        this.pattern = pattern
        this.patternColor = patternColor
        println("$patternColor $pattern pattern is printed on the fabric")
    }
}

fun main() {
    val fabric = Fabric("white","dots") // , "dots", "black")
    println(fabric)
}

*/

/*import java.text.DateFormat
import java.util.Calendar
import kotlin.math.abs*/


/*

import java.security.MessageDigest

data class Android(val name: String, val energy: Int)

fun calculateAndroidsHash(androids: List<Android>): String {
    // Combine all the android strings into one
    val combinedString = androids.joinToString("") { "${it.name}${it.energy}" }

    // Get the SHA-512 hash
    val digest = MessageDigest.getInstance("SHA-512")
    val hashBytes = digest.digest(combinedString.toByteArray())

    // Convert the hash bytes to a hexadecimal string
    val hexString = StringBuilder()
    for (byte in hashBytes) {
        val hex = String.format("%02x", byte)
        hexString.append(hex)
    }

    return hexString.toString()
}

*/
/*fun addDaysToDate(inputDate: String, inputDays: Int): String {
    val dateFormat = DateFormat.getDateInstance(DateFormat.LONG)

    val calendar = Calendar.getInstance()
    val date = dateFormat.parse(inputDate)
    calendar.time = date
    calendar.add(Calendar.DATE, inputDays)
    val newDate = calendar.time
    return dateFormat.format(newDate)
}*//*

fun main() {
    val checkHashValue = "ee47120c1f2fc594934b2acc4b8a1586e86915906f0ad60451ba90e181dd49f043e0c1a3baa82c56bd493b7d98630fa2f5f709a660bc82515965531ed7ec760d"
    val inputList = listOf<Android>(Android("R2D2",100), Android("C3PO",200))

    println(checkHashValue == calculateAndroidsHash(inputList))
    println(calculateAndroidsHash(inputList))

    val muMap = mutableListOf<String>("A","B","C","D","C","C")
    val muSet = mutableSetOf<String>("A","B","C","D","D","A")
    val muIntsList = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10,10,10)

    val muSet1 = mutableSetOf<Int>(8, 11, 12, 13)
    val muSet2 = mutableSetOf<Int>(8,12)
    val setString = setOf("A","B","C","D","A")
    //println(solution(muSet1, muSet2))
  //  println(intsToSet(muIntsList))

    val friends = setOf("Ann", "Alice", "Bonny", "Victor", "Tom")
    //println(findByIndex(friends))
    //println(evenFilter(muSet1))
    //println(solution(setString,muMap))
    val set1 = setOf(10, 11, 14, 16, 2, 1)
    val set2 = setOf(2, 1)

   println(solution(muMap,"C"))

}
fun solution(strings: MutableList<String>, str: String): MutableList<String> {
  return strings.apply {
      for(i in strings) {
          if(i == str)
          set(indexOf(str),"Banana")
      }
  }
     //return strings.filter { it != str }.toMutableList()
}
fun solution7(elements: MutableList<String>, index: Int): MutableList<String> {
    // put your code here
    return elements.apply { removeAt(index) }.toMutableList()

}
fun solution7(first: Set<Int>, second: Set<Int>): Set<Int> {
    return first.filter { it % second.size == 0 }.toSet()
}

fun solution7(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    //return
    return (setSource + listSource).toMutableSet()
}

fun solution5(elements: MutableSet<Int>, element: Int): MutableSet<Int> {
    // put your code here
    return if (elements.contains(element)) mutableSetOf() else elements
    if(elements.contains(element))
        return mutableSetOf<Int>()
    else return elements
}

fun evenFilter(numbers: Set<Int>): Set<Int> {
    // put your code here
    val result = mutableSetOf<Int>()
    result.addAll(numbers.filter { it % 2 == 0 })
    return result
}

fun solution4(first: Set<String>, second: MutableList<String>): Boolean {
    return (second.toSet() == first)
}

fun intsToSet(ints: MutableList<Int>): Set<Int> {
    return ints.toSet()
}

fun solution1(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    return (numbers1 - numbers2).size
}

fun solution2(strings: MutableList<String>): Set<String> {
    return strings.toSet()
}

fun solution5(first: Set<String>, second: Set<String>): Set<String> {
    return (first + second)
}

fun findByIndex(names: Set<String>): String {
    return "${names.indexOf("Alice")}, ${names.indexOf("Victor")}"
}*/
