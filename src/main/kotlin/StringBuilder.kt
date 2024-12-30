fun main() {
    val sb1 = StringBuilder("Kotlin")
    val sb2 = StringBuilder(sb1)
    val sb4 = StringBuffer(100)

    println(sb1)
    println(sb2)
    println(sb4)

    val sb3 = buildString {
        append("")
    }

    val sb = StringBuilder()
    println("Length: ${sb.length}, Capacity: ${sb.capacity()}") // Output: Length: 0, Capacity: 16
    sb.append("Hello!")
    sb.append(10)
    sb.append(19121212)

    println("Length: ${sb.length}, Capacity: ${sb.capacity()}") // Output: Length: 6, Capacity: 16

    println(sb3)
}