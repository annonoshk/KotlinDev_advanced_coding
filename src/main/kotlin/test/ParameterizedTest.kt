package test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.*
import org.junit.jupiter.params.provider.Arguments.arguments

class Calculator {
    fun maxOf(a: Int, b: Int): Int {
        return if (a >= b) {
            a
        } else {
            b
        }
    }

    fun isEven(arg: Int): Boolean {
        return arg % 2 == 0
    }
}


internal class CalculatorTest01 {
    @Test
    fun testMaxFirstArgGreaterThanSecondArg() {
        val calculator = Calculator()
        val result = calculator.maxOf(2, 1)
        val expected = 2
        assertEquals(expected, result)
    }

    @Test
    fun testMaxFirstArgLessThanSecondArg() {
        val calculator = Calculator()
        val result = calculator.maxOf(1, 2)
        val expected = 2
        assertEquals(expected, result)
    }

    @Test
    fun testMaxFirstArgEqualToSecondArg() {
        val calculator = Calculator()
        val result = calculator.maxOf(2, 2)
        val expected = 2
        assertEquals(expected, result)
    }
}


internal class CalculatorTest02 {
    @ParameterizedTest
    @CsvSource("2, 1, 2", "1, 2, 2", "1, 1, 1")
    fun testMax(first: Int, second: Int, expected: Int) {
        val calculator = Calculator()
        val result = calculator.maxOf(first, second)
        assertEquals(expected, result)
    }
}

internal class CalculatorTest03 {

    @ParameterizedTest
    @ValueSource(ints = [0, 2, 4, 1000])
    fun testIsEven(arg: Int) {
        assertTrue(Calculator().isEven(arg))
    }
}

//@ValueSource
internal class CalculatorTest04 {

    @ParameterizedTest
    @EmptySource
    fun testEmpty(arg: IntArray) {
        assertEquals(0, arg.size)
    }

    @ParameterizedTest
    @NullAndEmptySource
    fun testNullAndEmpty(arg: List<String?>?) {
        assertTrue(arg == null || arg.isEmpty()) // we can also write this line
        // assertTrue(arg.isNullOrEmpty())
    }
}

//@MethodSource
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class CalculatorTest05 {

    @ParameterizedTest
    @MethodSource("stringFactory")
    fun testStrings(str: String) {
        assertFalse(str.isEmpty())
    }

    fun stringFactory(): List<String>? {
        return listOf("apple", "banana", "lemon", "orange")
    }
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class CalculatorTest {

    @ParameterizedTest
    @MethodSource("argFactory")
    fun testStringLength(str: String, length: Int) {
        assertEquals(length, str.length)
    }

    fun argFactory(): List<Arguments?>? {
        return listOf(arguments("apple", 5), arguments("watermelon", 10))
    }
}

//@CsvSource

//@CsvFileSource(resources = "/dataset.csv", numLinesToSkip = 1)