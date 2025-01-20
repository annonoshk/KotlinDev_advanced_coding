// If a person's height is less than 145cm or more than 210cm



fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val sum = (a..b).sum()
    println(sum)
}


/*
fun countSum(sweets: Map<String, Int>): Int {
    return sweets.values.iterator().asSequence().sum()
}

fun main() {
    // write your code
    val n = readln()!!.toInt()
    var cart = mutableMapOf<String,Int>()

    repeat(n) {
        val (sweet, price) = readln()!!.split(" ")
        cart[sweet] = price.toInt()
    }
    println(countSum(cart)) // do not change this line
}*/
/*

fun main() {
    val n = readln()!!.toInt()
    val cart = mutableMapOf<String,Int>()

    repeat(n) {
        val (sweet, price) = readln()!!.split(" ")
        cart[sweet] = price.toInt()
        println(cart)
    }

    println(cart.values.iterator().asSequence().sum())
}*/
// Sample Input 1:
// 3
// choco 10
// cake 50
// marmelade 25

// Sample Output 1:
// 85

/*
fun main() {
    val list = readln().split(" ")
    val wordCount = linkedMapOf<String, Int>()

    for (word in list) {
        wordCount[word] = wordCount.getOrDefault(word, 0) + 1
    }

    for ((word, count) in wordCount) {
        println("$word $count")
    }
}*/

// Sample Input: little brown fox brown fog
// Sample Output:
// little 1
// brown 2
// fox 1
// fog 1


/*
fun main() {
    var list = readln().split(" ")
    // write your code

    getOrDefault

    val listIter = list.listIterator()

    while (listIter.hasNext()) {
        val key = listIter.nextIndex()
        val value = listIter.next()

        if(list.contains(value))



    }

}
*/





/*
fun checkHeight(iterator: Iterator<Int>) {
    // write your code here
        while(iterator.hasNext()) {
            val height = iterator.next()
            if(height in 145..210)
                println("You can go!")
            else
                println("Sorry, not today")
        }
}

fun main() {
    val list = readln().split(" ").map(Integer::parseInt).toList()
    checkHeight(list.iterator())
}
*/



/*
    val numOfNums = readln()!!.toInt()

    val inputString = IntArray(numOfNums) { readln()!!.toInt() }

    val targetNum = readln()!!.toInt()

    if(inputString.contains(targetNum)) println("YES") else println("NO")*/
/*
    var backFromTheWall = arrayOf("Benjen Stark", "Samwell Tarly", "Gared Tuttle")
    val returnedWatchman = "Jon Snow"

    println( (backFromTheWall + returnedWatchman).joinToString() )
    val capitals = arrayOf("Tokyo", "Moscow", "Paris", "Washington", "Beijing")
    val myEmptyArray = emptyArray<String>()
    val array = IntArray(100)

    array[0] = 1
    array[9] = 10
    array[array.lastIndex] = 100

    println(array.joinToString())
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val n = 6
    val elem = arr[arr[n]]
    println(elem)

    val iArray = IntArray(4)
    println(iArray.joinToString())
    val longs = longArrayOf(100_000_000_001, 100_000_000_002, 100_000_000_003)
    println(longs.joinToString())

    val numbers = readln()!!.split(" ").map { it.toInt()  }.toIntArray()

    if (numbers.isNotEmpty()) {
        val firstIndex = 0
        val lastIndex = numbers.size - 1

        // Swap the first and last elements
        numbers[firstIndex] = numbers[lastIndex].also { numbers[lastIndex] = numbers[firstIndex] }
    }

    println(numbers.joinToString(", "))*/
//}

// Sample run with an example array: 1, 2, 3, 4, 5
// Output: 5, 2, 3, 4, 1
