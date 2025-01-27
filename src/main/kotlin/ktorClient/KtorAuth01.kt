package ktorClient

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*

// ...

val client = HttpClient(CIO) {
    install(Auth) {
        basic {
            realm = "Access to the '/' path"
        // Configurations for the root path
        }
        basic {
            realm = "Access to the '/admin' path"
        // Configurations for the admin path
        }
    }
}