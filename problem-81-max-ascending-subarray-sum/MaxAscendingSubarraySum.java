public class MaxAscendingSubarraySum {

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[] { 10, 20, 30, 5, 10, 50 }));
        System.out.println(maxAscendingSum(new int[] { 12, 17, 15, 13, 10, 5, 1 }));
        System.out.println(maxAscendingSum(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(maxAscendingSum(new int[] { 5, 4, 3, 2, 1 }));
        System.out.println(maxAscendingSum(new int[] { 1 }));
        System.out.println(maxAscendingSum(new int[] { 10, 20, 30, 40 }));
        System.out.println(maxAscendingSum(new int[] { 1, 3, 2, 4, 5 }));
        System.out.println(maxAscendingSum(new int[] { 2, 1, 4, 3, 5 }));
    }

    // returns the maximum sum of a strictly ascending subarray
    private static int maxAscendingSum(int[] nums) {

        int maxSum = nums[0]; // stores the best (maximum) sum found so far
        int sum = nums[0]; // current running sum of the ascending sequence

        for (int i = 1; i < nums.length; i++) {

            // continue the ascending sequence if current number is greater than previous
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                // sequence broke, so update maximum and start a new sequence
                maxSum = Math.max(maxSum, sum);
                sum = nums[i];
            }
        }

        // final comparison because last sequence may be the maximum
        return Math.max(maxSum, sum);
    }
}

/*
 * We go through the array one number at a time and keep building a running sum
 * as long as the numbers keep increasing. The moment the sequence breaks,
 * we compare the current sum with the maximum found so far and reset the sum
 * starting from the current number. In the end, we check once more because the
 * final ascending segment might be the longest one. The largest sum encountered
 * during this process is the answer.
 */