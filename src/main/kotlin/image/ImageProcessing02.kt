package image

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    val height: Int = 800
    val width: Int = 600

    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val imageFile = File("myFirstImage.png")

    saveImage(image, imageFile)
}

fun saveImage(image: BufferedImage, imageFile: File) {
  ImageIO.write(image, "png", imageFile)
}