/*
data class Person3(val name: String, val age: Int)

class PersonBuilder {
    var name: String = ""
    var age: Int = 0

    fun name(value: String) {
        name = value
    }

    fun age(value: Int) {
        age = value
    }

    fun build(): Person3 {
        return Person3(name, age)
    }
}

fun buildPerson(block: PersonBuilder.() -> Unit): Person3 {
    // Write your code here
    val personBuilder = PersonBuilder()
    personBuilder.build()
    return Person3(personBuilder.name,personBuilder.age)
}
*/

data class Student(val name: String, val age: Int)

data class Course(val name: String, val students: MutableList<Student> = mutableListOf())

class CourseBuilder {
    var name: String = ""
    private val students = mutableListOf<Student>()

    fun name(value: String) {
        name = value
    }

    fun student(block: StudentBuilder.() -> Unit) {
       val studentBuilder = StudentBuilder()
        students.add(studentBuilder.build())

       // Write your code here
    }

    fun build(): Course {
        return Course(name, students)
    }
}

class StudentBuilder {
    var name: String = ""
    var age: Int = 0

    fun name(value: String) {
        name = value
    }

    fun age(value: Int) {
        age = value
    }

    fun build(): Student {
        return Student(name, age)
    }
}


fun buildCourse(block: CourseBuilder.() -> Unit): Course {
    val courseBuilder = CourseBuilder()
    courseBuilder.block()
    return courseBuilder.build()
    // Write your code here
}

/*
data class Person1(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val address: String
)

data class PersonBuilder(
    var firstName: String = "",
    var lastName: String = "",
    var age: Int = 0,
    var address: String = ""
)

fun personBuilder(init: PersonBuilder.() -> Unit): Person1 {
    val builder = PersonBuilder()

    builder.init()

    return Person1(builder.firstName, builder.lastName, builder.age, builder.address)
}

fun main() {
    val person = personBuilder {
        firstName = "John"
        lastName = "Doe"
        age = 30
        address = "123 Main St"
    }
    println(person)
}*/
