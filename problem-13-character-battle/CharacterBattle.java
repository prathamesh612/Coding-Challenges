/*
 * Character Battle Game
 * Simulates a battle between two armies where each character fights
 * the character at the same position in the opposing army.
*/
public class CharacterBattle {

    public static void main(String[] args) {
        battle("Hello", "World");
        battle("pizza", "salad");
        battle("C@T5", "D0G$");
        battle("kn!ght", "orc");
        battle("PC", "Mac");
        battle("Wizards", "Dragons");
        battle("Mr. Smith", "Dr. Jones");
    }

    private static void battle(String myArmy, String opposingArmy) {

        // Check if armies have different sizes
        if (myArmy.length() > opposingArmy.length()) {
            System.out.println("Opponent retreated");
            return;
        } else if (myArmy.length() < opposingArmy.length()) {
            System.out.println("We retreated");
            return;
        }

        // Initialize battle victory counters
        int myVictories = 0;
        int opponentVictories = 0;

        // Fight each battle position by position
        for (int position = 0; position < myArmy.length(); position++) {
            // Get strength values for both characters
            int myCharStrength = getCharacterStrength(myArmy.charAt(position));
            int opponentCharStrength = getCharacterStrength(opposingArmy.charAt(position));

            // Determine battle winner
            if (myCharStrength > opponentCharStrength) {
                myVictories++;
            } else if (myCharStrength < opponentCharStrength) {
                opponentVictories++;
            }
            // If equal strength, no one wins (tie for that battle)
        }

        // Determine overall war result
        if (myVictories > opponentVictories) {
            System.out.println("We won");
        } else if (myVictories < opponentVictories) {
            System.out.println("We lost");
        } else {
            System.out.println("It was a tie");
        }
    }

    /**
     * Calculates the strength value of a character based on the following rules:
     * - Lowercase letters (a-z): 1-26
     * - Uppercase letters (A-Z): 27-52
     * - Digits (0-9): 0-9
     * - Special characters: 0
     */
    private static int getCharacterStrength(char ch) {
        // Check for lowercase letters (a-z)
        if (Character.isLowerCase(ch)) {
            return ch - 'a' + 1;
        }
        // Check for uppercase letters (A-Z)
        else if (Character.isUpperCase(ch)) {
            return ch - 'A' + 27;
        }
        // Check for digits (0-9)
        else if (Character.isDigit(ch)) {
            return ch - '0';
        }
        // All other characters (special characters, spaces, etc.)
        else {
            return 0;
        }
    }
}