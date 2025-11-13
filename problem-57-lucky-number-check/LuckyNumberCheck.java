public class LuckyNumberCheck {

    public static void main(String[] args) {
        System.out.println(isLuckyNumber(123321));
        System.out.println(isLuckyNumber(562561));
        System.out.println(isLuckyNumber(123456));
        System.out.println(isLuckyNumber(555999));
        System.out.println(isLuckyNumber(43211234));
        System.out.println(isLuckyNumber(987123));
        System.out.println(isLuckyNumber(111111));
    }

    // Checks if a number is "lucky" (sum of first half digits = sum of second half digits)
    public static boolean isLuckyNumber(int num) {
        String s = String.valueOf(num); // convert number to string
        int n = s.length();

        // If number has odd digits, it can't be lucky
        if (n % 2 != 0) return false;

        int mid = n / 2;
        int sum1 = 0, sum2 = 0;

        // Sum digits of both halves
        for (int i = 0; i < mid; i++) {
            sum1 += s.charAt(i) - '0';       // first half
            sum2 += s.charAt(i + mid) - '0'; // second half
        }

        // Return true if both sums are equal
        return sum1 == sum2;
    }
}

/*
 * This program checks if a number is "lucky" — meaning
 * the sum of digits in its first half equals the sum in its second half.
 * It works only for numbers with an even number of digits.
 *
 * Used: String conversion for easy digit access and simple summation logic.
 * Time Complexity: O(n), where n is the number of digits.
 */
