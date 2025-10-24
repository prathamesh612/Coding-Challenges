public class BattleOfWords {

    public static void main(String[] args) {
        System.out.println(battle("hello world", "hello word"));
        System.out.println(battle("Hello world", "hello world"));
        System.out.println(battle("lorem ipsum", "kitty ipsum"));
        System.out.println(battle("hello world", "world hello"));
        System.out.println(battle("git checkout", "git switch"));
        System.out.println(battle("Cheeseburger with fries", "Cheeseburger with Fries"));
        System.out.println(battle("We must never surrender", "Our team must win"));
    }

    // Compares two sentences and determines which team wins the battle of words.
    private static String battle(String ourTeam, String opponent) {

        // Keep track of how many words each team wins
        int ourTeamScore = 0;
        int opponentScore = 0;

        // Split both sentences into individual words
        String[] ourTeamWords = ourTeam.split(" ");
        String[] opponentWords = opponent.split(" ");

        // Compare each word from our team with the corresponding word from the opponent
        if (ourTeamWords.length == opponentWords.length) {
            for (int i = 0; i < ourTeamWords.length; i++) {
                int ourTeamWordPoint = getPoints(ourTeamWords[i]);
                int opponentWordPoint = getPoints(opponentWords[i]);

                // Add one point to the team that has a higher word value
                if (ourTeamWordPoint > opponentWordPoint) {
                    ourTeamScore++;
                } else if (ourTeamWordPoint < opponentWordPoint) {
                    opponentScore++;
                }
            }
        }

        // Decide the final outcome based on total wins
        if (ourTeamScore > opponentScore) {
            return "We win";
        } else if (ourTeamScore < opponentScore) {
            return "We lose";
        } else {
            return "Draw";
        }
    }

    // Calculates the total value of a given word based on letter values.
    public static int getPoints(String word) {

        char[] ch = word.toCharArray();
        int wordPoints = 0;

        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                // Uppercase letters count double their lowercase value
                wordPoints += ((int) c - 65 + 1) * 2;
            } else if (Character.isLowerCase(c)) {
                // Lowercase letters have values from 1 to 26
                wordPoints += (int) c - 97 + 1;
            }
        }

        return wordPoints;
    }
}

/*
 * This program compares two sentences word by word to determine which team wins.
 * Each letter contributes a value based on its position in the alphabet.
 * Uppercase letters count as double, which gives them more weight in scoring.
 * The comparison is straightforward: words are split, values are calculated, and
 * each pair of words is compared in order. The team with more winning words is
 * declared the winner. This approach is simple, efficient, and easy to understand.
 */