import java.util.Scanner;

public class CumulativeTotals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int num, cumulativeSum = 0;

        while ((num = scanner.nextInt()) != 0) {
            cumulativeSum += num;
            System.out.print(cumulativeSum + " ");
        }
    }
}
