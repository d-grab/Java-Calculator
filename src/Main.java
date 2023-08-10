// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Creating Scanner
        Scanner sc = new Scanner(System.in);

// Creating object of Calculation class
        Calculation calculator = new Calculation();
        ScannerInput scInput = new ScannerInput();

        double firstNum = scInput.getInput(sc,"Enter First number");
        double secondNum = scInput.getInput(sc, "Enter second number");

// Checking if the input is Correct
        System.out.println("You entered:");
        System.out.println("Number 1: " + firstNum);
        System.out.println("Number 2: " + secondNum);




        System.out.println("Are You sure the first number ("+num1+") and second number ("+ num2+") are correct ?");
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


