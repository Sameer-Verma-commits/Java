class Calculator {
    // Example of Overloading
    // method to add two
    public int ADD(int a, int b) {
        return a + b;
    }

    // method to add three integer
    public int ADD(int a, int b, int c) {
        return a + b + c;
    }

    // method to two floating number
    public double ADD(double a, double b) {
        return a + b;
    }
}

class vehicle {
    // Example for Overriding
    void speed() {
        System.out.println("This Vehicle's Speed is 300 km/h.");
    }
}

class Car extends vehicle {
    // method speed() of superclass is override in subclass.
    void speed() {
        System.out.println("This Car's speed is 500 km/h.");
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println("_________Method Overloading___________");
        System.out.println("Sum of 2 numbers: 10 + 20 = " + calc.ADD(10, 20));
        System.out.println("Sum of 3 numbers: 10 + 20 + 30 = " + calc.ADD(10, 20, 30));
        System.out.println("Sum of 2 numbers: 5.5 + 20.3 = " + calc.ADD(5.5, 20.3));

        System.out.println("_________Method Overriding___________");
        vehicle v1 = new vehicle();
        vehicle c1 = new Car();
        v1.speed();
        c1.speed();
    }
}