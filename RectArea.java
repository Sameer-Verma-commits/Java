class Rectangle {
    // Declaration of variable
    double length, width, area;

    // Constructor
    Rectangle(double x, double y) {
        length = x;
        width = y;
    }

    // Definition of method 1
    void Area() {
        area = length * width;
    }

    // Definition of method 2
    void Display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area of a rectangle is: " + area);
    }
}

public class RectArea {
    public static void main(String[] args) {
        // Creating objects
        Rectangle rect1 = new Rectangle(15, 8);
        Rectangle rect2 = new Rectangle(9.5, 4.3);

        // Accessing class members for each object
        rect1.Area();
        rect1.Display();

        rect2.Area();
        rect2.Display();
    }
}