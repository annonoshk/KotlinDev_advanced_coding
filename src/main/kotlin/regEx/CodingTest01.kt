package regEx

/*
 * Help the teacher
Annie is a teacher. She has a special program that counts her students' wrong answers. You decided to help her and write the part of the program that will give a result based on the number of wrong answers.

You already have the report string which contains the number of incorrect answers:

"10 wrong answers", "1 wrong answer", "3 wrong answers", and so on.

The test is considered passed if the student gave 9 or fewer wrong answers. Your program must print "true" if the student has passed the test, and "false" if the student has failed.

To complete this task, use the function matches(). Create a regex that fits the reports when a student has passed the exam, compare the report with it, and print the result.
 */



fun main() {
    //write your code here.
    val report = readLine()!!
    val regex = Regex("^[0-9] wrong answers?$")
    val passed = regex.matches(report)
    println(passed)
}