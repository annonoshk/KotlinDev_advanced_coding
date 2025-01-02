package CollectionsAsInterface

// All realizations of the function printAll do the same thing.

fun printAll(strings: Collection<String>) {
    for(str in strings) println("$str ")
}

fun printAll2(songs: Collection<String>) {
    songs.forEach { println("$it ") }
}

fun printAll3(songs: Collection<String>) {
    val songsIterator = songs.iterator() // We create iterator, which will help us go through the List

    while (songsIterator.hasNext()) { // hasNext() checks if our iterator contains next element
        println("${songsIterator.next()} ") // next() moves the pointer to the next element of iterator
    }
}
fun main() {
    val listOfSongs = listOf("Creep", "Idioteque", "Street Spirit", "Paranoid Android") // We can also use setOf()
    printAll(listOfSongs) // Creep Idioteque Street Spirit Paran
    printAll2(listOfSongs)
    printAll3(listOfSongs)
}
