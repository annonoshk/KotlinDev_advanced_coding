package ktorClient

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*

suspend fun main() {
    val client = HttpClient(CIO) {
        install(WebSockets) {
            contentConverter = KotlinxWebsocketSerializationConverter(Json)
        }
    }

    @Serializable
    data class Student(val id: Int, val firstName: String, val lastName: String)

    client.webSocket(method = HttpMethod.Get, host = "127.0.0.1", port = 8080, path = "/student") {
        sendSerialized(Student(1, "Jane", "Smith"))
    }

    client.webSocket(method = HttpMethod.Get, host = "127.0.0.1", port = 8080, path = "/student/1") {
        val student= receiveDeserialized<Student>()
        println("Received student with id ${student.id}.")
    }
}
