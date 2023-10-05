package in.com.cloningshivam;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Prompt the user for two numbers
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    // Prompt the user for the operation
    System.out.print("Enter the operation (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    // Perform the selected operation
    switch (operator) {
        case '+':
            System.out.println("Result: " + (num1 + num2));
            break;
        case '-':
            System.out.println("Result: " + (num1 - num2));
            break;
        case '*':
            System.out.println("Result: " + (num1 * num2));
            break;
        case '/':
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero");
            }
            break;
        default:
            System.out.println("Invalid operation");
    }

    // Close the scanner
    scanner.close();
}
}
