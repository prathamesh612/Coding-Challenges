import java.util.Set;

public class AcronymBuilder {

    public static void main(String[] args) {
        System.out.println(buildAcronym("Search Engine Optimization"));
        System.out.println(buildAcronym("Frequently Asked Questions"));
        System.out.println(buildAcronym("National Aeronautics and Space Administration"));
        System.out.println(buildAcronym("Federal Bureau of Investigation"));
        System.out.println(buildAcronym("For your information"));
        System.out.println(buildAcronym("By the way"));
        System.out.println(buildAcronym("An unstoppable herd of waddling penguins overtakes the icy mountains and sings happily"));
    }

    // Builds acronym from phrase, skipping common words (except first word)
    private static String buildAcronym(String phrase) {
        Set<String> ignoreWords = Set.of("A", "FOR", "AN", "AND", "BY", "OF");
        String[] words = phrase.toUpperCase().split(" ");
        StringBuilder acronym = new StringBuilder();

        // Always include first word
        acronym.append(words[0].charAt(0));

        // Check remaining words
        for (int i = 1; i < words.length; i++) {
            if (!ignoreWords.contains(words[i])) {
                acronym.append(words[i].charAt(0));
            }
        }

        return acronym.toString();
    }
}

/*
 * This program builds acronyms from phrases by taking the first letter of each significant word.
 * Common words like "a", "for", "an", "and", "by", and "of" are ignored unless they appear first.
 * The input string is converted to uppercase and split into individual words.
 * The first word is always included in the acronym regardless of its value.
 * Subsequent words are checked against the ignore list before adding their first letter.
 * Returns a capitalized acronym string with no spaces.
 */