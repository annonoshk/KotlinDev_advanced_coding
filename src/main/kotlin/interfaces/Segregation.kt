package interfaces



/*
 * Start the Cafe!! "Le velouté"
 *
 * The Interface Segregation Principle (ISP) is based on two key points:

objects should not be forced to implement parts of the interfaces they don't use;

many specific interfaces are better than one general-purpose interface.

*/

interface Dish {
    fun Fry()
    fun Boil()
    fun ServerWithSppon()
    fun ServerWithPork()
}

interface Preareable {
    fun Fry()
    fun Boil()
}

interface Serveble {
    fun ServerWithSppon()
    fun ServerWithPork()
}

interface Fryable {
    fun fry(): Boolean
}

interface Boilable {
    fun boil() :Boolean
}

interface WithPork {
    fun serveWithPork():Boolean
}

interface WithSpoon {
    fun serveWithSpoon():Boolean
}

enum class Payment {
    CARD, CASH
}

enum class CoffeeKinds {
    AMMERICANO, LATTE, CAPUCHINO,
}

class Customer(val customer: String, val order: CoffeeKinds = CoffeeKinds.AMMERICANO, val payment: Payment = Payment.CARD, private val isIced: Boolean = false): Boilable, WithPork, WithSpoon, Fryable {
    override fun boil(): Boolean {
        //TODO("Not yet implemented")
        return !isIced
    }

    override fun serveWithPork(): Boolean {
        TODO("Not yet implemented")
    }

    override fun serveWithSpoon(): Boolean {
        TODO("Not yet implemented")
    }

    override fun fry(): Boolean {
        TODO("Not yet implemented")
    }

}


fun main() {
    val customer = Customer("Huck Kim")

    println(customer.boil())

    println("${customer.customer} ordered ${customer.order} with ${customer.payment}")
}