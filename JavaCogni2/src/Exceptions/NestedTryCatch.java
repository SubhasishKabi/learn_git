package Exceptions;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            //handles array-related exceptions
            System.out.println("Outer try block started");
            try {
                //handles arithmetic error
                System.out.println("Inner try block started");
                int result = 100 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero - " + e.getMessage());
            }
            // Accessing out-of-bounds index
            int value = numbers[5];
            System.out.println("Value at index 5: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index - " + e.getMessage());
        }

        System.out.println("Program ended successfully.");
    }
}
