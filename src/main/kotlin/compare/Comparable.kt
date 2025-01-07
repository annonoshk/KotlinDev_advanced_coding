package compare

data class Student(val name: String, val grade: Int) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return other.grade.compareTo(this.grade)
    }
}

data class Person(val name: String, val age: Int)

fun main() {


    val testList = mutableListOf(
        mutableListOf("a", "b", "c", "d", "e", "f", "g"),
        mutableListOf("h", "i", "j", "k", "l", "m", "n"),
        mutableListOf("o", "p", "q"),
        mutableListOf("r", "s", "t", "u", "v"),
        mutableListOf("w"),
        mutableListOf("x", "y"),
        mutableListOf("z")
    )

    val white = listOf(
        testList[1][1], // i
        testList[3][2], // t
        testList[0][4], // e
        testList[4][0], // w
        testList[1][0]  // h
    )

    println(white.joinToString(""))


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