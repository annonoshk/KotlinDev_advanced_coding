package singleTest

/**
 * Car speed
 * Create a program that checks whether a car exceeds a speed limit.
 *
 * Write a function checkSpeed() that will take two arguments: speed and limit.
 * By default the limit is 60 kilometers per hour.
 *
 * The speed contains the actual speed of the car.
 * The limit contains the limit on the road.
 * If there is no special restriction, you must apply the default limit.
 *
 * Output Exceeds the limit by N kilometers per hour where N is kilometers per hour above the limit.
 * If everything's OK, output Within the limit.
 *
 * Sample Input 1:
 *
 * 100
 * 60
 *
 * Sample Output 1:
 *
 * Exceeds the limit by 40 kilometers per hour
* */

/*
fun checkSpeed(speed: Int, limit: Int = 60) {
    // write your code here
    if (speed > limit) {
        println("Exceeds the limit by ${speed - limit} kilometers per hour")
    } else {
        println("Within the limit")
    }
}

fun main() {
    val (speed, limit) = readln().split(" ").map { it.toInt() }
    checkSpeed(speed, limit)

}*/


/**
 * Transforming a list of integers through odd or even checks
 * You are given a list of positive integers.
 * Your task is to create a program that loops over the list and checks each number.
 * If the number is odd, multiply it by 2,
 * if it's even, divide it by 2. Print the transformed list as output.
 * The input will be a string representation of a list of comma-separated integers,
 * and the output should be a string representation of the transformed list of comma-separated integers.
 *
 * Sample Input 1:
 *
 * 1,2,3,4,5
 *
 * Sample Output 1:
 *
 * 2,1,6,2,10
 *
 * Sample Input 2:
 *
 * 6,7,8,9,10
 *
 * Sample Output 2:
 *
 * 3,14,4,18,5
* */
import java.util.*

fun transformList(numbersString: String): String {
    // Converting the String of comma-separated integers to a MutableList of Integers.
    val numbers = numbersString.split(",").map { it.toInt() }.toMutableList()
    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            numbers[i] /= 2
        } else {
            numbers[i] *= 2
        }
    }
    // Put your code here to loop over the list and transform the numbers according to the given constraints.

    // After transforming the list, convert it back to a String and return.
    return numbers.joinToString(",")
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // The input will be read as a String, and you will need to parse it to a MutableList of Integers.
    val numbersString = scanner.nextLine()

    val transformedListString = transformList(numbersString)

    // Print the transformed list as a string.
    println(transformedListString)
}
