open class Rectangle(val width: Int, val height: Int) {
    open fun draw() {
        println("Drawing a rectangle with width=$width and height=$height")
    }
}

class Square(side: Int) : Rectangle(side, side) {
    override fun draw() {
        println("Drawing a square with side=$width")
    }
}

fun main() {
    val square = Square(5)
    square.draw()

}