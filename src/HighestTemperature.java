import java.util.Scanner;

public class HighestTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperatures = new double[12];
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Read 12 temperature values
        System.out.println("Enter the temperatures for each month:");
        for (int i = 0; i < 12; i++) {
            System.out.print(months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Find the month with the highest temperature
        int maxIndex = 0;
        for (int i = 1; i < 12; i++) {
            if (temperatures[i] > temperatures[maxIndex]) {
                maxIndex = i;
            }
        }

        // Print the result
        System.out.println("The month with the highest temperature is "
                + months[maxIndex] + " with a temperature of "
                + temperatures[maxIndex] + "°.");
    }
}
