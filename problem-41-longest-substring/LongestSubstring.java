import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(longestSubstring("bbbbb"));
        System.out.println(longestSubstring("pwwkew"));
        System.out.println(longestSubstring(""));
        System.out.println(longestSubstring("abcdef"));
        System.out.println(longestSubstring("abba"));
        System.out.println(longestSubstring("dvdf"));
    }

    // Returns the length of the longest substring without repeating characters
    private static int longestSubstring(String s) {
        if (s.isEmpty())
            return 0;

        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;

        // Use two pointers (left, right) to create a sliding window
        for (int right = 0; right < s.length(); right++) {

            // Remove characters from the left until the current char is unique
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }

            // Add the current character and update maximum length
            seen.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

/*
 * This method finds the longest substring in a string without repeating
 * characters.
 * It uses a sliding window with two pointers and a HashSet to track seen
 * characters.
 * When a duplicate is found, the left pointer moves until the substring becomes
 * unique again.
 *
 * Used: HashSet for constant-time lookup and two-pointer sliding window
 * technique.
 */