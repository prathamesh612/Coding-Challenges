import java.util.Arrays;

public class TribonacciSequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacciSequence(new int[] { 0, 0, 1 }, 20)));
        System.out.println(Arrays.toString(tribonacciSequence(new int[] { 21, 32, 43 }, 1)));
        System.out.println(Arrays.toString(tribonacciSequence(new int[] { 0, 0, 1 }, 0)));
        System.out.println(Arrays.toString(tribonacciSequence(new int[] { 10, 20, 30 }, 2)));
        System.out.println(Arrays.toString(tribonacciSequence(new int[] { 10, 20, 30 }, 3)));
        System.out.println(Arrays.toString(tribonacciSequence(new int[] { 123, 456, 789 }, 8)));
    }

    // Generates Tribonacci sequence of given length from starting values
    private static int[] tribonacciSequence(int[] startSequence, int length) {
        // Handle empty sequence
        if (length == 0) {
            return new int[0];
        }

        int[] result = new int[length];

        // Copy starting numbers (up to length or 3, whichever is smaller)
        for (int i = 0; i < Math.min(length, 3); i++) {
            result[i] = startSequence[i];
        }

        // Generate remaining numbers
        for (int i = 3; i < length; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result;
    }
}

/*
 * This program generates a Tribonacci sequence of specified length.
 * The Tribonacci sequence is similar to Fibonacci but each number is the sum of the previous three.
 * It takes an array of three starting numbers and a target length.
 * The function copies the initial values and then calculates subsequent numbers.
 * Returns an empty array if length is 0, or a partial sequence if length is less than 3.
 */