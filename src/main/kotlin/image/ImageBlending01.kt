package image

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    // Create a BufferedImage instance for the first input file
    val inputFile1 = File("image1.png")
    val image1: BufferedImage = ImageIO.read(inputFile1)
    // Create a BufferedImage instance for the second input file
    val inputFile2 = File("image2.png")
    val image2: BufferedImage = ImageIO.read(inputFile2)
    // Create a BufferedImage instance for the output file
    val outputImage: BufferedImage = BufferedImage(image1.width, image1.height, BufferedImage.TYPE_INT_RGB)

    // For every pixel in the same position in the two input images
    for (x in 0 until image1.width) {
        for (y in 0 until image1.height) {
            // Read the Color of the pixel in the position (x, y) of the first image
            val color1 = Color(image1.getRGB(x, y))
            // Read the Color of the pixel in the position (x, y) of the second image
            val color2 = Color(image2.getRGB(x, y))

            // Calculate the new Color of the target pixel
            val color = blendPixels(color1, color2)

            // Set the Color of the pixel in the position (x, y) in the target image
            outputImage.setRGB(x, y, color.rgb)
        }
    }

    // Save the output image
    val outputFile = File("out.png")
    ImageIO.write(outputImage, "png", outputFile)
}

fun blendPixels(firstPixelColor: Color, secondPixelColor: Color): Color {
    // Blend function is implemented here
    return firstPixelColor // { firstPixelColor + secondPixelColor }
}