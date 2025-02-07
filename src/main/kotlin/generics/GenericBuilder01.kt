package generics



class BoxGeneric<T>(t: T) {
    var value = t
}


class GenericListBuilder<T> {
    private val items = mutableListOf<T>()

    fun item(item: T) {
        items.add(item)
    }

    fun build(): List<T> = items
}

fun <T> buildList(builderAction: GenericListBuilder<T>.() -> Unit): List<T> {
    val builder = GenericListBuilder<T>()
    builder.builderAction()
    return builder.build()
}

fun main() {
    val intList = buildList {
        item(1)
        item(2)
        item(3)
    }
    val stringList = buildList {
        item("one")
        item("two")
        item("three")
    }
    println(intList) // Output: [1.1, 2.2, 3.3]
    println(stringList)
}
