package inLine

fun main() {

    val width = 10
    val height = 20
    println(calculateAreaWithoutInline(width, height)) // A new function object will be created here
    println(calculateAreaWithoutInline(width, height)) // and here
    println(calculateAreaWithoutInline(width, height)) // and here
    println(calculateAreaWithoutInline(width, height)) // and here
    println(calculateAreaWithoutInline(width, height)) // and here

    println(width * height) // The compiler copies its body to the place where the function is called
    println(width * height) // without creating a new function object
    println(width * height) // also here
    println(width * height) // also here
    println(width * height) // also here
}

fun calculateAreaWithoutInline(width: Int, height: Int): Int {
    return width * height
}

//inline fun calculateAreaWithInline(width: Int, height: Int): Int = width * height