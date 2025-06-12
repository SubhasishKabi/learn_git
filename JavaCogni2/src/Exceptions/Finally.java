package Exceptions;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
            int result2 = 10 / 0;
//            System.out.println(" Result: " + result);
            System.out.println(" Result: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always runs!");
        }
        System.out.println("Program ends here.");
    }
}
