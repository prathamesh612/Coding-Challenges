public class EditDistance {

    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
        System.out.println(minDistance("intention", "execution"));
        System.out.println(minDistance("", "abc"));
        System.out.println(minDistance("abc", ""));
        System.out.println(minDistance("abc", "abc"));
        System.out.println(minDistance("abc", "def"));
        System.out.println(minDistance("sunday", "saturday"));
    }

    // Returns minimum number of operations to convert word1 to word2
    private static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // filling first column -> deleting characters from word1
        for (int i = 0; i <= m; i++)
            dp[i][0] = i;

        // filling first row -> inserting characters to form word2
        for (int j = 0; j <= n; j++)
            dp[0][j] = j;

        // compute answer for each substring of word1 and word2
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                // if characters match, no extra cost
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // choose min of delete, insert, replace
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j], // delete
                            Math.min(
                                    dp[i][j - 1], // insert
                                    dp[i - 1][j - 1] // replace
                            ));
                }
            }
        }

        return dp[m][n];
    }
}

/*
 * We use a DP table where dp[i][j] stores the minimum edits needed to convert
 * the first i characters of word1 into the first j characters of word2.
 * The first row and column represent converting from or to an empty string.
 * For each pair of characters, if they match we carry over the previous cost;
 * otherwise we take the cheapest among deleting, inserting, or replacing.
 * The final answer is dp[m][n].
 */
