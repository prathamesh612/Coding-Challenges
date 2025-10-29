public class IntegerSequence {
    
    public static void main(String[] args) {
        System.out.println(sequence(5));
        System.out.println(sequence(10));
        System.out.println(sequence(1));
        System.out.println(sequence(27));
    }

    // Generates string of integers from 1 to n concatenated together
    private static String sequence(int n) {
        StringBuilder result = new StringBuilder();

        // Append each number from 1 to n
        for (int i = 1; i <= n; i++) {
            result.append(i);
        }

        return result.toString();
    }
}

/*
 * This program generates a sequence of integers from 1 to a given number.
 * All integers are concatenated into a single string with no separators.
 * Uses StringBuilder for efficient string concatenation in the loop.
 * Iterates from 1 to n inclusive, appending each integer to the result.
 * Returns the final concatenated string of all numbers in sequence.
 */