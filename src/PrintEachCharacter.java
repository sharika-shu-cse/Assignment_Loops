import java.util.Scanner;

public class PrintEachCharacter {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read a word from the user
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Loop through each character of the word and print it on a separate line
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
