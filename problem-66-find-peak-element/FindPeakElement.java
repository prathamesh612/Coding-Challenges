public class FindPeakElement {

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[] { 1, 2, 3, 1 }));
        System.out.println(findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
        System.out.println(findPeakElement(new int[] { 1 }));
        System.out.println(findPeakElement(new int[] { 1, 2 }));
        System.out.println(findPeakElement(new int[] { 2, 1 }));
        System.out.println(findPeakElement(new int[] { 1, 3, 2, 1 }));
        System.out.println(findPeakElement(new int[] { 1, 2, 3, 4, 5 }));
    }

    // Finds index of any peak element using binary search
    private static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // If mid is greater than next element, peak lies in left half (including mid)
                right = mid;
            } else {
                // Otherwise, peak lies in the right half
                left = mid + 1;
            }
        }

        return left; // both left and right will point to the peak
    }

}

/*
 * This algorithm uses binary search to efficiently find a peak element.
 * A peak is an element that is greater than its neighbors.
 * Instead of checking all elements, we compare mid with mid+1:
 * - If nums[mid] > nums[mid+1], we move left because a peak exists on the left side.
 * - Otherwise, we move right since a peak must be on the right side.
 * We keep shrinking the search range until left == right.
 * That index is guaranteed to be a peak.
 * Time complexity is O(log n), making it faster than a linear scan.
 */
