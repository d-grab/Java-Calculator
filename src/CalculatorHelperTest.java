import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorHelperTest {

    @Test
    void addition() {
        double first = 5.0;
        double second = 3.0;

        double result = CalculatorHelper.addition(first, second);
        assertEquals(first + second, result);
    }

    @Test
    void subtraction() {
        double first = 5.0;
        double second = 3.0;

        double result = CalculatorHelper.subtraction(first, second);
        assertEquals(first-second, result);
    }

    @Test
    void multiplication() {
        double first = -2.0;
        double second = 3.0;

        double result = CalculatorHelper.multiplication(first, second);
        assertEquals(first*second, result);
    }

    @Test
    void division() {
        double first = 12.0;
        double second = 3.0;

        double result = CalculatorHelper.division(first, second);
        assertEquals(first/second, result);
    }
}