package webSocket

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import java.util.concurrent.ConcurrentHashMap

fun main() {
    val clients = ConcurrentHashMap<WebSocketSession, String>()

    suspend fun broadcast(clients: Map<WebSocketSession, *>, text: String) {
        clients.forEach { (client, _) ->
            client.send(Frame.Text(text))
        }
    }
    embeddedServer(Netty, host = "localhost", port = 8080) {
        install(WebSockets)
        routing {
            webSocket("/chat") {
                // oblige everyone to have a name
                val name = call.parameters["name"]?.takeIf(String::isNotBlank)
                    ?: return@webSocket close(CloseReason(CloseReason.Codes.CANNOT_ACCEPT, "no nickname"))

                try {
                    clients[this] = name
                    broadcast(clients, "$name joined!")

                    // for each incoming text frame, send it to everyone
                    for (frame in incoming) {
                        if (frame is Frame.Text) {
                            val text = frame.readText()
                            broadcast(clients, "$name: $text")
                        }
                    }
                } finally {
                    // on disconnet, forget client and say bye
                    clients.remove(this)
                    broadcast(clients, "$name left.")
                }
            }
        }
    }.start(true)


}