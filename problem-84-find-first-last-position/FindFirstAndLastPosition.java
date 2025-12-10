public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 1 }, 1)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 1, 2, 3 }, 2)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 1, 1, 1, 1 }, 1)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 2, 2 }, 2)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 1, 3, 5, 7 }, 5)));
        System.out.println(java.util.Arrays.toString(searchRange(new int[] { 1, 2, 2, 2, 3, 4, 5 }, 2)));
    }

    // returns first and last position of target in sorted array
    private static int[] searchRange(int[] nums, int target) {
        return new int[] {
                findBound(nums, target, true), // find first index of target
                findBound(nums, target, false) // find last index of target
        };
    }

    // binary search to find either first or last occurrence
    private static int findBound(int[] nums, int target, boolean findFirst) {

        int start = 0;
        int end = nums.length - 1;
        int result = -1; // default when target does not exist

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // we found the target
                result = mid;

                // if searching for first, move left
                if (findFirst) {
                    end = mid - 1;
                }
                // if searching for last, move right
                else {
                    start = mid + 1;
                }
            }
        }

        return result;
    }

}

/*
 * We use binary search twice: once to locate the first time the target appears,
 * and again to locate the last time it appears. When we find the target, we don’t
 * stop immediately. Instead, we keep exploring either left or right side to make
 * sure we capture the boundary. This keeps the time complexity O(log n), even
 * though we perform two searches.
 */
