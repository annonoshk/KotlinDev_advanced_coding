/*

data class Student10(val name: String, val age: Int, val isStudent: Boolean)

fun iterateThroughStudentsList(studentData: MutableList<Student10>) {
    for ((name, _, isStudent) in studentData) {
        // some code
    }
}

fun iterateThroughStudentsList1(studentData: MutableList<Student10>) {
    for ((, age, isStudent) in studentData) {
        // some code
    }
}

fun iterateThroughStudentsList2(studentData: MutableList<Student10>) {
    for ((name, age, ) in studentData) {
        // some code
    }
}

fun iterateThroughStudentsList3(studentData: MutableList<Student10>) {
    for ((_, _, _) in studentData) {
        // some code
    }
}

fun main() {
    println("    good ")
}*/
