package FileHandling;

import java.io.*;
import java.util.*;

public class StudentsFile {

    public static void main(String[] args) {

        List<String> studentNames = Arrays.asList("Bellingham", "Messi", "Ronaldo", "Kohli", "Dhoni");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("E:/testing/JavaCogni2/students.txt"))) {
            for (String name : studentNames) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Student names written to file.");
        } catch (IOException e) {
            System.out.println(" Error writing to file: " + e.getMessage());
        }

        System.out.println("\n Student Names in Uppercase:");
        try (BufferedReader reader = new BufferedReader(new FileReader("E:/testing/JavaCogni2/students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println(" Error reading from file: " + e.getMessage());
        }
    }
}
