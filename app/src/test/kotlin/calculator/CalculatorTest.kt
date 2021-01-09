package calculator

import java.lang.Float.POSITIVE_INFINITY
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test fun should_sum_values() {
        val calculator = Calculator()

        val result = calculator.operation(sum,1F,1F)

        assertEquals(2F, result)
    }

    @Test fun should_subtract_values() {
        val calculator = Calculator()

        val result = calculator.operation(subtract,5F,2F)

        assertEquals(3F, result)
    }

    @Test fun should_multiply_values() {
        val calculator = Calculator()

        val result = calculator.operation(multiply,2F,2F)

        assertEquals(4F, result)
    }

    @Test fun should_divide_values() {
        val calculator = Calculator()

        val result = calculator.operation(divide,10F,2F)

        assertEquals(5F, result)
    }

    @Test fun should_calculate_percentage() {
        val calculator = Calculator()

        val result = calculator.operation(percentage,10F,200F)

        assertEquals(20F, result)
    }

    @Test fun should_not_crash_divide_by_zero() {
        val calculator = Calculator()

        val result = calculator.operation(divide,10F,0F)

        assertEquals(POSITIVE_INFINITY, result)
    }
}