package objectExpression

interface ClickListener {
    fun onClick()
}

class Button {
    private var clickListener: ClickListener? = null

    fun setOnclickListener(listener: ClickListener) {
        clickListener = listener
    }

    fun click() {
        clickListener?.onClick()
    }
}

data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Alexander", 25),
    Person("Elena", 30),
    Person("Dmitry", 21)
)

val sortedByAge = people.sortedWith(object : Comparator<Person> {
    override fun compare(p1: Person, p2: Person): Int {
        return p1.age.compareTo(p2.age)
    }
})

interface Database {
    fun connect()
}

class MySQLDatabase : Database {
    override fun connect() {
        println("Connecting to MySQL...")
    }
}

val database: Database = object : Database {
    override fun connect() {
        println("Connecting to a new database...")
    }
}

open class Animal {
    open fun makeSound() {
        println("Animal sound")
    }
}
interface Sensor {
    fun getValue(): Int
}

fun createTemperatureSensor(): Sensor {
    return object : Sensor {
        override fun getValue(): Int = 25
    }
}

fun main() {
    val sensor = createTemperatureSensor()
    println("Temperature: ${sensor.getValue()}°C")

    val animal =  object: Animal()  {
        override fun makeSound() {
            println("Meow")
        }
    }

    animal.makeSound()

    println(sortedByAge)
    database.connect()

    val button = Button()
    button.setOnclickListener(listener = object: ClickListener {
        override fun onClick() {
            println("button clicked! ")
        }
    })
    button.click()

    val clickListener: ClickListener = object : ClickListener {
        override fun onClick() {
            println("clickListener Button clicked ")
        }
    }

    val listener: ClickListener = object : ClickListener {
        override fun onClick() {
            println("listener Button Clicked")
        }
    }

    listener.onClick()
    clickListener.onClick()
    val anonymousObject = object {
        val x = 10
        val y = 20

        fun printSum() {
            println("Sum: ${x + y}")
        }
    }

    val anonObject = object {
        val x = 100
        val y = 200

        fun printSubstract() {
            println("Substraction: ${x - y}")
        }
    }

    anonymousObject.printSum() // Output: Sum: 30
    anonObject.printSubstract()
}

