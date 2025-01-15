package random

import kotlin.random.Random

fun main() {
    // generates an integer value between Int.MIN_VALUE and Int.MAX_VALUE (inclusive)
/*    println( Random.nextInt() )
    // generates a long value between Long.MIN_VALUE and Long.MAX_VALUE (inclusive).
    println( Random.nextLong() )
    // generates a float value between 0 (inclusive) and 1.0 (exclusive)
    println( Random.nextFloat() )
    // generates a double value between 0 (inclusive) and 1.0 (exclusive)
    println( Random.nextDouble() )
    // same thing one more time
    println( Random.nextDouble() )*/

    val randomGenerator42 = Random(42) // the generator takes the seed
    for (i in 0..5) {
        print(randomGenerator42.nextInt(100))
    }

    // the same generator we use when we call Random.nextInt(), Random.nextFloat() etc.
    val defaultGenerator = Random.Default
    for (i in 0..5) {
        println(defaultGenerator.nextInt(100))
    }

}