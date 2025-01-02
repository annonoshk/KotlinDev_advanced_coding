package StackTrace.kt

import java.util.Scanner

fun demo(input: String) {
    for (element in Thread.currentThread().stackTrace) {
        println(element)
    }
    val number = input.toInt() // an exception is possible here!
    println(number + 1)
}

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        val input: String = scanner.nextLine()
        if (input == "stop") break
        try {
            /*val number = input.toInt() // an exception is possible here!
            println(number + 1)*/
            demo(input)
        } catch (e: NumberFormatException) {
            println("You didn't type an INT number!")
        } catch (e: Exception) {
            println("An unexpected error occurred: ${e.message}")
        }
    }
    println("Program terminated.")
}
