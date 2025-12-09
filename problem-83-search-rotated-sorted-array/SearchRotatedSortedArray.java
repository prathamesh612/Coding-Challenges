public class SearchRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
        System.out.println(search(new int[] { 1 }, 1));
        System.out.println(search(new int[] { 1, 3 }, 3));
        System.out.println(search(new int[] { 3, 1 }, 3));
        System.out.println(search(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
        System.out.println(search(new int[] { 7, 1, 2, 3, 4, 5, 6 }, 1));
        System.out.println(search(new int[] { 3, 4, 5, 6, 1, 2 }, 6));
    }

    // returns index of target in rotated sorted array
    private static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // found the target
            if (nums[mid] == target)
                return mid;

            // left half is sorted
            if (nums[start] <= nums[mid]) {

                // check if target lies in sorted left side
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                // right half is sorted

                // check if target lies in sorted right side
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

/*
 * A rotated sorted array is still made of two individually sorted parts.
 * At every step we find the middle and decide which half is sorted. Once we
 * know which side is sorted, we check if the target lies inside that range.
 * If it does, we move into that half; otherwise we search the other half.
 * This keeps the search in O(log n) time, just like normal binary search.
 */
