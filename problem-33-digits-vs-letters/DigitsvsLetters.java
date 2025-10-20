public class DigitsvsLetters {

    public static void main(String[] args) {
        System.out.println(digitsOrLetters("abc123"));
        System.out.println(digitsOrLetters("a1b2c3d"));
        System.out.println(digitsOrLetters("1a2b3c4"));
        System.out.println(digitsOrLetters("abc123!@#DEF"));
        System.out.println(digitsOrLetters("H3110 W0R1D"));
        System.out.println(digitsOrLetters("P455W0RD"));
    }

    // Determines if string has more digits, letters, or equal amounts
    private static String digitsOrLetters(String input) {
        int digitCount = 0;
        int letterCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
            // All other characters are ignored
        }

        if (digitCount > letterCount) {
            return "digits";
        } else if (digitCount < letterCount) {
            return "letters";
        } else {
            return "tie";
        }
    }
}

/*
 * This program compares the count of digits and letters in a string.
 * It iterates through each character, using Character class methods to classify them.
 * Digits (0-9) and letters (a-z, A-Z) are counted separately.
 * All other characters including spaces, punctuation, and symbols are ignored.
 * Returns "digits" if more digits, "letters" if more letters, or "tie" if
 * equal.
 */