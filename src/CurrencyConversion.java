import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for today's price of 1 USD in Japanese Yen
        System.out.print("Enter today's price for 1 USD in Japanese Yen: ");
        double rate = scanner.nextDouble();

        // Convert USD to Yen
        while (true) {
            System.out.print("Enter the amount in USD (0 to quit): ");
            double usd = scanner.nextDouble();

            if (usd == 0) {
                break; // Exit the loop
            }

            double yen = usd * rate;
            System.out.printf("%.2f USD = %.2f Yen%n", usd, yen);
        }

        System.out.println("Conversion program ended.");
        scanner.close();
    }
}
