package moshi

/*
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

data class Human1(var name: String, var age: Int, var friends: Array<String>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Human1

        if (age != other.age) return false
        if (name != other.name) return false
        if (!friends.contentEquals(other.friends)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + name.hashCode()
        result = 31 * result + friends.contentHashCode()
        return result
    } */
/*{
        override fun toString(): String {
            return "name $name, age $age, friends ${friends.toList()}"
        }
    }*/
/*
}

fun main() {
    val human1 = Human1("Mike", 20, arrayOf("Alex", "Valery", "Ann"))

    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val humanAdapter = moshi.adapter(Human1::class.java)

    println(humanAdapter.toJson(human1))
    // {"name":"Mike","age":20,"friends":["Alex","Valery","Ann"]}


//deserializing to class object
    val newHumanString = """
    {"name":"John",
    "age":25,
    "friends":["Mike","Helen"]}""".trimIndent()

val newHuman1 = humanAdapter.fromJson(newHumanString)
    println(newHuman1)

    val humanList1 = listOf(human1, newHuman1)

    val type = Types.newParameterizedType(List::class.java, Human1::class.java)
    val humanListAdapter = moshi.adapter<List<Human1?>>(type)
    println(humanListAdapter.toJson(humanList1)) // [{"name":"Mike","age":20,"friends":["Alex","Valery","Ann"]},{"name":"John","age":25,"friends":["Mike","Helen"]}]

    //woring on json
    println(newHuman1?.name) // John
    println(newHuman1?.friends.contentToString()) // [Mike, Helen]

*/
/*    for (h in newHumanList!!) {
        print(h?.name + " ")
    } // Nick John Kate*//*
/*

}
*/