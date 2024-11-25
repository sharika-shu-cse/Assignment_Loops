import java.util.Scanner;

public class UppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.print("Uppercase letters: ");
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
    }
}
