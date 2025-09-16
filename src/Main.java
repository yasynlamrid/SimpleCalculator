import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("           SimpleCalculator");
        System.out.println("=====================================\n");
        System.out.println("Please choose an operation:\n");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit\n");
        System.out.print("Enter your choice (1-5): ");
        int choice = InputHelper.readChoice("Enter your choice (1-5): ",1,5);
        if (choice == 5)
        {
            System.out.println("Exiting the calculator. Goodbye!");
            System.exit(0);
        }
        double a = InputHelper.readNumber("Enter the first number: ");
        double b = InputHelper.readNumber("Enter the seconde number: ");
        switch (choice) {
            case 1 -> System.out.printf("%.1f + %.1f = %.1f%n", a, b, Calculator.add(a, b));
            case 2 -> System.out.printf("%.1f - %.1f = %.1f%n", a, b, Calculator.subtract(a, b));
            case 3 -> System.out.printf("%.1f x %.1f = %.1f%n", a, b, Calculator.multiply(a, b));
            case 4 -> System.out.printf("%.1f / %.1f = %.1f%n", a, b, Calculator.divide(a, b));

        }
    }
}