import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
fun String?.isNotNull(): Boolean {
    contract {
        returns(true) implies (this@isNotNull != null)
    }
    return this != null
}

fun foo(s: String?) {
    if (s.isNotNull()) s.length // Smartcast :)
}

@OptIn(ExperimentalContracts::class)
/*fun Any?.isPerson(): Boolean {
    contract {
        returns(true) implies (this@isPerson == true)
    }
    // Your code goes here

    return this is Person
}*/
/*class Cat {
    val name: String by lazy {
        println("I prefer to ignore it")
        callName()
    }

    fun callName(): String {
        println("Input the cat name")
        return readLine() ?: ""
    }
}

// Example usage:
fun main() {
    val cat = Cat()
    println(cat.name)  // This will trigger the callName function and set the name
}*/

fun main() {
    val a: String by lazy {
        print("a")
        "c"
    }
    val b: String by lazy {
        print("b")
        a
    }
    print(a)
    print(b)
}


/*
class StringBuilderWrapper {
    private val stringBuilder = StringBuilder()

    fun append(value: String) {
        stringBuilder.append(value)
    }

    fun newline() {
        stringBuilder.appendln()
    }

    fun build(): String {
        return stringBuilder.toString()
    }
}

fun buildString(block: StringBuilderWrapper.() -> Unit): String {
    // Write your code here
    val stringBuilderWrapper = StringBuilderWrapper()
    stringBuilderWrapper.block()
    return stringBuilderWrapper.build()
}


*/




/*
class TableBuilder {
    private val rows = mutableListOf<TableRowBuilder>()

    fun row(block: TableRowBuilder.() -> Unit) {
        val rowBuilder = TableRowBuilder()
        rowBuilder.block()
        rows.add(rowBuilder)
    }

    fun build(): String {
        val tableContent = buildString {
            append("<table>")
            for (row in rows) {
                // Write your code here
            }
            append("</table>")
        }
        return tableContent
    }
}

class TableRowBuilder {
    private val cells = mutableListOf<String>()

    fun cell(value: String) {
        cells.add(value)
    }

    fun build(): String {
        val rowContent = buildString {
            append("<tr>")
            for (cell in cells) {
                // Write your code here
            }
            append("</tr>")
        }
        return rowContent
    }
}

fun table(block: TableBuilder.() -> Unit): String {
    // Write your code here
    val tableBuilder = TableBuilder()
    tableBuilder.block()
    return tableBuilder.build()
}

fun main() {
    val htmlTable = table {
        row {
            cell("Name")
            cell("Age")
        }
        row {
            cell("John Doe")
            cell("25")
        }
        row {
            cell("Jane Smith")
            cell("30")
        }
    }

    println(htmlTable)
}*/
