package ktorClient

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import json.ApiRest.client

suspend fun main() {
    val response: HttpResponse = client.post("http://example.com") {
        headers {
            append(HttpHeaders.Accept, "text/html")
            append(HttpHeaders.Authorization, "abc123")
            append(HttpHeaders.UserAgent, "ktor client")
        }
        setBody("Body content")
    }
}

fun setBody(s: String) {
    TODO("Not yet implemented")
}
