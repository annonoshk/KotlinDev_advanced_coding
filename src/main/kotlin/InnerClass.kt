/*
class Hero {
    val baseStrength = 1000
    inner class Equipment {
        val weapon = "trident"
        val weaponStrength = 300
    }
}

class Villain {
    val baseStrength = 500
    inner class Equipment {
        val weapon = "bomb"
        val weaponStrength = 700
    }
}

class Vehicle(val name: String) {
    inner class Engine(val horsePower: Int) {
        fun start() {
            println("RRRrrrrrrr....")
        }

        // create function printHorsePower()
        fun printHorsePower() {
            val name = "Dixi"
            val vehicle = Vehicle(name)
            val horsePower = 20
            val engine = Engine(horsePower)
            println("The $name vehicle has $horsePower horsepower")
        }
    }
}
class Cat(val name: String, val color: String, val size: Int) {

    fun sayMeow() {
        println("$name says: \"Meow\".")
    }

    inner class Bow(val color: String, val size: Int) {
        fun printColor() {
            print("The cat named $name is $color. ")
            print("The size of $name is $size. ")
            print("The cat named $name has a ${this.color} bow. ")
            print("The size of the bow is ${this.size}.")
        }
    }
}
data class Musician(var name: String, var instrument: String = "Guitar", var band: String = "Radiohead")

fun main() {
    val musicians = mutableListOf("Thom York", "Jonny Greenwood", "Colin Greenwood")
    val firstAndLast = with(musicians) {
        "First list element - ${first()}," +
        " last list element - ${last()}"
    }
    println(firstAndLast)

// We create a new variable firstAndLast and pass the result of calculations inside the function body to it. After that we print this variable.
}


*/
/*

fun main() {
    val musician = Musician("Jonny Greenwood").apply {
      instrument = "Banjo" // here we can also use this.instrument
    }
    print(musician)
}
*/

/*fun main() {
    val cat = Cat("Bob", "white", 10)
    val bow = cat.Bow("red", 15)
    bow.printColor()
}*/

/*
fun main() {
    Vehicle("Dixi").Engine(20).printHorsePower()
    val hero = Hero()
    val heroEquipment = hero.Equipment()
    val heroTotalStrength = hero.baseStrength + heroEquipment.weaponStrength

    val villain = Villain()
    val villainEquipment = villain.Equipment()
    val villainTotalStrength = villain.baseStrength + villainEquipment.weaponStrength

    // the following lines should remain as they are
    println("The hero uses ${heroEquipment.weapon}. The total strength is $heroTotalStrength.")
    println("The villain uses ${villainEquipment.weapon}. The total strength is $villainTotalStrength.")
}
*/