import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        // Taking input from user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();

        // Checking palindrome
        str = str.toLowerCase();
        int size = str.length();
        int i = 0, j = size - 1;
        boolean flag = true;
        while (i < size) {
            if (str.charAt(i) == str.charAt(j)) {

                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("It is NOT a palindrome.");
        } else {
            System.out.println("It is a palindrome.");
        }
        input.close();
        return;
    }
}