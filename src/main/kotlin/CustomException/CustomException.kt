package customException
class LessThanZero: Exception("Parameter less than zero")

class GreaterThanTen: Exception("Parameter greater than ten")

class Nothinghappens: Exception("this one never will happen")
fun myFunction(par: Int) {
    if (par < 0) throw LessThanZero()
    else if (par > 10) throw GreaterThanTen()
    else if (par == 0) throw Nothinghappens()
}
class BetweenOneAndFive: Exception("Value between 1 and 5")
class BetweenSixAndTen: Exception("Value between 6 and 10")

class YouveGotLucky: Exception("Value 7")
fun myFunction() {
    val randomInteger = (1..10).shuffled().first()
    println(randomInteger)// Get a random integer between 1 and 10
    if (randomInteger <= 5) throw BetweenOneAndFive()
    else if(randomInteger == 7) throw YouveGotLucky()
    else throw BetweenSixAndTen()
}


class OutOfRange : Exception("not in range 1..26")

fun atoZ() {

    val inputNums = readln()!!.toInt()
    val rangeInt = 1..26
    val rangeAlphabet = 'a'..'z'
    val pair = (rangeInt.zip(rangeAlphabet)).toMap()
    println(pair.get(inputNums) ?: "")
   if(inputNums !in rangeInt) throw OutOfRange()
}

fun main() {
/*    try {
        myFunction()
    } catch (e: BetweenOneAndFive) {
        println("BetweenOneAndFive was thrown")
    } catch (e: BetweenSixAndTen) {
        println("BetweenSixAndTen was thrown")
    } catch ( e:YouveGotLucky) {
        println(" You ve got lucky number")
    }*/
    try {
        atoZ()
    } catch (e: OutOfRange) {
        println(e)
    }
}
/*
fun main() {
    myFunction(0)
}*/
