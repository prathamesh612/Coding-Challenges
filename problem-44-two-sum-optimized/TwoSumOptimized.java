import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 1, 5, 3, 7, 9 }, 10)));
        System.out.println(Arrays.toString(twoSum(new int[] { 10, 20, 30, 40, 50 }, 90)));
        System.out.println(Arrays.toString(twoSum(new int[] { -1, -2, -3, -4, -5 }, -8)));
        System.out.println(Arrays.toString(twoSum(new int[] { 0, 4, 3, 0 }, 0)));
    }

    // Returns indices of two numbers that add up to the given target
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse each number and check if its complement exists
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement found, return both indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the number and its index
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 }; // if no valid pair found
    }
}

/*
 * This method finds two indices in an array whose values add up to a target.
 * It uses a HashMap to store numbers and their indices for quick lookup.
 * When the complement (target - current number) is found in the map,
 * both indices are returned immediately.
 *
 * Used: HashMap for constant-time lookup and single-pass iteration for efficiency.
 */