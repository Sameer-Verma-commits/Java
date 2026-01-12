import java.util.Scanner;

public class ArrSumAvg {
    public static void main(String args[]) {
        // Inputs Array From Users
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a Number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Sum & Avg of elements
        int sum = 0;
        double avg;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        avg = sum / 5.0;

        // Display the result
        System.out.println("Sum= " + sum);
        System.out.println("Average= " + avg);
        input.close();
        return;
    }
}