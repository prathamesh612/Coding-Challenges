import java.util.*;

public class MinCostMergeStones {

    public static void main(String[] args) {
        System.out.println(mergeStones(new int[] { 3, 2, 4, 1 }, 2));
        System.out.println(mergeStones(new int[] { 3, 2, 4, 1 }, 3));
        System.out.println(mergeStones(new int[] { 3, 4, 2 }, 2));
        System.out.println(mergeStones(new int[] { 1, 1, 1, 1 }, 2));
        System.out.println(mergeStones(new int[] { 1, 1, 1 }, 2));
        System.out.println(mergeStones(new int[] { 6, 4, 4, 6 }, 2));
        System.out.println(mergeStones(new int[] { 1, 2, 3, 4 }, 3));
        System.out.println(mergeStones(new int[] { 5, 4, 3, 2, 1 }, 3));
    }

    private static int mergeStones(int[] stones, int k) {

        int n = stones.length;

        // check if it is even possible to end up with exactly one pile
        // this condition comes from how merges reduce piles by (k - 1)
        if ((n - 1) % (k - 1) != 0) {
            return -1;
        }

        // build prefix sum so we can quickly calculate the cost of merging
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stones[i];
        }

        // dp[i][j][m] = minimum cost to merge stones from i to j into m piles
        int[][][] dp = new int[n][n][k + 1];

        // initialize everything with a very large number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Integer.MAX_VALUE / 2);
            }
            dp[i][i][1] = 0; // a single pile costs nothing
        }

        // try intervals of increasing length
        for (int len = 2; len <= n; len++) {

            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;

                // compute cost to form m piles (from 2 to k)
                for (int m = 2; m <= k; m++) {

                    // break the interval at valid positions
                    // stepping by (k - 1) helps follow proper merging structure
                    for (int p = i; p < j; p += (k - 1)) {
                        dp[i][j][m] = Math.min(
                                dp[i][j][m],
                                dp[i][p][1] + dp[p + 1][j][m - 1]);
                    }
                }

                // once we have exactly k piles, we can merge them into one
                if (dp[i][j][k] < Integer.MAX_VALUE / 2) {
                    int total = prefix[j + 1] - prefix[i];
                    dp[i][j][1] = dp[i][j][k] + total;
                }
            }
        }

        return dp[0][n - 1][1];
    }
}

/*
 * The idea is to use dynamic programming to track the minimum cost of merging
 * any subrange of the array into a certain number of piles. A merge is only
 * allowed when we have exactly k piles, so we gradually build our answer by
 * checking every possible interval and every possible way to divide it. Prefix
 * sums help compute merge costs quickly. In the end, dp[0][n-1][1] gives the
 * minimum cost needed to merge the entire array into a single pile.
 */
