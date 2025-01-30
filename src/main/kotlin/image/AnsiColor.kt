package image

fun main() {
    for (i in 30..37) print("\u001b[${i}m ${"%3d".format(i)} ")
    for (i in 90..97) print("\u001b[${i}m ${"%3d".format(i)} ")

    // Reset colors
    println("\u001B[0m")

    // Set background colors
    for (i in 40..47) print("\u001b[${i}m ${"%3d".format(i)} ")
    for (i in 100..107) print("\u001b[${i}m ${"%3d".format(i)} ")

    // Reset colors
    println("\u001B[0m")

    // Standard foreground colors
    for (i in 0..15) print("\u001b[38;5;${i}m ${"%3d".format(i)}")

    // 216 foreground colors
    for (i in 16..231) {
        if ((i - 16) % 36 == 0) println()
        print("\u001b[38;5;${i}m ${"%3d".format(i)}")
    }
    println("\u001B[0m")

    // Foreground grayscale shades
    for (i in 232..255) print("\u001b[38;5;${i}m ${"%3d".format(i)}")
    println()

    // Standard background colors
    for (i in 0..15) print("\u001b[48;5;${i}m ${"%3d".format(i)}")

    // 216 background colors
    for (i in 16..231) {
        if ((i - 16) % 36 == 0) println("\u001B[0m")
        print("\u001b[48;5;${i}m ${"%3d".format(i)}")
    }
    println("\u001B[0m")

    // Background grayscale shades
    for (i in 232..255) print("\u001b[48;5;${i}m ${"%3d".format(i)}")
    println("\u001B[0m")

    print("\u001b[38;2;255;255;0;48;2;255;0;127mHello World!\u001B[0m")
}
// Set foreground colors
