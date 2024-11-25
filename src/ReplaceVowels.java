import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = input.replaceAll("[AEIOUaeiou]", "_");
        System.out.println("String with vowels replaced: " + result);
    }
}

