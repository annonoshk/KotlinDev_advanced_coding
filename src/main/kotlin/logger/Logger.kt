package logger

import java.util.logging.Level
import java.util.logging.Logger

import java.util.logging.FileHandler
import java.util.logging.Handler
import java.util.logging.XMLFormatter

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val logger = Logger.getLogger(Main::class.java.name)
        val fileHandler: Handler = FileHandler("default.log")
        logger.addHandler(fileHandler)
        fileHandler.formatter = XMLFormatter()
        logger.info("Info log message")
    }
}