package jumpsReturn

fun foo() {
    val number = intArrayOf(1, 2, 3, 4, 5)
    for (it in number) {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun main() {
    foo() // calling foo()
    println()
    println("foo() is over")
    for (i in 1..10) {
        for (j in 1..10) {
            println("i = $i, j = $j")
            if (j == 3) return // local return to the caller of main()
        }
        println("this point is unreachable")
    }
    println("this point is unreachable")
}