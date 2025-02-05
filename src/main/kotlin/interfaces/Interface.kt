package interfaces

interface shape {
    val angles: Int
    val scale: Double

    fun draw()
}
class Triangle {
    val angles: Int = 3
    val scale: Double = 1.0

    fun draw() {
        /* ... */
    }
}

class Rectangle {
    val angles: Int = 4
    val scale: Double  = 1.0

    fun draw() {
        /* ... */
    }
}

class Hexagon {
    val angles: Int = 6
    val scale: Double = 1.0

    fun draw() {
        /* ... */
    }
}