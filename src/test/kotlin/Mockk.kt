/*
package calculatorTest

import io.mockk.every
import io.mockk.mockk
import io.mockk.*
import io.mockk.impl.log.Logger
import org.junit.jupiter.api.Test
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.BeforeEach
import kotlin.test.assertEquals
import io.mockk.spyk
interface Calculator {
    fun add(x: Int, y: Int): Int
    fun subtract(x: Int, y: Int): Int
}

class CalculatorService(private val calculator: Calculator) {
    fun addAndSubtract(x: Int, y: Int): Int {
        val lambdaExpression.getSum = calculator.add(x, y)
        val difference = calculator.subtract(x, y)
        return lambdaExpression.getSum - difference
    }
}


class CalculatorTest {

    // Create a mock MathService using the @MockK annotation
    @MockK
   // lateinit var mathService: MathService

    // Create an instance of Calculator, injecting the mock MathService with the @InjectMockK annotation
    @InjectMockKs
    lateinit var calculator: Calculator

    // Set up the mock behavior for the MathService using the MockK API
    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
   //     every { mathService.add(any(), any()) } returns 5
    }

    // Test that our Calculator instance is correctly using the mocked MathService
    @Test
    fun `test add method`() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }
}

class Example {
    fun method1(): String {
        return "method1"
    }

    fun method2(): String {
        return "method2"
    }
}


fun main() {
    @Test
    fun testingMockCalculator() {
        val mockCalculator = mockk<Calculator>()

        every { mockCalculator.add(2, 3) } returns 5
        every { mockCalculator.subtract(2, 3) } returns -1

        val calculatorService = CalculatorService(mockCalculator)
        val result = calculatorService.addAndSubtract(2, 3)

        assert(result == 6)

        val loggerMock = mockk<Logger>()
        justRun { loggerMock.trace { result.toString() } }
    }

    val example = spyk(Example())

    every { example.method1() } returns "spy1"

    assertEquals("spy1", example.method1()) // Returns "spy1"

    assertEquals("method2", example.method2()) // Returns "method2"
*/
/*
    val calculatorMock = mockk<Calculator>()

    every { calculatorMock.add(any(), any()) } returns 5

    calculatorMock.add(2, 3)

    verify { calculatorMock.add(2, 3) }

    val loggerMock = mockk<Logger>()
    justRun { loggerMock.info(any()) }

    mockkObject(CalculatorService::class)
*//*


}*/
