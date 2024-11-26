import java.util.Scanner;

public class XShapeInBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int side = scanner.nextInt();

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                // Print '*' for the border or for the X shape
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1 || j == i || j == side - i - 1) {
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
