package image

import java.io.File                   // Import the File class for file handling
import javax.imageio.ImageIO          // Import the ImageIO class for reading and writing images
import java.awt.image.BufferedImage   // BufferedImage Class
import java.awt.Color                 // Color class

fun main() {
   val inputFile = File("src\\main\\kotlin\\image\\Crevolika_CI.png")  // Create a file instance in order to read the "24bit.png" image file

   // Create a BufferedImage instance from the 24-bit image file data
   val myImage: BufferedImage = ImageIO.read(inputFile)

   // myImage.width is the image width
   // myImage.height is the image height
   for (x in 0 until myImage.width) {               // For every column.
       for (y in 0 until myImage.height) {          // For every row
           val color = Color(myImage.getRGB(x, y))  // Read color from the (x, y) position

           val g = color.green              // Access the Green color value
           val b = color.blue               // Access the Blue color value
           // Use color.red in case the Red color is needed

           val colorNew = Color(255, g, b)  // Create a new Color instance with the red value equal to 255
           myImage.setRGB(x, y, colorNew.rgb)  // Set the new color at the (x, y) position
       }
   }
   val outputFileJpg = File("newImageFile.jpg")  // Output the file
   ImageIO.write(myImage, "jpg", outputFileJpg)  // Create an image using the BufferedImage instance data
}