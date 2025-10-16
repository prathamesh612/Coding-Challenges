import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println(allUnique("abc"));
        System.out.println(allUnique("aA"));
        System.out.println(allUnique("QwErTy123!@"));
        System.out.println(allUnique("~!@#$%^&*()_+"));
        System.out.println(allUnique("hello"));
        System.out.println(allUnique("freeCodeCamp"));
        System.out.println(allUnique("!@#*$%^&*()aA"));
    }

    // Checks if all characters in string are unique (case-sensitive)
    private static boolean allUnique(String input) {
        Set<Character> seenChars = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seenChars.add(ch)) {
                return false; // Duplicate found
            }
        }

        return true; // All characters are unique
    }
}

/*
 * This program checks if all characters in a string are unique.
 * It uses a HashSet to track characters seen so far with O(1) lookup time.
 * The add() method returns false if the character already exists in the set.
 * When a duplicate is found, the function immediately returns false.
 * If the loop completes without finding duplicates, all characters are unique.
 * Uppercase and lowercase letters are treated as different characters.
 */