package lambda

data class Course(val name: String, val students: List<Student>)
data class Student(val name: String)

class CourseBuilder(val name: String) {
    val students = mutableListOf<Student>()
    fun student(name: String) = students.add(Student(name))
    fun build() = Course(name, students)
}

fun buildCourse(name: String, init: CourseBuilder.() -> Unit): Course {
    // write your code here
    val builder = CourseBuilder(name)
    builder.init()
    return builder.build()
}

fun main() {
    val (course, a, b) = readLine()!!.split(' ')

    val myCourse = buildCourse(course) {
        student(a)
        student(b)
        for (i in 1..2) {
            student("Anonymous #$i")
        }
    }

    println(myCourse)
}