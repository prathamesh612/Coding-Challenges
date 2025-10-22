public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(2));
        System.out.println(isPerfectSquare(99));
        System.out.println(isPerfectSquare(-9));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(25281));
    }

    // Checks if number is a perfect square
    private static boolean isPerfectSquare(int num) {
        // Negative numbers cannot be perfect squares
        if (num < 0) {
            return false;
        }

        // 0 and 1 are perfect squares
        if (num == 0 || num == 1) {
            return true;
        }

        // Check from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (i * i == num) {
                return true;
            }
        }

        return false;
    }
}

/*
 * This program determines if a number is a perfect square.
 * A perfect square is a number that equals some integer multiplied by itself.
 * Negative numbers are immediately rejected as they cannot be perfect squares.
 * Special cases 0 and 1 are handled separately as they are perfect squares.
 * For other numbers, iterate from 2 to the square root checking if i*i equals the number.
 * Using sqrt as the upper bound optimizes the search significantly.
 */