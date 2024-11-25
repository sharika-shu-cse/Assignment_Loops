import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringsSortedByLength {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read a word from the user
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // List to store all the substrings
        ArrayList<String> substrings = new ArrayList<>();

        // Generate all possible substrings and add them to the list
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        // Sort the substrings list by the length of the substrings
        Collections.sort(substrings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Print all the substrings sorted by length
        System.out.println("Substrings sorted by length:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
