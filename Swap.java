import java.util.Scanner;

public class Swap {
    public static void main(String args[]) {
        // Inputs From Users
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number 1: ");
        int a = input.nextInt();
        System.out.print("Enter a Number 2: ");
        int b = input.nextInt();
        System.out.println("Values Before Swapping: ");
        System.out.println("a=" + a + " & b=" + b);
        // swapping
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values After Swapping: ");
        System.out.println("a=" + a + " & b=" + b);
        return;
    }
}