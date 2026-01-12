import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        // Inputs From Users
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        // Determining Even or Odd number
        if (num % 2 == 0) {
            System.out.println("It is an even Number.");
        } else {
            System.out.println("It is an odd Number.");
        }
        input.close();
        return;
    }

}