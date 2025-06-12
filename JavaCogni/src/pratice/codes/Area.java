package pratice.codes;

class Circle {
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle {
    void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea(5);

        Rectangle r = new Rectangle();
        r.calculateArea(10, 4);
    }
}
