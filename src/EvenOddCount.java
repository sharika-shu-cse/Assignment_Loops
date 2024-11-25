import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int num, evenCount = 0, oddCount = 0;

        while ((num = scanner.nextInt()) != 0) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
