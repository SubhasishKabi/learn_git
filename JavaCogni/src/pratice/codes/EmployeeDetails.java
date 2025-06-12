package pratice.codes;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;
    String designation;

    Employee(String name, int age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Salary      : " + salary);
        System.out.println("Designation : " + designation);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();


        sc.nextLine();

        System.out.print("Enter employee designation: ");
        String designation = sc.nextLine();

        Employee emp = new Employee(name, age, salary, designation);

        emp.displayDetails();

        sc.close();
    }
}
