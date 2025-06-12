package pratice.codes;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add(int, int): " + calc.add(10, 20));
        System.out.println("Add(double, double): " + calc.add(5.5, 4.5));
        System.out.println("Add(int, int, int): " + calc.add(1, 2, 3));
    }
}
