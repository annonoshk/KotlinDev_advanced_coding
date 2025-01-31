package flow

import jdk.jfr.internal.OldObjectSample.emit
import kotlinx.coroutines.flow.*

/*
 * Combine multiple transformations
We have a flow that emits all integer numbers.

Add transformations to it to only take the first 10 even numbers greater than 99. Also, convert these numbers into a string representation in the hexadecimal (base 16) format.

Tip: An even number is a number divisible by 2.

Tip: Convert int into string with a given radix using the Int.toString(radix: Int) function.

Write a program in Kotlin
 */
// transform given intFlow into a new one according to the task

suspend fun main() {
    val intFlow = flowOf(400,449,4949,44994,49494,49494,49494,4949,499,4949,223,2323,23,23,5050,443,4434,34,34,3434,3434,232,35,454,433466,666)
    val flow = intFlow
    .filter { it > 99 && it % 2 == 0 }
    .take(10)
    .map { it.toString(16) }

    flow.collect {
        println(it)
    }
}


