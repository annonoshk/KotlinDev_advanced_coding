package ktorClient

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

suspend fun main(args: Array<String>) {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.post("https://jsonplaceholder.typicode.com/todos") {
        headers {
          //  append(HttpHeaders.ContentType, "application/json")
        }
        setBody("""{
                   "userId": 1,
                   "title": "My awesome todo!",
                   "completed": true
                    }""")
    }

    println(response.status)
    println(response.headers)
    println(response.bodyAsText())

    client.close()
}