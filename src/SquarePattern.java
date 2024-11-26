import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the side length
        System.out.print("Enter the side length: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Filled square
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.print(" "); // Space between the two squares

            // Hollow square
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
