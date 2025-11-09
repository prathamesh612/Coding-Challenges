public class CoinChangeMin {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[] { 1, 2, 5 }, 11));
        System.out.println(coinChange(new int[] { 2 }, 3));
        System.out.println(coinChange(new int[] { 1 }, 0));
        System.out.println(coinChange(new int[] { 1, 3, 4 }, 6));
        System.out.println(coinChange(new int[] { 2, 5, 10 }, 27));
        System.out.println(coinChange(new int[] { 186, 419, 83, 408 }, 6249));
        System.out.println(coinChange(new int[] { 1, 2, 5 }, 100));
    }

    // Returns the minimum number of coins needed to make the given amount
    private static int coinChange(int[] coins, int amount) {

        if (amount == 0)
            return 0;

        int n = coins.length;
        int INF = Integer.MAX_VALUE - 1; // Prevent overflow when adding 1 later
        int[][] dp = new int[n][amount + 1];

        // Base case: 0 coins needed to make amount 0
        for (int i = 0; i < n; i++)
            dp[i][0] = 0;

        // Fill first row: using only the first coin type
        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0)
                dp[0][j] = j / coins[0];
            else
                dp[0][j] = INF; // impossible amount
        }

        // Build the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i] > j) {
                    // Can't use this coin, copy from above
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Take the minimum between including or excluding the coin
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i]]);
                }
            }
        }

        return dp[n - 1][amount] == INF ? -1 : dp[n - 1][amount];
    }
}

/*
 * This method finds the minimum number of coins needed to make up a given amount.
 * It uses dynamic programming to compare two choices for each coin:
 * 1. Exclude the coin  → dp[i-1][j]
 * 2. Include the coin  → 1 + dp[i][j - coin[i]]
 *
 * If the amount can’t be formed, the function returns -1.
 * Time Complexity: O(n * amount)
 * Space Complexity: O(n * amount)
 *
 * Why we use "int INF = Integer.MAX_VALUE - 1":
 * ------------------------------------------------
 * We use INF to represent an impossible state.
 * Subtracting 1 prevents integer overflow when we later add 1.
 * Without -1, adding 1 to Integer.MAX_VALUE would wrap around to a negative number.
 */