/*
package calculatorTest

import com.android.tools.screenshot.isValid
import io.mockk.every
import io.mockk.mockk
import io.mockk.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import kotlin.test.assertEquals


class NumberChecker {
   fun checkNumber(input: Int):String {
       return if(input % 2 == 0) "even" else "odd"
   }
}

class NumberCheckerTest {
    @Test
    fun `Test checkNumber function with even number`() {
        val numberChecker = NumberChecker()
        val userInput = mockk<Int>()
        every { userInput } returns 2

        val result = numberChecker.checkNumber(userInput)

        assertEquals("even", result)
    }

    @Test
    fun `Test checkNumber function with odd number`() {
        val numberChecker = NumberChecker()
        val userInput = mockk<Int>()
        every { userInput } returns 3

        val result = numberChecker.checkNumber(userInput)

        assertEquals("odd", result)
    }

    @Test
    fun `Test checkNumber function with zero`() {
        val numberChecker = NumberChecker()
        val userInput = mockk<Int>()
        every { userInput } returns 0

        val result = numberChecker.checkNumber(userInput)

        assertEquals("even", result)
    }

    @Test
    fun `Test checkNumber function with negative even number`() {
        val numberChecker = NumberChecker()
        val userInput = mockk<Int>()
        every { userInput } returns -2

        val result = numberChecker.checkNumber(userInput)

        assertEquals("even", result)
    }

    @Test
    fun `Test checkNumber function with negative odd number`() {
        val numberChecker = NumberChecker()
        val userInput = mockk<Int>()
        every { userInput } returns -3

        val result = numberChecker.checkNumber(userInput)

        assertEquals("odd", result)
    }
}

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*


class User(val names: String?, val passwords: String?, expectedOutcomes: Boolean = false) {
    fun isValid() {

    }
}
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class UserTest {
    lateinit var names: Array<String?>
    lateinit var passwords: Array<String?>
    lateinit var expectedOutcomes: BooleanArray

    var index = 0

    var user: User? = null
    var expected = false

    @BeforeAll
    fun setUp() {
        names = arrayOf("Alice", "Alice", "Alice", "", null, "    ")
        passwords = arrayOf("12345678", "123", null, "12345678", "12345678", "12345678")
        expectedOutcomes = booleanArrayOf(true, false, false, false, false, false)
    }

    @BeforeEach
    fun createUser() {
        user = User(names[index], passwords[index])
        expected = expectedOutcomes[index]
    }

    @AfterEach
    fun incrementIndex() {
        index++
    }

    @RepeatedTest(value = 6, name = "user.isValid() test {currentRepetition}/{totalRepetitions}")
    fun isValid() {
        assertEquals(expected, user!!.isValid)
    }
}*/
