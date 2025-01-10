package typeBounds

class Storage<T : Book, U: Music>() {
      // some code
}

class Storage2<T: Music>() {

}

open class Book {}
open class Music {}

class Magazine : Book() {}
class Stone : Music() {}


fun <T : Book, U : Music> sortByDate(list1: List<T>, list2: List<U>) { TODO() }

fun main() {
    val storage1 = Storage<Book,Music>()
    val storage2 = Storage<Magazine,Stone>()
   // val storage3 = Storage2<String>() // compile-time error

    /* create instances */
    var listOne: List<Book> = listOf();
    var listTwo: List<Music> = listOf();

    /* invoke methods */
    sortByDate(listOne,listTwo) // OK because Magazine is a subtype of Book
    sortByDate(listOne,listTwo) // Error: String is not a subtype of Book
}