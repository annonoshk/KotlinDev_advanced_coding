package image


/*
 *
 * 1. Drawing a red square

Write a function that returns a buffered image of size 500x500. The image should have TYPE_INT_RGB color components, and it should contain a red square starting at position (100, 100), with the side length of 300.

Hint: A square is a rectangle with equal sides.

The return value of the function should be a BufferedImage with the following contents:

 2. Drawing four circles
Write a function that returns a buffered image of size 200x200. The image should have TYPE_INT_RGB color components, and it should contain four ovals of width and height 100 (i.e., circles) drawn in this exact order:

a red circle, at position (50, 50)

a yellow circle, at position (50, 75)

a green circle, at position (75, 50)

a blue circle, at position (75, 75)

The return value of the function should be a BufferedImage with the following contents:

3. Drawing three strings
Write a function that returns a buffered image of size 200x200.

The image should have TYPE_INT_RGB color components, and it should contain the string Hello, images! drawn three times in this exact order:

a red one, at position (50, 50)

a green one, at position (51, 51)

a blue one, at position (52, 52)

The return value of the function should be a BufferedImage with the following contents:

4. Drawing two lines
Write a function that returns a buffered image of size 200x200.

The image should have TYPE_INT_RGB color components, and it should contain two lines drawn in this exact order:

a red one, starting at position (0, 0) and ending at position (200, 200);

a green one, starting at position (200, 0) and ending at position (0, 200).

The return value of the function should be a BufferedImage with the following contents:

5. Drawing a polygon
Write a function that returns a buffered image of size 300x300. The image should have TYPE_INT_RGB color components, and it should contain a polygon drawn in this exact order:

the first point, at position (50, 150)

the second point, at position (100, 250)

the third point, at position (200, 250)

the fourth point, at position (250, 150)

the fifth point, at position (200, 50)

the sixth point, at position (100, 50)

The return value of the function should be a BufferedImage with the following content:
 */
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

val seperator: String = File.separator // ${seperator}
val workingDirectory: String = System.getProperty ("user.dir")
val absolutePath = "${workingDirectory}${seperator}src${seperator}main${seperator}kotlin${seperator}image${seperator}"

fun main() {
    val imageFile1 = File("${absolutePath}mySquare.png")
    val imageFile2 = File("${absolutePath}myCircles.png")
    val imageFile3 = File("${absolutePath}myStrings.png")
    val imageFile4 = File("${absolutePath}myLines.png")
    val imageFile5 = File("${absolutePath}myPolygon.png")

    val imageSquare = drawSquare()
    val imageCircles = drawCircles()
    val imageStrings = drawStrings()
    val imageLines = drawLines()
    val imagePolygon = drawPolygon()

    saveImage(imageSquare, imageFile1)
    saveImage(imageCircles, imageFile2)
    saveImage(imageStrings, imageFile3)
    saveImage(imageLines, imageFile4)
    saveImage(imagePolygon, imageFile5)
}
fun drawSquare(): BufferedImage {
  // Add your code here
    val width = 500
    val height = 500
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    // Fill the background with white color
    graphics.color = Color.WHITE
    graphics.fillRect(0, 0, width, height)

    // Draw the red square
    graphics.color = Color.RED
    val squareSize = 300
    val startX = 100
    val startY = 100
    graphics.drawRect(startX, startY, squareSize, squareSize)
    graphics.dispose()
    return image
}

fun drawStrings(): BufferedImage {
    val width = 200
    val height = 200
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    // Fill the background with white color
 /*   graphics.color = Color.WHITE
    graphics.fillRect(0, 0, width, height)*/

    // Draw the red string
    graphics.color = Color.RED
    graphics.drawString("Hello, images!",50, 50)

    // Draw the green string
    graphics.color = Color.GREEN
    graphics.drawString("Hello, images!",51, 51)

    // Draw the blue string
    graphics.color = Color.BLUE
    graphics.drawString("Hello, images!",52, 52)

    graphics.dispose()

    return image

}

fun drawCircles(): BufferedImage {
  // Add your code here
    val width = 200
    val height = 200
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    graphics.color = Color.RED
    graphics.drawOval(50, 50, 100, 100)

    // Draw the yellow circle
    graphics.color = Color.YELLOW
    graphics.drawOval(50, 75, 100, 100)

    // Draw the green circle
    graphics.color = Color.GREEN
    graphics.drawOval(75, 50, 100, 100)
    graphics.dispose()
    return image
}

fun drawLines(): BufferedImage {
  // Add your code here
    val width = 200
    val height = 200
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()

    graphics.color = Color.RED
    graphics.drawLine(0,0,200,200)

    graphics.color = Color.GREEN
    graphics.drawLine(200,0,0,200)
    graphics.dispose()
    return image
}

fun drawPolygon(): BufferedImage {
  // Add your code here
    val width = 300
    val height = 300
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    val xPoints = intArrayOf(50, 100, 200, 250, 200, 100)
    val yPoints = intArrayOf(150,250,250,150,50,50)

    graphics.color = Color.YELLOW
    graphics.drawPolygon(xPoints,yPoints,6)
    graphics.dispose()
    return image
}