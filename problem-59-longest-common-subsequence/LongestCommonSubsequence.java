public class LongestCommonSubsequence {

    public static void main(String[] args) {
        System.out.println(LCS("abcde", "ace"));
        System.out.println(LCS("abc", "abc"));
        System.out.println(LCS("abc", "def"));
        System.out.println(LCS("AGGTAB", "GXTXAYB"));
        System.out.println(LCS("programming", "gaming"));
        System.out.println(LCS("", "abc"));
        System.out.println(LCS("abcdef", "fedcba"));
    }

    private static int LCS(String str1, String str2) {

        int str1Len = str1.length();
        int str2Len = str2.length();

        // If any string is empty LCS is 0
        if (str1Len == 0 || str2Len == 0) {
            return 0;
        }

        int[][] dp = new int[str1Len + 1][str2Len + 1];

        // First row = 0 (can't match anything with empty string)
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        // First column = 0
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        // Fill table bottom-up
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                // If characters match -> take diagonal + 1
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // Else pick max from left or top
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[str1Len][str2Len]; // bottom-right cell holds final LCS length
    }
}

/*
 * This program calculates the length of the Longest Common Subsequence (LCS)
 * using dynamic programming.
 *
 * If characters match → extend LCS by 1 (diagonal).
 * If they don’t match → choose the best between skipping one char from either string.
 *
 * dp[i][j] stores LCS of the first i chars of str1 and first j chars of str2.
 * The final answer sits at dp[str1.length()][str2.length()].
 */
