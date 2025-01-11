package logger

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/*class Example {
    private val LOG_1: Logger = LoggerFactory.getLogger(Example::class.java)
    private val LOG_2: Logger = LoggerFactory.getLogger("com.example.Example")

    init {
        LOG_1.info("Information from LOG_1")
        LOG_2.warn("Warning from LOG_2")
        LOG_1.info("Are the loggers the same? {}", LOG_1 === LOG_2)
    }
}*/

/*class Example {
    private val LOG: Logger = LoggerFactory.getLogger(Example::class.java)

    init {
        val result = "Any operation"
        LOG.info("To track the value of a variable. The result is $result");
    }
}*/
class Example {
    private val LOG: Logger = LoggerFactory.getLogger(Example::class.java)

    init {
        val number = 1
        val divisor = 0

        try {
            val result = number / divisor
        } catch (e: ArithmeticException) {
            LOG.error("Something went wrong with divisor $divisor\n$e")
        }
    }
}

fun main() {
    Example()
}