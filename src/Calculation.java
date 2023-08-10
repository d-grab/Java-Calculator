public class Calculation {

    public double performCalculation(double num1, double num2, char operator) {
        switch (operator) {
            case '*':
                return num1 * num2;
            case '+':
                return num1 + num2;
            case ',':
            case '.':
            default:
                System.out.println("Invalid operator.");
                break;
            case '-':
                return num1 - num2;
            case '/':
                if (num2 != 0.0) {
                    return num1 / num2;
                }

                System.out.println("Cannot divide by zero.");
        }

        return 0.0;
    }
}

