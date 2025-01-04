package compare

data class Student(val name: String, val grade: Int) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return other.grade.compareTo(this.grade)
    }
}

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("John", 25),
        Person("Sarah", 30),
        Person("David", 20),
        Person("Alice", 40)
    )

    val student = listOf(
        Student("Kim",88),
        Student("Jeon",89),
        Student("Um",87),
        Student("Jeong",86)
    )
    println(student)
    println(student.sorted())

    val comparator = Comparator<Person> { p1, p2 -> p1.age - p2.age }.reversed()
    val sortedPeople = people.sortedWith(comparator)

    sortedPeople.forEach { println("${it.name}, ${it.age}") }
}