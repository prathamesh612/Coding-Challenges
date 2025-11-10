public class SubsetSumProblem {

    public static void main(String[] args) {
        System.out.println(subsetSum(new int[] { 3, 34, 4, 12, 5, 2 }, 9));
        System.out.println(subsetSum(new int[] { 3, 34, 4, 12, 5, 2 }, 30));
        System.out.println(subsetSum(new int[] { 1, 2, 3, 4, 5 }, 10));
        System.out.println(subsetSum(new int[] { 2, 3, 7, 8 }, 11));
        System.out.println(subsetSum(new int[] { 1, 5, 11, 5 }, 11));
        System.out.println(subsetSum(new int[] { 2, 4, 6, 8 }, 5));
        System.out.println(subsetSum(new int[] { 1 }, 0));
    }

    // Checks if any subset of 'nums' can sum up to 'target'
    private static boolean subsetSum(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n][target + 1];

        // Base case: sum 0 can always be formed
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        // Initialize first row: can only form target if it's equal to nums[0]
        for (int j = 1; j <= target; j++) {
            dp[0][j] = j == nums[0] ? 1 : 0;
        }

        // Build DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= nums[i]) {
                    // Either exclude current element or include it
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - nums[i]];
                } else {
                    // Can't include current element if it's larger than current target
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n - 1][target] == 1;
    }
}

/*
 * This program checks whether there exists a subset in a given array
 * whose elements add up exactly to a given target value.
 *
 * It uses dynamic programming (O(n * target)) where dp[i][j] tells whether
 * it's possible to make sum 'j' using the first 'i' elements.
 *
 * The logic checks two cases for each element:
 * 1. Exclude the element.
 * 2. Include the element if its value is ≤ current sum.
 *
 * Finally, dp[n-1][target] gives the answer (true/false).
 */
