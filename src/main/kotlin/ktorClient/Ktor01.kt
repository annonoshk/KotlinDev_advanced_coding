package ktorClient

/*
 * dependencies {
    implementation("io.ktor:ktor-client-core:$ktor_client_version")
    implementation("io.ktor:ktor-client-cio:$ktor_client_version")
}
 */
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main(args: Array<String>) {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts/1")

    println(response.status)
    println(response.headers)
    println(response.bodyAsText())

    client.close()
}


/*
val client = HttpClient() {
    engine {
        // Configuration parameters
        pipelining = true
        threadsCount = 4
        proxy = null
    }
}*/
