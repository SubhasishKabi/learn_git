package Exceptions;

import java.util.*;

public class ArrayOutOfBounds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter the index to access (0 to " + (numbers.length - 1) + "): ");
        int index = sc.nextInt();

        try {
            int value = numbers[index];
            System.out.println("Element at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
