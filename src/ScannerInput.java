import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    public ScannerInput() {
    }

    public double getInput(Scanner scanner, String prompt) {
        double input = 0.0;

        while(true) {
            try {
                System.out.print(prompt);
                input = scanner.nextDouble();
                return input;
            } catch (InputMismatchException var6) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
}

