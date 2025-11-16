public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[] { 1, 2, 3, 1 }));
        System.out.println(rob(new int[] { 2, 7, 9, 3, 1 }));
        System.out.println(rob(new int[] { 5, 3, 4, 11, 2 }));
        System.out.println(rob(new int[] { 1, 2 }));
        System.out.println(rob(new int[] { 2, 1, 1, 2 }));
        System.out.println(rob(new int[] { 10 }));
        System.out.println(rob(new int[] { 10, 1, 1, 10 }));
    }

    private static int rob(int[] nums) {
        int len = nums.length;

        if (len == 0)
            return 0;

        if (len == 1)
            return nums[0];

        // prev2 = best we can do up to house i-2
        int prev2 = nums[0];

        // prev1 = best up to house i-1
        int prev1 = Math.max(nums[0], nums[1]);

        int curr = prev1;

        // Iterate through remaining houses
        for (int i = 2; i < len; i++) {

            // Option 1: rob current house -> nums[i] + prev2
            // Option 2: skip it -> prev1
            curr = Math.max(nums[i] + prev2, prev1);

            // shift window forward
            prev2 = prev1;
            prev1 = curr;
        }

        return curr; // final result
    }
}

/*
 * This program solves the House Robber problem using O(n) time and O(1) space.
 *
 * Since you cannot rob two adjacent houses, each house has two choices:
 * - Rob this house -> add its value to best till i-2
 * - Skip this house -> keep best till i-1
 *
 * We keep only two variables (prev1, prev2) instead of a full DP array,
 * making it memory-efficient. The final value in 'curr' is the maximum
 * amount that can be stolen without triggering alarms.
 */
