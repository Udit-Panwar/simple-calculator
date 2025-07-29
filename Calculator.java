import java.util.Scanner;
public class Calculator {

    public static double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return Double.NaN;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator.");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("Welcome to Simple Calculator (Console Version)");

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);

            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
        scanner.close();
    }
}
