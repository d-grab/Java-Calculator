import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void startCalculator() {
    }

    @Test
    void getFirstNumber() {
    }

    @Test
    void getSecondNumber() {
    }

    @Test
    void isValidInput() {
        assertTrue(Calculator.isValidInput("adSitions"));
        assertTrue(Calculator.isValidInput("12"));
        assertTrue(Calculator.isValidInput("SubstrAcctios"));

        assertFalse(Calculator.isValidInput("ADDITION"));
        assertFalse(Calculator.isValidInput("subtraction"));
        assertFalse(Calculator.isValidInput("MuLtiPliCatioN"));

    }

    @Test
    void checkNumbersAndCalculate() {
    }

    @Test
    void equate() {
    }
}