package dsl


data class ServerConfig(var host: String = "", var port: Int = 0)

fun main() {

/*    // Anko
    verticalLayout {
        val name = editText()
        button("Say Hello") {
            onClick { toast("Hello, ${name.text}!") }
        }
    }

    //Exposed for Database Access
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver")

    transaction {
        addLogger(StdOutSqlLogger)
        SchemaUtils.create(Cities)

        City.new {
            name = "St. Petersburg"
            population = 5000000
        }

        val cities = City.all().toList()
    }*/

    // Basic Building Blocks for Creating a DSL in Kotlin
    //1. Lambda with Receiver:

    class HtmlBuilder {
        fun body(content: String) {}
    }

    fun html(init: HtmlBuilder.() -> Unit): HtmlBuilder {
        val builder = HtmlBuilder()
        builder.init()
        return builder
    }

    html {
        body("Hello, DSL!")
    }

    // 2.  Invoking Functions with Conventions:

    class RouteHandler {
        operator fun invoke(route: String, handler: () -> Unit) {}
    }

    val routeHandler = RouteHandler()
    routeHandler.invoke("/home") {
        // handle the route
    }

    // 3. Standard Library Functions:

    fun serverConfig(init: ServerConfig.() -> Unit) = ServerConfig().apply(init)

    val config = serverConfig {
        host = "localhost"
        port = 8080
    }
    println("Host: ${config.host}, Port: ${config.port}") // Correct way to print

    // Or, if you want a String representation of the object:
    println(config) // This will use the data class's toString() method

    // If you REALLY need to create a *new* ServerConfig from an existing one (usually not necessary)
    val newConfig = ServerConfig(config.host, config.port)
    println(newConfig)

    /*Please note that HTML does not natively support syntax highlighting. To enable syntax highlighting for the Kotlin code blocks, typically a JavaScript library such as Prism.js or highlight.js would be used. You would need to include the relevant CSS and JavaScript files for these libraries, and the class="language-kotlin" attribute in tags is used to specify the language for Prism.js syntax highlighting. If you don't want to use syntax highlighting, you can remove the class attribute from tags.*/
}