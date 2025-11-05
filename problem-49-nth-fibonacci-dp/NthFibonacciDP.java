public class NthFibonacciDP {

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(20));
        System.out.println(fibonacci(30));
        System.out.println(fibonacci(40));
    }

    // Computes nth Fibonacci number using tabulation (bottom-up DP)
    private static int fibonacci(int n) {
        // Handle base cases
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // Create DP array
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // Fill array using recurrence relation
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

/*
 * This program computes the nth Fibonacci number using Dynamic Programming (tabulation).
 * Instead of using recursion which causes exponential time complexity due to repeated calculations,
 * this approach stores previously computed Fibonacci numbers in an array.
 * Base cases F(0)=0 and F(1)=1 are set first.
 * Then iteratively builds up the solution using the recurrence F(n) = F(n-1) + F(n-2).
 * Time complexity: O(n), Space complexity: O(n).
 */