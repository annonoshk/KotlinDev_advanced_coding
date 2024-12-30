import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows

@DisplayName("A description of the test")

object Calculator {

    fun add(a: Int, b: Int) = a + b

    fun subtract(a: Int, b: Int) = a - b

    fun multiply(a: Int, b: Int) = a * b

    fun divide(a: Int, b: Int) : Int {
        if (b == 0) throw IllegalArgumentException("Divisor cannot be zero!")
        return a / b
    }

     fun isEven(a: Int) = (a % 2) == 0
}

class CalculatorTest {

    @Test
    fun `when adding 1 and 2 expect 3`() {
        val result = Calculator.add(2, 2)
        assertEquals(4, result)

    }

    @Test
    fun `when 2 is checked if even expect true`() {
        assertTrue(Calculator.isEven(2))
    }

    @Test
    fun `when 3 is checked if even expect false`() {
        assertFalse(Calculator.isEven(3))
    }

    @Test
    fun `when dividing by 0 expect IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> {
            Calculator.divide(10, 0)
        }
    }
}
