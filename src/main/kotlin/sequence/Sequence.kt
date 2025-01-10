package sequence

// # 1 ana arara casa ovo radar reviver sator solos stats tenet xanax
// # 2 expetum axio lithigum magnum anima

fun main() {
    val input = readln().split(" ").asSequence()
        .filter {it.length > 5 }
        .map { it.reversed().uppercase() }
        .take(3)
        .toList()
    println(input)
}