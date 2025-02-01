package a

var counter: () -> Int = { -42 }

fun reinitializeCounter(): Int {
    var value = 0
    counter = { ++value }
    return value
}

fun main() {
    println(counter())
    println(reinitializeCounter())
    println(counter())
}