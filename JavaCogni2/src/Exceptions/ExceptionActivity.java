package Exceptions;

import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionActivity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int a = sc.nextInt();

        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid. You can proceed.");
        } catch (InvalidAgeException e) {
            System.out.println( e.getMessage());
        }

        sc.close();
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}
