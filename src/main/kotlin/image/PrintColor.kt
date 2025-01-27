package image

import java.awt.Color
import java.awt.image.BufferedImage


fun main() {

    printColor(BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB))
    printARGB()
}
fun printColor(myImage: BufferedImage) {

    val (x,y) = readln()!!.split(" ").map {it.toInt()}
    val color = Color(myImage.getRGB(x, y), true)
    println("${color.red} ${color.green} ${color.blue} ${color.alpha}")
}

fun printARGB() {
    val (a, r, g, b) = readln()!!.split(" ").map { it.toInt() }

    if (a !in 0..255 || r !in 0..255 || g !in 0..255 || b !in 0..255) {
        println("Invalid input")
        return
    }

    val color = Color(r, g, b, a)
    val argb = color.rgb.toUInt() and 0xFFFFFFFFu
    println(argb)
}
