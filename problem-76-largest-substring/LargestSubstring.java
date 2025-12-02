public class LargestSubstring {

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
        System.out.println(maxLengthBetweenEqualCharacters("cabbac"));
        System.out.println(maxLengthBetweenEqualCharacters("abcdefagh"));
        System.out.println(maxLengthBetweenEqualCharacters("zzzz"));
        System.out.println(maxLengthBetweenEqualCharacters("abcbda"));
    }

    // Returns length of longest substring between two equal characters
    private static int maxLengthBetweenEqualCharacters(String s) {

        int[] first = new int[256]; // stores first index of each character

        // set all first occurrences to -1
        for (int i = 0; i < 256; i++)
            first[i] = -1;

        int maxLen = -1;

        // scan each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if seeing this character first time, store its index
            if (first[ch] == -1) {
                first[ch] = i;
            } else {
                // calculate length between current index and first index
                int len = i - first[ch] - 1;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}

/*
 * We keep track of the first time each character appears. Whenever we see the
 * same character again, we measure the distance between the two positions.
 * The maximum such distance (excluding the characters themselves) is the answer.
 * If no character repeats, we return -1.
 */
