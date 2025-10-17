import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDiff {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new String[]{"apple", "banana"}, new String[]{"apple", "banana", "cherry"})));
        System.out.println(Arrays.toString(arrayDiff(new String[]{"apple", "banana", "cherry"}, new String[]{"apple", "banana"})));
        System.out.println(Arrays.toString(arrayDiff(new String[]{"one", "two", "three", "four", "six"}, new String[]{"one", "three", "eight"})));
        System.out.println(Arrays.toString(arrayDiff(new String[]{"two", "four", "five", "eight"}, new String[]{"one", "two", "three", "four", "seven", "eight"})));
        System.out.println(Arrays.toString(arrayDiff(new String[]{"I", "like", "freeCodeCamp"}, new String[]{"I", "like", "rocks"})));
    }

    // Returns elements that appear in only one array (symmetric difference)
    private static String[] arrayDiff(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        Set<String> result = new TreeSet<>(); // TreeSet for automatic sorting

        // Add elements only in array1
        for (String item : set1) {
            if (!set2.contains(item)) {
                result.add(item);
            }
        }

        // Add elements only in array2
        for (String item : set2) {
            if (!set1.contains(item)) {
                result.add(item);
            }
        }

        return result.toArray(new String[0]);
    }
}

/*
 * This program finds the symmetric difference between two string arrays.
 * It returns elements that appear in exactly one array but not both.
 * The program converts both arrays to HashSets for O(1) lookup operations.
 * It then iterates through each set, adding items not present in the other set.
 * Results are stored in a TreeSet which automatically maintains alphabetical order.
 * Returns a sorted array of unique elements from either array but not both.
 */