package collections;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 8, 22, 3, 10, 5, 4, 12, 7, 18);

        System.out.println("Even Numbers (Sorted):");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);


        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Bellingham");
        employees.put(102, "Ronaldo");
        employees.put(103   , "Messi");
        employees.put(104, "Neymar");

        System.out.println("Employee Details:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
