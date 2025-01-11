package kotlinxCli

import kotlinx.cli.*

/**
 * @OptIn(ExperimentalCli::class)
 * This annotation marks an experimental API for working with command-line arguments.
 * Beware using the annotated API, especially if you're developing a library, since your
 * library might become binary incompatible with the future versions of the CLI library.
 * Any usage of a declaration annotated with @ExperimentalCli must be accepted either by annotating
 * that usage with the UseExperimental annotation, e.g., @UseExperimental(ExperimentalCli::class),
 * or by using the compiler argument
 */
@OptIn(ExperimentalCli::class)
class GreetCommand(parser: ArgParser): Subcommand(parser.toString(), "greet") {
    val names by parser.option(ArgType.String, description = "User's name").required()
    val times by parser.option(ArgType.Int, description = "How many times to greet").default(1)

    override fun execute() {
        repeat(times) {
            println("Hello, $names!")
        }
    }
}

fun main(args: Array<String>) {
    val parser = ArgParser("example")
    val greetCommand = GreetCommand(parser)
    parser.parse(args)
    greetCommand.execute()
}