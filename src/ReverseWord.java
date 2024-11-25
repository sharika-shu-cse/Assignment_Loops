import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read a word from the user
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Initialize an empty string to store the reversed word
        String reversedWord = "";

        // Loop through the word in reverse order and construct the reversed word
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // Print the reversed word
        System.out.println("Reversed word: " + reversedWord);
    }
}
