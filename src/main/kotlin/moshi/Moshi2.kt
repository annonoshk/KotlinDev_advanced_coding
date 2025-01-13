package moshi

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class Human(var name: String, var age: Int, var friends: Array<String>, var grades: Map<String, String>)



fun main() {
    val type = Types.newParameterizedType(List::class.java, Human::class.java, Map::class.java)
    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val humanListAdapter = moshi.adapter<List<Human?>>(type)

    val jsonStr =
        """[{"name":"Ruslan","age":20,"friends":["Victoria","Valery"],
            "grades":{"Math":"A","Philosophy":"F","Physics":"D"}},
            {"name":"Victoria","age":35,"friends":["Ruslan","Anastasia"],
            "grades":{"Math":"B","Philosophy":"C","Physics":"B"}}]""".trimIndent()
    val humanList = humanListAdapter.fromJson(jsonStr)

    for (h in humanList!!) {
        println(h?.name + " has a grade of ${h!!.grades["Math"]} in maths")
    }
    // Ruslan has a grade of A in maths
    // Victoria has a grade of B in maths
}