package kotlinxSerialization

import kotlinx.serialization.*
import kotlinx.serialization.json.*


@Serializable
data class Test(val name: String, val integerNumber: Int, val realNumber: Double, val listString: List<String>, val setInteger: Set<Int>)
@Serializable
class Player(val name: String, @EncodeDefault var leveL: Int = 1)
@Serializable
data class Person(val name: String)

fun main() {
    val listStr = listOf("One", "Two", "Three")
    val setNum = setOf(1, 0, 2, 9)
    val instance = Test("test", 42, 15.55, listStr, setNum)
    val prettyPrint = Json { prettyPrint = true }
    val serialized = prettyPrint.encodeToString(instance)
    println(serialized)

    val player1 = Player("Best player", 5)
    println(prettyPrint.encodeToString(player1))
    val player2 = Player("John Doe")
    println(prettyPrint.encodeToString(player2))

    val jsonString = """
    {
        "name": "myName",
        "integerNumber": 10,
        "realNumber": 12.0,
        "listString": [
            "First String",
            "Second String"
        ],
        "setInteger": [
            1000,
            2000
        ]
    }
    """.trimIndent()

    val testInstant = Json.decodeFromString<Test>(jsonString)

    println(testInstant)

    val persons = listOf(Person("Joe Hill"), Person("Elen Doe"))
    println(persons)
    // [Person(name=Joe Hill), Person(name=Elen Doe)]

    val jsonStr = Json.encodeToString(persons)
    println(jsonStr)
    // [{"name":"Joe Hill"},{"name":"Elen Doe"}]

    val newPersons = Json.decodeFromString<List<Person>>(jsonStr)
    println(newPersons)

}

// {"name":"test","integerNumber":42,"realNumber":15.55,"listString":["One","Two","Three"],"setInteger":[1,0,2,9]}