package kotlinxCli

import kotlinx.cli.*

fun main(args: Array<String>) {
    val parser = ArgParser("example")
    val name by parser.option(ArgType.String, description = "Your name").required()
    parser.parse(args)
    println("Hello, $name!")
}