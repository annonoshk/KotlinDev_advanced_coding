package typeBounds



/**
 * Harry Potter and the Order of Phoenix
Albus Dumbledore is coding an app to manage the students of Howarts. He can ensure that we can treat OrderOfThePhoenix<Wizard> as a container that accepts both HogwartsStudent and DarkWizard instances or any superclass of Wizard. Please complete the definition of OrderOfThePhoenix using variance options.
 */
open class Wizard(val name: String)

class HogwartsStudent(name: String) : Wizard(name) {
    fun study() {
        println("Studying at Hogwarts")
    }
}

class DarkWizard(name: String) : Wizard(name) {
    fun castSpell() {
        println("Casting a dark spell")
    }
}

class OrderOfThePhoenix
<in T>
(private val members: MutableList<T>)
{
    fun addMember(member: T) {
        members.add(member)
    }
}

fun main() {
    val hogwartsStudents = mutableListOf<HogwartsStudent>()
    val darkWizards = mutableListOf<DarkWizard>()

    val orderOfThePhoenixHogwarts: OrderOfThePhoenix<HogwartsStudent> = OrderOfThePhoenix(hogwartsStudents)
    val orderOfThePhoenixDark: OrderOfThePhoenix<DarkWizard> = OrderOfThePhoenix(darkWizards)

    orderOfThePhoenixHogwarts.addMember(HogwartsStudent("Harry Potter"))
    orderOfThePhoenixDark.addMember(DarkWizard("Lord Voldemort"))

    for (member in hogwartsStudents) {
        println("Hogwarts student: ${member.name}")
        member.study()
    }

    for (member in darkWizards) {
        println("Dark wizard: ${member.name}")
        member.castSpell()
    }
}