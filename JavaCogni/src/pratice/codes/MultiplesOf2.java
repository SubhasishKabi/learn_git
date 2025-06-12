package pratice.codes;

public class MultiplesOf2 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 100 (excluding multiples of 10):");
        for (int i = 2; i <= 100; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
