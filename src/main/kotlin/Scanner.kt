fun multiplyInts(list: List<Any>): List<Any> {
    val result = mutableListOf<Any>()
    for (item in list) {
        when (item) {
            is Int -> result.add(item * 2)
            else -> result.add(item)
        }
    }
    return result
}

fun countStrings(list: List<Any>): Int {
    return list.count {it is String}
}

fun <T> getStringsOnly(list: List<T>): List<String> {
    val result = mutableListOf<String>()

    // make your code here
    list.map {
        if(it is String)
        result.add(it)
    }

    return result
}

fun convertToStringList(list: List<Any>): List<String> {
    val stringList = mutableListOf<String>()
    for (element in list) {
        val stringElement =
            // make your code here
            if (element is String) element else "N/A"
        stringList.add(stringElement)
    }
    return stringList
}

fun main() {
    val mixedList = listOf(1, "hello", "Huck",3, "JJ", 4.5, 2, true)
    val resultList = multiplyInts(mixedList)
    println(countStrings(resultList)) // Output: [2, hello, 6, 4.5, 4]
    println(getStringsOnly(mixedList))
    println(convertToStringList(mixedList))
}




/*
fun myFun(myList: MutableList<Any>): Int {
    var result = 0
    for (item in myList) {
        result += item as? Int ?: 0
    }
    return result
}

fun main() {
    val myList = mutableListOf<Any>("hello", 3, "world", 3, 1, 7.0, 20L, 3)
    println(myFun(myList))
}*/
/*fun checkType(obj: Any) {
    if(obj is String) {
        println("$obj is a String")
    } else if (obj !is Int) {
        println("$obj is not an Integer")
    }else {
        println("$obj is an Integer")
    }

}

fun main() {
    checkType("Hello, World!") // prints "Hello, World! is a String"
    checkType(123) // prints "123 is an Integer"
    checkType(12.34) // prints "12.34 is not an Integer"
}*/
/*
    fun <T> exampleFunction(obj: Any) {
        val tObj: T? = obj as? T
        if (tObj != null) {
            // obj can be safely cast to type parameter T
        } else {
            // obj cannot be cast to type parameter T
        }
    }

fun main() {
*/


/*    try {
        Scanner(File("file.txt")).use { scanner ->
            val number = scanner.nextInt()
            println(number * 100)
        }
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } finally {
        println("Finally part")
    }*/
/*
    FileWriter("file.txt").use {
        it.write("Kotlin\nJava\nGo\nC++\nC#")
    }
    val file = FileReader("file.txt")
    file.use {
        val iterator = it.readLines().iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
    try {
        println(file.ready())
    } catch (e: Exception) {
        println(e.message)
    }
*/

/*    Scanner(File("file.txt")).use {
        val number = it.nextInt()
        println(number * 100)
    }*/

/*    Scanner(File("file.txt")).use { this ->
        val number = this.nextInt()
        println(number * 100)
    }*/
   /* Scanner(File("file.txt")).use { scanner ->
        val number = scanner.nextInt()
        println(number * 100)
    }*/

/*    Scanner(File("file.txt")).use { sc ->
        val number = sc.nextInt()
        println(number * 100)
    }*/
//}

/*
fun main() {
    FileWriter("F:\\Codes\\simpleTest\\src\\main\\kotlin\\file.txt").use {
        it.write("Kotlin\nJava\nGo\nC++\nC#")
    }
    val file = FileReader("file.txt")
    file.use {
        println(file.read())
    }
        //  println(file.read())
}*/
/*
fun main() {
    val resource = CustomCloseable()
    resource.use {
        println("I am an example of some code!")
        it.exampleMethod()
    }
    println("End of program!")
}

class CustomCloseable : Closeable {
    override fun close() {
        println("Close resource")
    }

    fun exampleMethod() {
        println("Example of some method for the CustomCloseable class")
    }
}*/
/*


fun main() {
    Scanner(File("F:\\Codes\\simpleTest\\src\\main\\kotlin\\file.txt")).use { scanner ->
        val first: Int = scanner.nextInt()
        val second: Int = scanner.nextInt()
        println("arguments: $first $second")
    }
}
*/
