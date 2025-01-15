package charSeq

fun main() {
    val charSequence: CharSequence = "example"
    println("CharSequence: $charSequence")

    val charAt: Char = charSequence[0]
    println("Char at index 0: $charAt")

    val subSequence: CharSequence = charSequence.subSequence(1, 4)
    println("Sub-sequence from index 1 to 4: $subSequence")

    val contains: Boolean = charSequence.contains("amp", ignoreCase = true)
    println("CharSequence contains 'amp': $contains")
}