package objects

import kotlin.math.abs

/*
 * Me
Make an object Me that stores the following constants: CURRENT_AGE = 18, EYES_COLOR = green, and HEIGHT = 188.

Library
In this task, you will create a simple equivalent of the Math library with one function for calculating modules.

You need to add two abs functions in the Math singleton. One of these functions should receive an Int value, while the other works with Double. These functions must return the absolute value of the obtained variable.

Let's create your own library!

Tip: Note that the absolute value of 0 is 0.

 Cell
You have a class Cell with a nested object BaseProperties. This nested object contains two properties height and width. However, the dimensions of a cell may be different from the default ones, so you need to create its own height and width with the default values from the singleton BaseProperties.

Do not copy and paste values!
 */

//#1
object Me {
    const val CURRENT_AGE = 18
    const val EYES_COLOR = "green"
    const val HEIGHT = 188

}
//#2
object Math {
    fun fun1(value:Int) = abs(value)
    fun fun1(value:Double) = abs(value)
}

object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
    }
    fun changeSize(newWidth: Int, newHeight: Int) {
        Size.width = newWidth
        Size.height = newHeight
    }
 }
class Cell {
    object BaseProperties {
        const val DEFAULT_WIDTH = 10
        const val DEFAULT_HEIGHT = 10

        var width = 10
        var height = 10
    }
}
fun main() {
    println(Math.fun1(-3))
    println("PlayingField.Size.width: ${PlayingField.Size.width} PlayingField.Size.height: ${PlayingField.Size.height}" )
    PlayingField.changeSize(3,2)
    println("PlayingField.Size.width: ${PlayingField.Size.width} PlayingField.Size.height: ${PlayingField.Size.height}" )
}