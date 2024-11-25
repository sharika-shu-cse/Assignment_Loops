import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int num, smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;

        while ((num = scanner.nextInt()) != 0) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
