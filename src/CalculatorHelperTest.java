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
    }

    @Test
    void division() {
    }
}