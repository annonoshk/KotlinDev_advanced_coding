

fun main() {


    val example = "Kotlin is a language"
    println(example.replace(" language", "n island"))
    println(example)
}

/*
    example.substring(3).apply(::println)   // 1
    example.substring(0, 7).apply(::println)   // 2
   // example.substring(-1, 0).apply(::println)  // 3
    example.substring(0, 0).apply(::println)   // 4
  //  example.substring(0, 8).apply(::println)   // 5
*//*    // put your code here
    readln().equals(readln(), ignoreCase = true).apply(::print)*/
/*
    val a = "GooD"

    println(a.substringBefore('o') + "OO" + a.substringAfter('o'))*//*/*

    val s1 = readln()

    val strFirst = s1.first()
    val strLast = s1.last()

    val s2 = s1.replace(s1.first(),s1.last())
    //WelloW
    println(s2.replace(s2.last(),strFirst))

   // println(s1)*/

}


/*


data class Microphone(
    var track: String = "",
    var frequency: Int = 0,
    var effect: String = "",
    var sensitivity: Double = 0.0
)

fun main() {
    val microphone = Microphone()

    // Write scope function that receive new settings from standard input and set up them to the Microphone
    microphone.run {
        track = readln()!!
        frequency = readln()!!.toInt()
        effect = readln()!!
        sensitivity  = readln()!!.toDouble()
    }

    println(microphone)
}*/





/*
fun main() {
    // Define variable message and give it a value from standard input
    val message = readln()!!

    // Write here scope functions that adds needed phrase
    println(message).also { println("Note! I didn't die at the end of the Drive")
    }
}


*/








/*
data class Musician(var name: String, var instrument: String = "Guitar", var band: String = "Radiohead")

fun main() {
    Musician("Jonny Greenwood").apply {
      instrument = "harmonica" // here we can use this.instrument
      band = "Pavement"

    }

    Musician("Jonny Greenwood").also {
      it.instrument = "harmonica"
    }

    val nums = Musician("Dave Glowl", "Drums", "Nirvana").let { (musicName, instrumentName,bandName ) ->
        musicName.length + instrumentName.length + bandName.count { it == 'a' }
    }

    println(nums)
    // With it, we can pass several parameters and use them as separate parameter members. We can also rename these parameters
}

*/







/*
 * Names of poets
Medium
532
2 days ago
You have a variable coolScope. Using one of the scope functions, count the number of letters "a" in the poet variable (case insensitive) while initializing coolScope. Also, the function should print the text "Our poet is $poet" .

Thus, you have to do two actions when initializing coolScope: initialize it with a value and print the text.

Sample Input 1:

William Blake

Sample Output 1:

Our poet is William Blake
2
*/

/*fun main() {
    var poet: String? = readln()

    val coolScope = with(poet) {
        println("Our poet is $poet")
        this?.count { it == 'a' || it == 'A'}
    }
    println(coolScope)
}*/



/*
 *
 * First function body: print the data class and calculate the length of the field name.

Second function body: pass the calculated length of the field name as a parameter, divide it by 4, and print the result on a new line.

Third function body: pass the result of division of length by 4 as a parameter, add 10 to it, and pass this value to a variable num.

After these steps, print the value of num in standard output on a new line.

Sample Input 1:

Ian George Brown
The Stone Roses
Frontman

Sample Output 1:

Musician(name=Ian George Brown, band=The Stone Roses, role=Frontman)
4
14
 */

/*

data class Musician(var name: String = "", var band: String = "", var role: String = "")

fun main() {
    val musician = Musician()

    musician.apply {
        name = readln()
        band = readln()
        role = readln()
    }.run { println(this)
        name.length
    }.let { println(it/4)
        println(it/4 + 10)
    }

    // Write your code here
}
*/



/*fun main() {
    val numbers = listOf(2, 5, 25, 1089, 4)
    val value = with(numbers) {
        var numbers = this
    this.drop(5)
        println(this)
    numbers.lastOrNull()

    }

    println(value)
}*/
/*utton

Sample Output 1:

New settings: TextField(text=Button, textSize=14, fontFamily=Roboto)*/
/*data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)*/

/*
fun main() {
    val textField = TextField()

    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

    textField
        .apply {
            val input = readln()!! ?: null
            if(valuesMap.containsKey(input)) {
                text = input?: ""
                textSize = valuesMap[input]?: 0
            // Write your code here
            }
            else
                println("There is no keys \"Cancel\", \"Button\", \"Submit\" ")
        }
        .also { println("New settings: $it") }
}
*/




/*Sample Input 1:

Button

Sample Output 1:

Old settings: TextField(text=Hello!, textSize=12, fontFamily=Roboto)
New settings: TextField(text=Button, textSize=12, fontFamily=Roboto)*/

/*
data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)
*/

/*
fun main() {
    val textField = TextField()
    println("Old settings: $textField")

    textField.apply {
       println("New settings: ${copy(text = readln()!!)}")
    }
   // textField // Write your code here
}
*/






/*
 *
 * Sample Input 1:

Theon Greyjoy

Sample Output 1:

Old heroes list: John Snow, Daenerys Targaryen
New heroes list: John Snow, Daenerys Targaryen, Theon Greyjoy
*/


/*
fun main() {
    val heroesList = mutableListOf("John Snow", "Daenerys Targaryen")
    println("Old heroes list: ${heroesList.joinToString()}")

    heroesList.apply {
        add(readln()!!)
        println("New heroes list: ${this.joinToString()}")
    }

    //heroesList // Write here a chain of scope functions and MutableList methods
}
*/



/*
data class Movie(
    var name: String = "The Knack ...and How to Get It",
    var link: String = "https://",
    var dataBaseName: String = "IMDB"
)

fun main() {
    val movie = Movie()
    movie.apply {
         readln().split(" ").let { dataBaseName = it[0]; link = it[1] }
    }.apply(::println)
}
*/





/*data class Musician(var name: String, var instrument: String = "Guitar", var band: String = "Radiohead")


fun main() {

    val instruments = mutableListOf("Guitar", "Harmonica", "Bass guitar")

    instruments
        .also { println("Right now I can play these instruments: $it") }
        .add("Theremin")

    println(instruments)

    val dave = Musician("Dave Grohl", "Drums", "Nirvana")
    println(dave)
    dave.band = "Foo Fighters"
    dave.instrument = "Guitar"
    println(dave)

    val thom = Musician("Jonny Greenwood")
        .apply {
            instrument = "Harmonica"
            band = "Pavement"
        }.copy(name = "Thom York") // After .apply we have an instance of Musician()
    println(thom)
}*/

/*data class Date(var day: String ="",var month:String ="", var year:String ="")

fun main() {
    val data = run {
    val day = readln()
    val month = readln()
    val year = readln()
    "$month.$day.$year"
}
 println(data)

}*/
/*

data class Musician(var name: String = "", var band: String = "", var role: String = "")

fun main() {
    val musician = Musician()

    musician.apply {
        name = readln()
        band = readln()
        role = readln()
    }

}

*/


/*
fun main() {
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+1234 -FFFF not-a-number")) {
        println(match.value)
    }
}*/
/*class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

fun main() {
    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }

    println(result)
}*/


/*
fun main() {
    val musicians = listOf("Thom York", "Jonny Greenwood", "Colin Greenwood")
    val modifiedFirstItem = musicians.first().let {firstName ->
        println("The first item of the list is '$firstName'")
        if (firstName.length >= 5) firstName else "!" + firstName + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}
*/