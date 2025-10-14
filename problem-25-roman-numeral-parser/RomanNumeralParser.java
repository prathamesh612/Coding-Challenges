public class RomanNumeralParser {

    public static void main(String[] args) {
        System.out.println(parseRomanNumeral("III"));
        System.out.println(parseRomanNumeral("IV"));
        System.out.println(parseRomanNumeral("XXVI"));
        System.out.println(parseRomanNumeral("XCIX"));
        System.out.println(parseRomanNumeral("CDLX"));
        System.out.println(parseRomanNumeral("DIV"));
        System.out.println(parseRomanNumeral("MMXXV"));
    }

    // Parses a Roman numeral string and returns its integer value
    private static int parseRomanNumeral(String roman) {
        int total = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = getValue(roman.charAt(i));

            // Check if next symbol represents a larger value → subtraction case
            if (i + 1 < roman.length() && current < getValue(roman.charAt(i + 1))) {
                total -= current; // Subtract smaller value before a larger one
            } else {
                total += current; // Otherwise, add normally
            }
        }

        return total;
    }

    // Returns the integer value of a Roman numeral character
    private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

/*
 * This program converts a Roman numeral string into its integer equivalent.
 * It processes the numeral from left to right and adds or subtracts values
 * based on standard Roman numeral rules:
 * 
 * - If a smaller numeral appears before a larger one (like IV or IX),
 *   its value is subtracted.
 * - Otherwise, values are added directly.
 * 
 * Algorithm:
 *   For each character:
 *     - Compare its value with the next character.
 *     - If smaller, subtract; else, add.
 * 
 * This simple approach efficiently handles all valid Roman numerals
 * without using additional data structures.
 */
