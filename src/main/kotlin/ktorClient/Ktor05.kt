package ktorClient

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main(args: Array<String>) {
    val client = HttpClient(CIO) {
        followRedirects = false
    }
    val response: HttpResponse = client.get("http://gooogle.com")
    println(response.headers)
    println(response.headers.get("Location"))
    client.close()
}