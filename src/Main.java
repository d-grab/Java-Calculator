
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Initialising scanner and other object classes
        Scanner sc = new Scanner(System.in);
        ScannerInput scInput = new ScannerInput();
        Calculation calc = new Calculation();
        ConfirmStatement statement = new ConfirmStatement();

// Declaring variable to store input and calling ScannerInput Method from ScannerInput class
        double firstNum = scInput.getInput(sc, "Enter First number");
        double secondNum = scInput.getInput(sc, "Enter second number.");

// Displaying user numbers from Confirm Statement class
        statement.printingStatement(firstNum, secondNum);

        String answer = "";
        // Keep asking until the user enters "yes" or "no"
        while (true) {

            System.out.print("Are these numbers correct? (yes/no): ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")) {
                break; // Valid answer, exit the loop
            } else {
                System.out.println("Invalid answer. Please answer Yes or No.");
            }
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.print("Which number do you want to change? (1-first /2-second /3=both): ");
            int numberToChange = sc.nextInt();
            if (numberToChange == 1) {
                scInput.getInput(sc, "Enter the new value for number 1: ");
            } else if (numberToChange == 2) {
                scInput.getInput(sc, "Enter the new value for number 2: ");
            }else if (numberToChange == 3) {
                scInput.getInput(sc, "Enter the new value for number 1: ");
                scInput.getInput(sc, "Enter the new value for number 2: ");
        } }
            statement.printingStatement(firstNum, secondNum);
            char operator;
            while (true) {
                System.out.print("Enter the operator (+, -, *, /): ");
                operator = sc.next().charAt(0);

                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break; // Valid operator, exit the loop
                } else {
                    System.out.println("Invalid operator. Please enter a valid operator.");
                }
            }

            double result = calc.performCalculation(firstNum, secondNum, operator);
            System.out.println("The final result:");
            System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
         }}
















