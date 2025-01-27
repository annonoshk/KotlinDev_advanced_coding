package ktorClient

/*
 * Ktor Client: Authentication and authorization
 * implementation("io.ktor:ktor-client-auth:$ktor_version")
 */

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*
// ...

suspend fun main() {
  // Initialize the client
/*    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    // Log in to get the token
    val loginResponse: HttpResponse = client.post {
        url("https://hyperskill/login")
        contentType(ContentType.Application.Json)
        body = UserPasswordCredentials("student", "1234")
    }

    // Check for a successful login response and extract the JWT token
    val jwtToken = if (loginResponse.status == HttpStatusCode.OK) {
        loginResponse.headers["Authorization"]?.substringAfter("Bearer ")
            ?: error("Failed to retrieve the token")
    } else {
        error("Login failed with status: ${loginResponse.status.value}")
    }

    // Close the initial client and set up a new client for subsequent requests
    client.close()
    val authClient = HttpClient(CIO) {
        install(Auth) {
            bearer {
                loadTokens { BearerTokens(jwtToken, "") }
            }
        }
        install(JsonFeature) {
            serializer = KotlinxSerializer() // Make sure to include the necessary serializers for your classes
        }
    }

    // Use the JWT token to access the protected resource
    val lesson: Lesson = authClient.get {
        url("https://hyperskill.org/lesson/ktor-client/3")
        // The Bearer token will be added automatically because of the Auth feature configuration
    }

    // Output the retrieved Lesson object
    println(lesson)

    // Close the authenticated client to avoid any potential memory leaks
    authClient.close()*/
}
