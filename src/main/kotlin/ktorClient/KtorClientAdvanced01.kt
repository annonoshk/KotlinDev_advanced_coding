package ktorClient

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import io.ktor.websocket.*
import kotlinx.coroutines.*
import java.util.Scanner
import kotlin.time.toDuration

fun main() {
    val client = HttpClient(CIO) {
        install(WebSockets) {
            pingIntervalMillis  = 20_000
        }
    }
    runBlocking {
        client.webSocket(method = HttpMethod.Get, host = "127.0.0.1", port = 8080, path = "/echo") {
            while(true) {
                val otherMessage = (incoming.receive() as? Frame.Text)?.readText()
                otherMessage?.let { println(it) }

                Scanner(System.`in`).nextLine()?.let { userMessage ->
                    send(userMessage)
                }
            }
        }
    }
    client.close()
}