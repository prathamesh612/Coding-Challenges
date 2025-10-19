public class SentenceCapitalizer {

    public static void main(String[] args) {
        System.out.println(capitalize("this is a simple sentence."));
        System.out.println(capitalize("hello world. how are you?"));
        System.out.println(capitalize("i did today's coding challenge... it was fun!!"));
        System.out.println(capitalize("crazy!!!strange???unconventional...sentences."));
        System.out.println(capitalize("there's a space before this period . why is there a space before that period ?"));
    }

    // Capitalizes first letter of each sentence in a paragraph
    private static String capitalize(String paragraph) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true; // Start true to capitalize first letter

        for (char ch : paragraph.toCharArray()) {
            // Check if current character is a sentence ending
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
                result.append(ch);
            }
            // If we should capitalize and it's a letter
            else if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            }
            // All other characters remain unchanged
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

/*
 * This program capitalizes the first letter of each sentence in a paragraph.
 * Sentences are identified by ending punctuation: period, question mark, or exclamation point.
 * The program iterates through each character, tracking whether the next letter should be capitalized.
 * When a sentence-ending punctuation is found, a flag is set to capitalize the next letter encountered.
 * All other characters including spaces, punctuation, and non-letters are preserved exactly as they appear.
 * Returns a new string with properly capitalized sentences while maintaining original formatting.
 */