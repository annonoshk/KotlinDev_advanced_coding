package dsl

class ServerConfiguration {
    var port: Int = 8080
    var host: String = "localhost"
    val routes = mutableListOf<Route>() // Type specified for routes

    fun route(path: String, init: Route.() -> Unit) { // Correct function name
        val route = Route(path).apply(init) // Path passed to Route constructor
       // route.init() // init block executed on the route object
        routes.add(route)
    }
}

class Route(val path: String) {
    private var getAction: (() -> Unit)? = null
    private var postAction: (() -> Unit)? = null

    fun get(action: () -> Unit) {
        getAction = action
    }

    fun post(action: () -> Unit) {
        postAction = action
    }
}

fun server(init: ServerConfiguration.() -> Unit): ServerConfiguration {
    return ServerConfiguration().apply(init)
}

// Usage Example
val serverConfig = server {
    port = 8080
    host = "localhost"
    route("/home") {
        get {
            // Handle GET request
            println("GET request for /home") // Example action
        }
        post {
            // Handle POST request
            println("POST request for /home") // Example action
        }
    }
}

fun main() { // Added main function to demonstrate usage
    println(serverConfig.port)
    println(serverConfig.host)
    for (route in serverConfig.routes) {
        println("Route: ${route.path}")
        // You would typically call getAction or postAction here if they are not null
        // Example: route.getAction?.invoke()
    }

}