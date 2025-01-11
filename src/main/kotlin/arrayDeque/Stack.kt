package arrayDeque

import java.util.*


import java.util.*

fun main() {
    val stack = Stack<Int>()

    // push at top
    stack.push(1)
    stack.push(2)
    stack.push(3)

    println(stack) // [1, 2, 3]

    // pop from top
    stack.pop()

    println(stack) // [1, 2]

    // peek at top
    println(stack.peek()) // 2

    println(stack) // [1, 2]

    // search for element
    println(stack.search(1)) // 2
    //println(stack.search(9)) // -1
    println(stack.search(2)) // 1

    // is empty?
    println(stack.empty()) // false

    val listOfNames = listOf("John", "Jane", "Mary", "Peter", "Paul", "George")
    val stackOfNames = Stack<String>()

    stackOfNames.addAll(listOfNames)
    while (stackOfNames.isNotEmpty()) {
        print(stackOfNames.pop())
        print(" ")
    }

}