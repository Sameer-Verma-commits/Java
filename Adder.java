import java.util.Scanner;

public class Adder {
    // method to add two
    public int ADD(int a, int b) {
        return a + b;
    }

    // method to add three integer
    public int ADD(int a, int b, int c) {
        return a + b + c;
    }

    // method to add four integer
    public int ADD(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // calling methods
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[4];
        Adder obj = new Adder();
        for (int i = 2; i <= 4; i++) {
            System.out.println("______ADD " + i + " INTEGER_______");
            for (int j = 0; j < i; j++) {
                System.out.print("Enter a Number " + (j + 1) + ": ");
                arr[j] = input.nextInt();
            }
            if (i == 2) {
                System.out.println("Sum=" + obj.ADD(arr[0], arr[1]));
            } else if (i == 3) {
                System.out.println("Sum=" + obj.ADD(arr[0], arr[1], arr[2]));
            } else if (i == 4) {
                System.out.println("Sum=" + obj.ADD(arr[0], arr[1], arr[2], arr[3]));
            }

        }
        input.close();
        return;
    }
}
