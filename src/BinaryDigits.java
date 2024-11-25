import java.util.Scanner;

public class BinaryDigits {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Continue dividing the number by 2 and printing the remainder
        while (number > 0) {
            // Print the remainder (binary digit)
            System.out.println(number % 2);

            // Update the number by dividing it by 2
            number = number / 2;
        }
    }
}
