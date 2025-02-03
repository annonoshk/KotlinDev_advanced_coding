package algorithm

import kotlin.math.sqrt

/*
fun jumpSearch(arr: IntArray, x: Int): Pair<Int, Int> {
    val n = arr.size
    var step = Math.sqrt(n.toDouble()).toInt()
    var comparisons = 0 // Count comparisons

    var prev = 0
    while (arr[Math.min(step, n) - 1] < x) {
        comparisons++ // Comparison in the jump
        prev = step
        step += Math.sqrt(n.toDouble()).toInt()
        if (prev >= n)
            return Pair(-1, comparisons) // Element not found
    }

    while (arr[prev] < x) {
        comparisons++ // Comparison in the linear search
        prev++
        if (prev == Math.min(step, n))
            return Pair(-1, comparisons) // Element not found
    }

    if (arr[prev] == x) {
        comparisons++ // Final comparison
        return Pair(prev, comparisons)
    }

    return Pair(-1, comparisons) // Element not found
}

fun findMaxComparisonsIndex(results: List<Pair<Int, Int>>): Int {
    if (results.isEmpty()) {
        return -1 // Handle empty list case
    }

    var maxComparisons = results[0].second
    var maxIndex = 0

    for (i in 1 until results.size) {
        if (results[i].second > maxComparisons) {
            maxComparisons = results[i].second
            maxIndex = i
        }
    }

    return maxIndex
}


fun main() {
    val arr = IntArray(101) { it + 1 }
    //println(arr.toList())
    val x = 101

    val result = jumpSearch(arr, x)
    val searchResults = mutableListOf<Pair<Int, Int>>()

    if (result.first != -1)
        println("Element $x is found at index ${result.first} after ${result.second} comparisons")
    else
        println("Element $x is not found after ${result.second} comparisons")


    val y = List<Int>(100) {( it + 1 ) }
    for (i in y) {
        val result2 = jumpSearch(arr, i)
        if (result2.first != -1) {
            println("Element $i is found at index ${result2.first} after ${result2.second} comparisons")
            println()
        }
        else
            println("Element $i is not found after ${result2.second} comparisons")
    }

    val maxIndex = findMaxComparisonsIndex(searchResults)

    if (maxIndex != -1) {
        println("\nThe maximum number of comparisons (${searchResults[maxIndex].second}) was made when searching for ${searchValues[maxIndex]}.")
    } else {
        println("No search results to analyze.")
    }

}*/

fun jumpSearch(arr: IntArray, x: Int): Pair<Int, Int> {
    val n = arr.size
    var step = Math.sqrt(n.toDouble()).toInt()
    var comparisons = 0 // Count comparisons

    var prev = 0
    while (arr[Math.min(step, n) - 1] < x) {
        comparisons++ // Comparison in the jump
        prev = step
        step += Math.sqrt(n.toDouble()).toInt()
        if (prev >= n)
            return Pair(-1, comparisons) // Element not found
    }

    while (arr[prev] < x) {
        comparisons++ // Comparison in the linear search
        prev++
        if (prev == Math.min(step, n))
            return Pair(-1, comparisons) // Element not found
    }

    if (arr[prev] == x) {
        comparisons++ // Final comparison
        return Pair(prev, comparisons)
    }

    return Pair(-1, comparisons) // Element not found
}

fun jumpSearchBackwardLinear(arr: IntArray, x: Int): Pair<Int, Int> {
    val n = arr.size
    var step = sqrt(n.toDouble()).toInt()
    var comparisons = 0

    var prev = 0

    // Find the block
    while (prev < n && arr[Math.min(step, n) - 1] < x) {
        comparisons++ // Comparison in the jump
        prev = step
        step += sqrt(n.toDouble()).toInt()
    }

    var i = Math.min(step, n) - 1

    // Backward linear search
    while (i >= prev && arr[i] > x) {
        comparisons++ // Comparison in the backward search
        i--
    }

    if (i >= prev && arr[i] == x) {
        comparisons++ // Final comparison
        return Pair(i, comparisons)
    }

    return Pair(-1, comparisons) // Element not found
}

fun findMaxComparisonsIndex(results: List<Pair<Int, Int>>): Int {
    if (results.isEmpty()) {
        return -1 // Handle empty list case
    }

    var maxComparisons = results[0].second
    var maxIndex = 0

    for (i in 1 until results.size) {
        if (results[i].second > maxComparisons) {
            maxComparisons = results[i].second
            maxIndex = i
        }
    }

    return maxIndex
}

fun main() {
    val arr = IntArray(101) { it + 1 }
    val searchValues = List<Int>(101) {it + 1} // Example search values

    val searchResults = mutableListOf<Pair<Int, Int>>()

    for (value in searchValues) {
        searchResults.add(jumpSearch(arr, value))
    }

    for ((index, result) in searchResults.withIndex()) {
        if (result.first != -1) {
            println("Element ${searchValues[index]} is found at index ${result.first} after ${result.second} comparisons")
        } else {
            println("Element ${searchValues[index]} is not found after ${result.second} comparisons")
        }
    }


    val maxIndex = findMaxComparisonsIndex(searchResults)

    if (maxIndex != -1) {
        println("\nThe maximum number of comparisons (${searchResults[maxIndex].second}) was made when searching for ${searchValues[maxIndex]}.")
    } else {
        println("No search results to analyze.")
    }
}