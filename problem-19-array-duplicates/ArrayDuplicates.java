import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDuplicates {

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(findDuplicates(new int[] { 1, 2, 3, 4, 1, 2 }));
        System.out.println(findDuplicates(new int[] { 2, 34, 0, 1, -6, 23, 5, 3, 2, 5, 67, -6, 23, 2, 43, 2, 12, 0, 2, 4, 4 }));
    }

    // Find all duplicate numbers and return them sorted
    private static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new TreeSet<>();  // TreeSet for auto-sorting

        for (int num : arr) {
            if (!seen.add(num)) {  // add() returns false if already exists
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}