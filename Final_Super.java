class Vehicle {
    // Final method cannot be override.
    public final void type() {
        System.out.println("Only Motor Vehicles Allowed.");
    }

    public void Speed(int s) {
        if (s < 80) {
            System.out.println("Too Slow...Move To Left Lane.");
        } else {
            System.out.println("Have a Good Journey!");
        }

    }
}

class Car extends Vehicle {

    public void Speed(int s) {
        if (s < 200) {
            // refering to function of super class.
            super.Speed(s);
        } else {
            System.out.println("Overspeeding... Please Follow Speed Limit.");
        }
    }
}

public class Final_Super {
    public static void main(String args[]) {
        Vehicle c1 = new Car();
        c1.type();
        System.out.println("Car Speed: 50");
        c1.Speed(50);
        System.out.println("Car Speed: 100");
        c1.Speed(100);
        System.err.println("Car Speed: 200");
        c1.Speed(200);
    }
}