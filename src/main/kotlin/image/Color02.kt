package image

import java.io.File
import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import java.awt.Color

fun main() {
    // Create a new BufferedImage instance with image size 256 X 256
    // The first parameter is the image width, while the second is the image height
    // The third parameter should be BufferedImage.TYPE_INT_ARGB for a 32-bit image
    // or BufferedImage.TYPE_INT_RGB for a 24-bit image
    val myImage: BufferedImage = BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB)

    for (i in 0 until myImage.width) {
        for (j in 0 until myImage.height) {
            myImage.setRGB(i, j, Color(0, 255, 0, j).rgb)  // Green color with alpha channel value equal to j
        }
    }
    val outputFile = File("alpha.png")         // Output the image
    ImageIO.write(myImage, "png", outputFile)  // Create an image using the BufferedImage
}