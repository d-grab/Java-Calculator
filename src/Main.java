// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        // Loop to get valid input for num1
        while (true) {
            System.out.println("Enter the first number:");
            try {
                num1 = sc.nextDouble();
                break; // Break the loop if valid input is provided
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear the input buffer
            }
        }

        // Loop to get valid input for num2
        while (true) {
            System.out.println("Enter the second number:");
            try {
                num2 = sc.nextDouble();
                break; // Break the loop if valid input is provided
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear the input buffer
            }
        }
        System.out.println("Enter the operator (+,-,*,/):");

        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;

            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;

            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;

            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");
        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}


