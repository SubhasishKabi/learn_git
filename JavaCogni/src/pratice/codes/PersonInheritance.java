package pratice.codes;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee2 extends Person {
    double salary;

    Employee2(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println  ("Salary : " + salary);
    }
}

public class PersonInheritance {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Subhasish", 24, 60000);
        emp.displayDetails();
    }
}

