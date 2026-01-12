import java.util.Scanner;

// Define an interface
interface Shape {
    double area();

    double circumference();
}

// Implement the interface in a class Circle
class Circle implements Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing methods of Shape interface
    public double area() {
        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = obj.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Area of Circle= " + circle.area());
        System.out.println("Circumference of Circle= " + circle.circumference());
    }
}
