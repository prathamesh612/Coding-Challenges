public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(1));
        System.out.println(isHappy(7));
        System.out.println(isHappy(10));
        System.out.println(isHappy(100));
        System.out.println(isHappy(3));
    }

    // Determines if a number is a happy number
    private static boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquares(n);

        while (fast != 1 && slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }

        return fast == 1;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}