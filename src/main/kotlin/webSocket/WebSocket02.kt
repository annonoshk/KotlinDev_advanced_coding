package webSocket

import okhttp3.*
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import kotlin.concurrent.thread

fun main() {
    print("What's your name? ")
    val name = readlnOrNull() ?: return

    val client = OkHttpClient()
    val request =
        Request.Builder()
            .url("ws://localhost:8080/chat?name=" +
                 URLEncoder.encode(name, StandardCharsets.UTF_8)
            )
            .build()

    val ws = client.newWebSocket(
        request,
        object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                // start accepting input in a separate thread (I/O is blocking!)
                thread(isDaemon = true) {
                    while (true)
                        webSocket.send(readlnOrNull() ?: break)

                    // disconnect when EOF received
                    webSocket.close(1000, null)
                    client.close()
                }
            }
            override fun onMessage(webSocket: WebSocket, text: String) {
                println(text)
            }
            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                // You're leaving me? Oh OK, I'm leaving you too!
                webSocket.close(1000, null)
            }
            override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                println("Connection closed. $code $reason")
                client.close()
            }
            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                t.printStackTrace()
                client.close()
            }
            private fun OkHttpClient.close() {
                dispatcher.executorService.shutdown()
                connectionPool.evictAll()
            }
        }
    )
/*    val ws = client.newWebSocket(
        request,
        object : WebSocketListener() {
            override fun onMessage(webSocket: WebSocket, text: String) {
                println(text)
            }
        }
    )*/

    while (true) {
        ws.send(readlnOrNull() ?: break)
    }

}