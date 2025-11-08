public class CoinChangeWays {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[] { 1, 2, 5 }, 5));
        System.out.println(coinChange(new int[] { 2 }, 3));
        System.out.println(coinChange(new int[] { 10 }, 10));
        System.out.println(coinChange(new int[] { 1, 2, 3 }, 4));
        System.out.println(coinChange(new int[] { 2, 5, 3, 6 }, 10));
        System.out.println(coinChange(new int[] { 1 }, 0));
        System.out.println(coinChange(new int[] { 5, 10 }, 12));
    }

    // Returns total number of ways to make 'amount' using given coins
    private static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        // Base case: 1 way to make amount 0 by choosing no coins
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        // Fill first row using only the first coin type
        for (int j = 0; j <= amount; j++) {
            dp[0][j] = (j % coins[0] == 0) ? 1 : 0;
        }

        // Fill the rest of the table using previous results
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i] > j) {
                    // Current coin too large -> exclude it
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Include current coin + exclude current coin
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
                }
            }
        }

        return dp[n - 1][amount];
    }
}

/*
 * This method calculates the number of ways to make up a given amount using coins.
 * It builds a DP table where dp[i][j] means ways to form amount j using first i coins.
 * The formula combines inclusion and exclusion of the current coin.
 * Time Complexity: O(n * amount)
 * Space Complexity: O(n * amount)
 */