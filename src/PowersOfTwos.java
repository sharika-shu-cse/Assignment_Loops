public class PowersOfTwos {
    public static void main(String[] args) {
        // Start from 2^20 and print all powers of 2 up to 2^220
        for (int i = 20; i <= 220; i++) {
            // Calculate 2^i
            long powerOfTwo = (long) Math.pow(2, i);
            // Print the result
            System.out.println("2^" + i + " = " + powerOfTwo);
        }
    }
}
