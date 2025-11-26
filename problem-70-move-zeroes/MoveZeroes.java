import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums1 = { 0, 1, 0, 3, 12 };
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = { 0 };
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = { 1, 2, 3 };
        moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));

        int[] nums4 = { 0, 0, 1 };
        moveZeroes(nums4);
        System.out.println(Arrays.toString(nums4));

        int[] nums5 = { 2, 1 };
        moveZeroes(nums5);
        System.out.println(Arrays.toString(nums5));

        int[] nums6 = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
        moveZeroes(nums6);
        System.out.println(Arrays.toString(nums6));

        int[] nums7 = { 0, 0, 0, 1, 2, 3 };
        moveZeroes(nums7);
        System.out.println(Arrays.toString(nums7));
    }

    // Moves all zeros to the end while keeping non-zero numbers in order
    private static void moveZeroes(int[] nums) {

        int pos = 0; // position where next non-zero should be placed

        // first move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        // fill remaining positions with zeros
        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

/*
 * We scan the array and copy all non-zero numbers to the front one by one.
 * After placing all non-zero elements, the remaining spots are filled with zeros.
 * This keeps the order of all non-zero numbers and uses no extra array.
 * The whole process runs in O(n) time.
 */
