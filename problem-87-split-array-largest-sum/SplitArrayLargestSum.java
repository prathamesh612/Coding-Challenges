public class SplitArrayLargestSum {

    public static void main(String[] args) {
        System.out.println(splitArray(new int[] { 1, 2, 3, 4, 5 }, 2));
        System.out.println(splitArray(new int[] { 1, 4, 4 }, 3));
        System.out.println(splitArray(new int[] { 1, 2, 3, 4, 5 }, 1));
        System.out.println(splitArray(new int[] { 1, 2, 3, 4, 5 }, 5));
        System.out.println(splitArray(new int[] { 4, 3, 4, 5 }, 2));
        System.out.println(splitArray(new int[] { 10 }, 1));
        System.out.println(splitArray(new int[] { 1, 1, 1, 1 }, 2));
        System.out.println(splitArray(new int[] { 7, 2, 5, 10, 8 }, 2));
    }

    // returns minimum possible largest subarray sum after splitting into k parts
    private static int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        // low is max element, high is sum of all elements
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int answer = high;

        // binary search on possible largest subarray sum
        while (low <= high) {

            int mid = low + (high - low) / 2;

            // check if we can split with max subarray sum = mid
            if (canSplit(nums, k, mid)) {
                answer = mid; // try smaller maximum
                high = mid - 1;
            } else {
                low = mid + 1; // need larger maximum
            }
        }

        return answer;
    }

    // checks if array can be split into at most k subarrays
    // such that no subarray sum exceeds maxSum
    private static boolean canSplit(int[] nums, int k, int maxSum) {

        int splits = 1; // at least one subarray
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num <= maxSum) {
                currentSum += num; // keep adding to current subarray
            } else {
                splits++; // start new subarray
                currentSum = num;
            }
        }

        return splits <= k;
    }
}

/*
 * We search for the minimum possible value of the largest subarray sum.
 * The smallest value it can take is the maximum element in the array,
 * and the largest value is the total sum of the array.
 *
 * Using binary search, we guess a maximum allowed subarray sum and check
 * if we can split the array into at most k subarrays without exceeding it.
 * If it is possible, we try a smaller value; otherwise, we increase it.
 *
 * This approach runs in O(n log(sum)) time.
 */