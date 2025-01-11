package kotlinxCli

import kotlinx.cli.*

/*
@OptIn(ExperimentalCli::class)
class MyCommand(parser: ArgParser): Subcommand(parser.toString(), "myCommand") {
    val parser.option by option(ArgType.Int, description = "Some option")
    override fun execute() {
        println("My command is executed with option value $option")
    }
}

fun main(args: Array<String>) {
    val parser = ArgParser("example")
    val command = MyCommand(parser)
    parser.parse(args)
    command.execute() // printing "My command is executed with option value null"
                      // null because we do not implement options
}*/
