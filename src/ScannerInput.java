import java.util.Scanner;
public class ScannerInput {
    public double getInput(Scanner scanner, String prompt) {
        double input = 0;
        while (true) {
            try {
                // Print the information to enter number from Main class
                System.out.print(prompt);
                input = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the input buffer
            }
        }
        return input;
    }
}

