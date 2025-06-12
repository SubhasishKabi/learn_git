import MathUtils.Calculator;

public class MainApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 12, b = 4;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
    }
}
