import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        System.out.println(subsets(new int[] { 1, 2, 3 }));
        System.out.println(subsets(new int[] { 0 }));
        System.out.println(subsets(new int[] { 1, 2 }));
        System.out.println(subsets(new int[] { 5, 10, 15 }));
        System.out.println(subsets(new int[] {}));
        System.out.println(subsets(new int[] { 1, 2, 3, 4 }));
    }

    // Generates all possible subsets using backtracking
    private static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        generate(0, nums, current, result);
        return result;
    }

    private static void generate(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {

        // add current subset to the final list
        result.add(new ArrayList<>(current));

        // try including each remaining element one by one
        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]); // choose
            generate(i + 1, nums, current, result); // explore
            current.remove(current.size() - 1); // undo choice
        }
    }
}

/*
 * We build subsets using backtracking. At every position we have a simple choice:
 * either pick the number or skip it. Each time we add the current list into the
 * result since every stage represents one valid subset. In total it creates 2^n
 * subsets because each element has two options: take it or leave it.
 */
