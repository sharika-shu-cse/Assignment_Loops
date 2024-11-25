public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // Size of the table

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j); // Format with 4 spaces for alignment
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
