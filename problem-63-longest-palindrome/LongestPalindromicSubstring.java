public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("racecar"));
        System.out.println(longestPalindrome("noon"));
        System.out.println(longestPalindrome("abcdef"));
    }

    // Returns the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            // odd length palindromes
            String odd = expand(s, i, i);
            if (odd.length() > res.length())
                res = odd;

            // even length palindromes
            String even = expand(s, i, i + 1);
            if (even.length() > res.length())
                res = even;
        }
        return res;
    }

    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}