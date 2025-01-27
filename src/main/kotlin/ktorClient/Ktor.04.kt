package ktorClient

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main() {
    val client = HttpClient(CIO) {
        followRedirects = false
    }
    val res: HttpResponse = client.get("https://google.com")
    val contentLength = res.headers["Content-Length"]
    println(res.status.value)
    println(contentLength)

    val bodyText = res.bodyAsText()
    println(bodyText)

    println(res.headers)
    client.close()
}