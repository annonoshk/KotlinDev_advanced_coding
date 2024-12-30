import java.lang.StringBuilder

fun Int.isEven() = this % 2 == 0
//val sum: (Int, Int) -> Int = { a, b -> a + b }
val sum: Int.(Int) -> Int = { a -> this + a }
//val sum: (Int,Int) -> Int = { a, b -> a + b }
//fun Int.opp(f: Int.() -> Int) = f()
/*val Int.opp: (Int.() -> Int) -> Int
get() =  { f -> this.f() }
fun myString(init: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(init).toString()
}
fun MutableMap<String, Any>.apply(block: MutableMap<String, Any>.() -> Unit): MutableMap<String, Any> {
    block()
    return this
}
fun builderString(
    builder: StringBuilder.(String) -> Unit
): String {
    val stringBuilder = StringBuilder()
    stringBuilder.builder("")
    return stringBuilder.toString()
}*/
data class Account(
    val id: Int = 1,
    val amount: Int = 0,
    val result: Int = 0,
    val status: String = "START"
)

fun calculateOperation(
    init: Account,
    func: Account.() -> Account
): Account {
    val account = init.copy(amount = 50)
    return account.func()
}
val isDivisible: Int.(Int) -> Boolean = {
    a -> this % a == 0
    // write your code here
}

fun Int.opp(f:Int.() -> Int) : Int = f()
fun String.magic(init: String.() -> String): String {
   // Write your code here
    return this.init()
}

open class Tag(val name: String) {
    val children = mutableListOf<Tag>()
    fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        // write your code here
        child.init()
        children.add(child)
    }

    override fun toString() =
        "<$name>${children.joinToString("")}</$name>"
}

/* Do not change code below */
fun table(init: TABLE.() -> Unit): TABLE = TABLE().apply(init)

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun main() {

    val myTable = table {
        tr {
  //          for (i in 1..2) {
                td {
                    children.add(Tag("span"))
  //              }
            }
        }
    }
    println(myTable)


/*    val str = readLine()!!
    val res = str.magic {
        uppercase().reversed().dropLast(1)
    }
    println(res)*/

/*    10.opp { this.times(2) } // a
*//*    10.opp { it.minus(2) } // b
    10.opp { toChar() } // c*/
 /*   10.opp { plus(10) } // d
    10.opp { plus(10).div(10) } // e
    10.opp { this * 2 } // f

    val (a, b) = readln().split(' ').map { it.toInt() }
    println(a.isDivisible(b))*/

  //  val (INC, CTE) = readLine()!!.split(' ').map { it.toInt() }

 //   val res = calculateOperation(Account()) {
        // write your code here
//*//*        val account = copy(status = "END")
/*        account.copy(result = INC*CTE*amount)*
        Account(id,amount, result = INC*CTE*amount, status = "END")
    }*/
 //   println(res)*/
/*    val a = readln()
    val res = builderString {
        // write your code here
        append("<tag>")
        append(a)
        append("</tag>")
    }
    println(res)*/
/*    println("Is 2 even?: ${2.isEven()}") // true
    println("Is 3 even?: ${3.isEven()}") // false

    println(2.isEven())
    println(sum(1, 2)) // 3
    println(sum(1, 2)) // 3
    println(1.sum(2)) // 3*/
/*    println(3.times(2))
    println(10.opp { this.times(2) })
    println(2.opp { plus(2) })

    val str = myString {
        append("Hello, ".uppercase())
        append("World!")
    }
    println(str) // HELLO, World!
    println(10.opp { this * 2 })*/


}





