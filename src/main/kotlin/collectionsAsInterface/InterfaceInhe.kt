package collectionsAsInterfaceinterface

interface Listed {
    val index: String
}

// Do not change the code above.

interface Tabulated : Listed {
    val column: Int
    val row: Int
    override val index: String
        get() = "$column, $row"
}

data class Element(
    override val column: Int,
    override val row: Int,
    var value: Int
) : Tabulated

fun main() {
    // code
    val cell1 = Element(1, 2, 10)
    val cell2 = Element(2, 4, 15)
    val cell3 = Element(4, 5, 92372)

    println(cell1.index)
    println(cell2.index)
    println(cell3.index)
}