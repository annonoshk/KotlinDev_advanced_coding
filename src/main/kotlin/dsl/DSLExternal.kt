package dsl


/*class DSLParser(val input: String) {
    fun parse(): DSLAst {
        // Parsing logic to convert input to an AST
    }
}

// Assume DSLAst is an abstract syntax tree representation of our DSL
// Usage
val parser = DSLParser("dsl-code-here")
val ast = parser.parse()
// Further processing of ast

// AST (Abstract Syntax Tree)
sealed class DSLAst {
    data class Circle(val x: Int, val y: Int, val radius: Int) : DSLAst()
    data class Rectangle(val x: Int, val y: Int, val width: Int, val height: Int) : DSLAst()
}*/
// AST (Abstract Syntax Tree)
sealed class DSLAst {
    data class Circle(val x: Int, val y: Int, val radius: Int) : DSLAst()
    data class Rectangle(val x: Int, val y: Int, val width: Int, val height: Int) : DSLAst()
}

class DSLParser(val input: String) {

    private var position = 0

    fun parse(): DSLAst {
        skipWhitespace()
        return when {
            input.startsWith("circle", position) -> parseCircle()
            input.startsWith("rectangle", position) -> parseRectangle()
            else -> throw IllegalArgumentException("Invalid DSL syntax")
        }
    }

    private fun parseCircle(): DSLAst {
        position += "circle".length
        expect("(")
        val x = parseInt()
        expect(",")
        val y = parseInt()
        expect(",")
        val radius = parseInt()
        expect(")")
        return DSLAst.Circle(x, y, radius)
    }

    private fun parseRectangle(): DSLAst {
        position += "rectangle".length
        expect("(")
        val x = parseInt()
        expect(",")
        val y = parseInt()
        expect(",")
        val width = parseInt()
        expect(",")
        val height = parseInt()
        expect(")")
        return DSLAst.Rectangle(x, y, width, height)
    }

    private fun parseInt(): Int {
        skipWhitespace()
        val start = position
        while (position < input.length && input[position].isDigit()) {
            position++
        }
        if (position == start) {
            throw IllegalArgumentException("Expected integer")
        }
        return input.substring(start, position).toInt()
    }

    private fun expect(expected: String) {
        skipWhitespace()
        if (!input.startsWith(expected, position)) {
            throw IllegalArgumentException("Expected '$expected'")
        }
        position += expected.length
    }

    private fun skipWhitespace() {
        while (position < input.length && input[position].isWhitespace()) {
            position++
        }
    }
}


fun main() {
    val parser = DSLParser("circle(10, 20, 50) rectangle(100,50, 20, 30)")
    try {
        val ast = parser.parse()
        println(ast)  // Output: Circle(x=10, y=20, radius=50)
        val parser2 = DSLParser("rectangle(100,50, 20, 30)")
        val ast2 = parser2.parse()
        println(ast2) // Output: Rectangle(x=100, y=50, width=20, height=30)
    } catch (e: IllegalArgumentException) {
        println("Parsing error: ${e.message}")
    }

    val parser3 = DSLParser("circle(10, 20, 50") // Missing closing parenthesis
    try {
        val ast3 = parser3.parse()
        println(ast3)
    } catch (e: IllegalArgumentException) {
        println("Parsing error: ${e.message}") // Output: Parsing error: Expected ')'
    }
}