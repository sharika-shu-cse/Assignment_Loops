import java.util.Scanner;

public class AdjacentDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int prev = Integer.MIN_VALUE, num;
        boolean firstDuplicate = true;

        while ((num = scanner.nextInt()) != 0) {
            if (num == prev) {
                if (firstDuplicate) {
                    System.out.print(num + " ");
                    firstDuplicate = false;
                }
            } else {
                firstDuplicate = true;
            }
            prev = num;
        }
    }
}
