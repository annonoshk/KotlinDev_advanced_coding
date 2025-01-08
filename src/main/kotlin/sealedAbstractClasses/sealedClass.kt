package sealedClass

open class Person {
    fun whoAmI(name: String): String {
        return "I am $name"
    }
}


sealed class Staff : Person() {
    class Teacher(val numberOfLessons: Int) : Staff()
    class Manager(val Responsibility: String) : Staff()
    object Worker : Staff()
}

fun listTheTasks(staff: Staff) = when (staff) {
    is Staff.Teacher -> println("The teacher has ${staff.numberOfLessons} lessons today")
    is Staff.Manager -> println("The manager is doing ${staff.Responsibility} today")
    Staff.Worker -> println("Worker is fixing the projector for profs in CS, all respect to him.")
}
fun main() {

    val teacher = Staff.Teacher(3)
    val worker = Staff.Worker


    println(worker.whoAmI("Worker"))
    listTheTasks(teacher)
    listTheTasks(worker)
}