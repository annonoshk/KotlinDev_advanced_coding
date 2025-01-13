package kotlinxSerialization

import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
class City1(val name: String, val population: Int,  @EncodeDefault val areaKm2: Double = 0.0)

fun main() {

    val barcelona = City1("Barcelona", 1700000)
    val json = Json { prettyPrint = true }
    val jsonBarcelona = json.encodeToString(barcelona)
    println(jsonBarcelona)

}
