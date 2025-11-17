import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println(threeSum(new int[] { 0, 1, 1 }));
        System.out.println(threeSum(new int[] { 0, 0, 0 }));
        System.out.println(threeSum(new int[] { -2, 0, 1, 1, 2 }));
        System.out.println(threeSum(new int[] { -1, 0, 1 }));
        System.out.println(threeSum(new int[] { 1, 2, -2, -1 }));
        System.out.println(threeSum(new int[] { -5, 2, -1, -2, 3, 1, 0 }));
    }

    // Returns all unique triplets that sum to zero
    private static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // sort for two-pointer logic

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            // classic two-pointer search for remaining two values
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    // skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++; // need a bigger sum
                } else {
                    right--; // need a smaller sum
                }
            }
        }

        return result;
    }
}

/*
 * This code finds all unique triplets that sum to zero.
 * After sorting, it fixes one number and uses a two-pointer approach
 * to find the other two. Duplicate values are skipped to avoid repeating triplets.
 */
