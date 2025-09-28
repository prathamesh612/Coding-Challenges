import java.util.Arrays;

public class JbelmudText {
    public static void main(String[] args) {
        // Test cases
        jbelmu("hello world");
        jbelmu("i love jumbled text");
        jbelmu("freecodecamp is my favorite place to learn to code");
        jbelmu("the quick brown fox jumps over the lazy dog");
    }

    private static void jbelmu(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(jumbleWord(word)).append(" ");
        }

        System.out.println(result.toString().trim());
    }

    private static String jumbleWord(String word) {
        if(word.length() <= 2) return word;    // nothing to sort for 1 or 2 letter words

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        char[] middle = word.substring(1, word.length() -1).toCharArray();
        Arrays.sort(middle);

        return first + new String(middle) + last;
    }
}

/*
 * Explanation of Inbuilt Methods Used:
 * 
 * - `String.split(" ")`  : Splits the sentence into individual words.
 * - `charAt()`           : Accesses the first and last letters of each word.
 * - `substring()`        : Extracts the middle portion of the word.
 * - `toCharArray()`      : Converts the middle substring into a char array.
 * - `Arrays.sort()`      : Sorts the middle characters alphabetically.
 * - `new String(char[])` : Converts the sorted char array back to a string.
 * - `StringBuilder`      : Efficiently concatenates all words into the final sentence.
 * - `trim()`             : Removes extra spaces at the start or end of the sentence.
 *
 * Using these methods makes the code clean, readable, and efficient.
 */
