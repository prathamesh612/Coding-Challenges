import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {

        areAnagrams("listen", "silent");
        areAnagrams("School master", "The classroom");
        areAnagrams("A gentleman", "Elegant man");
        areAnagrams("Astronomer", "Moon starer");
        areAnagrams("Dormitory", "Dirty room");
        areAnagrams("Hello", "O hell");
        areAnagrams("Tom Marvolo Riddle", "I am Lord Voldemort");
        areAnagrams("Debit card", "Bad credit");
        areAnagrams("Hello", "World");
        areAnagrams("apple", "banana");
        areAnagrams("cat", "dog");
        areAnagrams("Listen", "Silentt");
    }

    private static void areAnagrams(String s1, String s2) {
        String sorted1 = getSortedString(s1);
        String sorted2 = getSortedString(s2);

        if (sorted1.equals(sorted2)) {
            System.out.println("Yes, they are anagrams!");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }

    private static String getSortedString(String s) {
        // Remove spaces and convert to lowercase
        s = s.replaceAll("\\s+", "").toLowerCase();

        // Convert to char array and sort
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}

/*
 * Explanation of Inbuilt Methods Used:
 *
 * - `toLowerCase()`       : Converts all characters in the string to lowercase for case-insensitive comparison.
 * - `replaceAll()`        : Removes all spaces from the string using a regular expression.
 * - `toCharArray()`       : Converts the string into a character array for sorting.
 * - `Arrays.sort()`       : Sorts the character array in ascending order.
 * - `new String(char[])`  : Converts the sorted character array back into a string. (Line No. : 39)
 * - `equals()`            : Compares the two sorted strings for equality.
 *
 * These methods together help normalize, sort, and compare the strings to check if they are anagrams.
 */
