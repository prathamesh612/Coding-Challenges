import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = { 2, 0, 1 };
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = { 0 };
        sortColors(nums3);
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = { 1 };
        sortColors(nums4);
        System.out.println(Arrays.toString(nums4));

        int[] nums5 = { 2, 2, 2, 1, 1, 0 };
        sortColors(nums5);
        System.out.println(Arrays.toString(nums5));

        int[] nums6 = { 1, 2, 0 };
        sortColors(nums6);
        System.out.println(Arrays.toString(nums6));

        int[] nums7 = { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
        sortColors(nums7);
        System.out.println(Arrays.toString(nums7));
    }

    // Sorts array of 0s, 1s, and 2s using Dutch National Flag method
    private static void sortColors(int[] nums) {

        int low = 0; // position for next 0
        int mid = 0; // current element pointer
        int high = nums.length - 1; // position for next 2

        // keep processing until mid crosses high
        while (mid <= high) {

            // if element is 0 send it to left side
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            // if element is 1 already in correct area, just move ahead
            else if (nums[mid] == 1) {
                mid++;
            }
            // if element is 2 send it to right side
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

}

/*
 * We divide the array into three parts: 0s on the left, 1s in the middle,
 * and 2s on the right. We use three pointers: low, mid, high.
 * Whenever we see a 0 we send it to the left, when we see a 2 we send it to
 * the right, and 1 stays in the middle. This runs in one pass, so time is O(n).
 */
