package thread

/*
 * VeganPizza
You've decided to cook a vegan pizza, and now you need to perform the following steps in the right order (like in the sample output). Correct the mistake in the program and cook your pizza!

First of all, go through these classes to understand the code better. Don't change these classes, just fix a function.

Sample Input 1:

cook Pizza

Sample Output 1:

cook base
slice tomatoes 3
slice tomatoes 2
slice tomatoes 1
fry tofu
to bake...4 min
to bake...3 min
to bake...2 min
to bake...1 min
Your pizza is ready!

Write a program in Kotlin
 */

 // Fix this function
fun cookVeganPizza() {
    val base = Base()
    val tomatoes = Tomatoes()
    val tofu = Tofu()
    val bake = Bake()
    val stepOfCook: MutableList<Thread> = mutableListOf()
    stepOfCook.add(base)
    stepOfCook.add(tomatoes)
    stepOfCook.add(tofu)
    stepOfCook.add(bake)
    for (step in stepOfCook) {
        step.start()
        step.join()
    }
}

// Do not change the code below

class Base : Thread() {
    override fun run() {
        println("cook base")
    }
}

class Tomatoes : Thread() {
    override fun run() {
        for (i in 3 downTo 1) {
            println("slice tomatoes $i")
        }
    }
}

class Tofu : Thread() {
    override fun run() {
        println("fry tofu")
    }
}

class Bake : Thread() {
    override fun run() {
        for (i in 4 downTo 0) {
            if (i == 0) {
                println("Your pizza is ready!")
                break
            }
            println("to bake...$i min")
        }
    }
}

fun main() {
    cookVeganPizza()
}