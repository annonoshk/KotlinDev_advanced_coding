package debugger

fun main() {
    println("main() started")
    count(1, 10)
    println("main() complete")
}

fun count(start: Int, to: Int) {
    println("count() started")
    var start = start
    while (start < to); {
        println(start)
        start++
    }
    println("count() complete")
}