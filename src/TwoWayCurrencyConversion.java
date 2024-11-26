import java.util.Scanner;

public class TwoWayCurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for today's price of 1 USD in Japanese Yen
        System.out.print("Enter today's price for 1 USD in Japanese Yen: ");
        double rate = scanner.nextDouble();

        // Convert USD to Yen
        System.out.println("Enter amounts in USD to convert to Yen (0 to stop):");
        while (true) {
            System.out.print("USD: ");
            double usd = scanner.nextDouble();
            if (usd == 0) {
                break;
            }
            double yen = usd * rate;
            System.out.printf("%.2f USD = %.2f Yen%n", usd, yen);
        }

        // Convert Yen to USD
        System.out.println("\nEnter amounts in Yen to convert to USD (0 to stop):");
        while (true) {
            System.out.print("Yen: ");
            double yen = scanner.nextDouble();
            if (yen == 0) {
                break;
            }
            double usd = yen / rate;
            System.out.printf("%.2f Yen = %.2f USD%n", yen, usd);
        }

        System.out.println("Conversion program ended.");
        scanner.close();
    }
}
