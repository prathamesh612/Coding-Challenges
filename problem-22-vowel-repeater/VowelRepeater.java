public class VowelRepeater {

    public static void main(String[] args) {
        System.out.println(repeatVowels("hello world"));
        System.out.println(repeatVowels("AEIOU"));
        System.out.println(repeatVowels("Java"));
        System.out.println(repeatVowels("programming"));
        System.out.println(repeatVowels("aAa"));
        System.out.println(repeatVowels("xyz"));
        System.out.println(repeatVowels("I like eating ice cream in Iceland"));
    }

    // Returns string with progressively repeated vowels
    private static String repeatVowels(String input) {
        StringBuilder result = new StringBuilder();
        int vowelCount = 0;

        for (char ch : input.toCharArray()) {
            char lowerCh = Character.toLowerCase(ch);
            
            // Check if character is a vowel
            if (isVowel(lowerCh)) {
                result.append(ch);  // Original case
                result.append(String.valueOf(lowerCh).repeat(vowelCount));  // Lowercase repeats
                vowelCount++;
            } else {
                result.append(ch);  // Non-vowel unchanged
            }
        }

        return result.toString();
    }

    // Helper method to check if character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

/*
 * This program progressively repeats vowels in a string.
 * Each vowel encountered is repeated one more time than the previous vowel.
 * The first vowel appears once, second appears twice, third three times, etc.
 * Original vowel maintains its case while repeated vowels are lowercase.
 * Non-vowel characters remain unchanged.
 * Uses a helper method to identify vowels and StringBuilder for efficient string construction.
 */