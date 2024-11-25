import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
    // List to store the data values
    private ArrayList<Double> values;

    // Constructor to initialize the list
    public DataSet() {
        values = new ArrayList<>();
    }

    // Method to add a value to the data set
    public void add(double value) {
        values.add(value);
    }

    // Method to calculate and return the average of the values
    public double getAverage() {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    // Method to find and return the smallest value
    public double getSmallest() {
        double smallest = values.get(0);
        for (double value : values) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    // Method to find and return the largest value
    public double getLargest() {
        double largest = values.get(0);
        for (double value : values) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    // Method to calculate and return the range (difference between largest and smallest)
    public double getRange() {
        return getLargest() - getSmallest();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        // Prompt the user to enter the values
        System.out.println("Enter a set of floating-point values (separate with space, end with non-numeric input):");
        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            dataSet.add(value);
        }

        // Print the results
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());
    }
}
