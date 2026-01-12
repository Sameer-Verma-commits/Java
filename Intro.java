import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // Inputs From Users
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        System.out.print("College Name: ");
        String coll = input.nextLine();
        System.out.print("Course: ");
        String course = input.nextLine();
        System.out.print("Roll Number: ");
        int roll = input.nextInt();

        // Display Output
        System.out.println("________SUDENT DETAILS________");
        System.out.println(
                "Student: " + name + "\nAge: " + age + "\nCollege: " + coll + "\nCourse: " + course + "\nRoll No:" +
                        roll);
    }
}
