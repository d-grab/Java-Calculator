import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScannerInput scInput = new ScannerInput();
        double firstNum = scInput.getInput(sc, "Enter First number");
        double secondNum = scInput.getInput(sc, "Enter second number.");
        System.out.println("You entered:");
        System.out.println("Number 1: " + firstNum);
        System.out.println("Number 2: " + secondNum);
        }
    }
