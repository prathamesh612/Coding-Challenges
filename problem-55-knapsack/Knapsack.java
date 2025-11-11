public class Knapsack {

    public static void main(String[] args) {

        System.out.println(knapsack(new int[] { 2, 3, 4, 5 }, new int[] { 3, 4, 5, 6 }, 5));
        System.out.println(knapsack(new int[] { 1, 3, 4, 5 }, new int[] { 1, 4, 5, 7 }, 7));
        System.out.println(knapsack(new int[] { 2, 2, 3 }, new int[] { 10, 5, 15 }, 5));
        System.out.println(knapsack(new int[] { 10, 20, 30 }, new int[] { 60, 100, 120 }, 50));
        System.out.println(knapsack(new int[] { 5, 10, 15, 20 }, new int[] { 10, 20, 30, 40 }, 30));
        System.out.println(knapsack(new int[] { 1, 2, 3 }, new int[] { 6, 10, 12 }, 5));
        System.out.println(knapsack(new int[] { 3, 4, 5 }, new int[] { 30, 50, 60 }, 8));
    }

    private static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(values[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
                }
            }
        }

        return dp[n][capacity];
    }
}
