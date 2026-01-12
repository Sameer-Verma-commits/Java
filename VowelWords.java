import java.util.Scanner;

public class VowelWords {
    public static void main(String args[]) {
        // Taking input from user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String line = input.nextLine();

        // Finding vowel words
        System.out.println("Vowel Words in Above Sentence are: ");
        String words[] = line.split(" ");
        int size = words.length;
        for (int i = 0; i < size; i++) {
            char first = words[i].toLowerCase().charAt(0);
            if ("aeiou".indexOf(first) != -1) {
                System.out.println(words[i]);
            }
        }
        input.close();
    }
}