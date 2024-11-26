import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int side = scanner.nextInt();

        int totalRows = 2 * side - 1;

        // Top half of the diamond
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < totalRows; j++) {
                if (j == side - i - 1 || j == side + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = side - 2; i >= 0; i--) {
            for (int j = 0; j < totalRows; j++) {
                if (j == side - i - 1 || j == side + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
