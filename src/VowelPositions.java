import java.util.Scanner;

public class VowelPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.print("Positions of vowels: ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.print(i + " ");
            }
        }
    }
}
