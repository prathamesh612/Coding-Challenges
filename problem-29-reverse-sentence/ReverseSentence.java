public class ReverseSentence {

    public static void main(String[] args) {
        System.out.println(reverseSentence("world hello"));
        System.out.println(reverseSentence("push commit git"));
        System.out.println(reverseSentence("npm install sudo"));
        System.out.println(reverseSentence("import default function export"));
        System.out.println(reverseSentence("java    is   programming  language"));
    }

    // Reverses word order in sentence, normalizing spacing
    private static String reverseSentence(String sentence) {
        // Split by one or more spaces
        String[] words = sentence.split("\\s+");
        
        StringBuilder result = new StringBuilder();

        // Iterate backwards through words
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

/*
 * This program reverses the order of words in a sentence.
 * It splits the input by whitespace (handling multiple spaces) using regex.
 * Words are then iterated in reverse order and appended to a StringBuilder.
 * Single spaces are inserted between words in the output.
 * Returns the reversed sentence with normalized spacing.
 */