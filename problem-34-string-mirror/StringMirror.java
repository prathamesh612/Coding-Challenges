public class StringMirror {

    public static void main(String[] args) {
        System.out.println(isMirror("helloworld", "helloworld"));
        System.out.println(isMirror("Hello World", "dlroW olleH"));
        System.out.println(isMirror("RaceCar", "raCecaR"));
        System.out.println(isMirror("RaceCar", "RaceCar"));
        System.out.println(isMirror("Mirror", "rorrim"));
        System.out.println(isMirror("Hello World", "dlroW-olleH"));
        System.out.println(isMirror("Hello World", "!dlroW !olleH"));
    }

    // Checks if second string is a mirror (reverse) of first string
    private static boolean isMirror(String first, String second) {
        // Extract only letters from both strings
        String lettersOnly1 = extractLetters(first);
        String lettersOnly2 = extractLetters(second);

        // Compare first string with reversed second string
        return lettersOnly1.equals(new StringBuilder(lettersOnly2).reverse().toString());
    }

    // Helper method to extract only letters from a string
    private static String extractLetters(String input) {
        StringBuilder letters = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            }
        }

        return letters.toString();
    }
}

/*
 * This program determines if two strings are mirrors of each other.
 * A mirror means the second string contains the same letters as the first in reverse order.
 * Only alphabetical characters are compared (case-sensitive).
 * All non-letter characters including spaces, numbers, and punctuation are ignored.
 * Extracts letters from both strings and compares the first with the reversed second.
 */