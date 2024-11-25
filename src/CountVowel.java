import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read a word from the user
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Convert the word to lowercase to handle both uppercase and lowercase vowels
        word = word.toLowerCase();

        // Initialize a variable to count the number of vowels
        int vowelCount = 0;

        // Loop through each character of the word
        for (int i = 0; i < word.length(); i++) {
            // Check if the character is a vowel
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                vowelCount++;
            }
        }

        // Print the number of vowels in the word
        System.out.println("Number of vowels: " + vowelCount);
    }
}
