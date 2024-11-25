import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set a Boolean variable "first" to true
        boolean first = true;
        double minimum = 0;

        System.out.println("Enter numbers (enter a non-numeric value to stop):");

        // If the scanner has more numbers
        while (scanner.hasNextDouble()) {
            // Read the next value
            double value = scanner.nextDouble();

            // If first is true, set the minimum to the value
            if (first) {
                minimum = value;
                first = false;
            }
            // Else if the value is less than the minimum, set the minimum to the value
            else if (value < minimum) {
                minimum = value;
            }
        }

        // Print the minimum value
        System.out.println("The minimum value is: " + minimum);
    }
}

