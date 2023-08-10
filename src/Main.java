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
        double secondNum = scInput.getInput(sc, "Enter second number.");

// Checking if the input is Correct
        System.out.println("You entered:");
        System.out.println("Number 1: " + firstNum);
        System.out.println("Number 2: " + secondNum);




    }
}


