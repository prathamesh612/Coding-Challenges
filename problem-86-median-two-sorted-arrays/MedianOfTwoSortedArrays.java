public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
        System.out.println(findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
        System.out.println(findMedianSortedArrays(new int[] { 0, 0 }, new int[] { 0, 0 }));
        System.out.println(findMedianSortedArrays(new int[] {}, new int[] { 1 }));
        System.out.println(findMedianSortedArrays(new int[] { 2 }, new int[] {}));
        System.out.println(findMedianSortedArrays(new int[] { 1, 3, 4, 6 }, new int[] { 2 }));
        System.out.println(findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3 }));
        System.out.println(findMedianSortedArrays(new int[] { 1, 1, 1 }, new int[] { 1, 1, 1 }));
    }

    // finds median of two sorted arrays using binary search on smaller array
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // always binary-search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0, right = m;
        int totalLeft = (m + n + 1) / 2; // count of elements on the left side of partition

        while (left <= right) {

            int i = left + (right - left) / 2; // partition in nums1
            int j = totalLeft - i; // corresponding partition in nums2

            // values around the partition, using boundaries
            int nums1Left = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int nums1Right = (i == m ? Integer.MAX_VALUE : nums1[i]);

            int nums2Left = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int nums2Right = (j == n ? Integer.MAX_VALUE : nums2[j]);

            // correct partition: left side values <= right side values
            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {

                // odd length → median is max of left side
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                }

                // even length → average of middle values
                return (Math.max(nums1Left, nums2Left) +
                        Math.min(nums1Right, nums2Right)) / 2.0;
            }

            // binary search adjust: move partition left
            else if (nums1Left > nums2Right) {
                right = i - 1;
            }

            // move partition right
            else {
                left = i + 1;
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }
}

/*
 * We use binary search to find a partition point that splits both arrays such
 * that left side has half of the total elements and all left values are <= all
 * right values. Once the correct partition is found, the middle value(s) give
 * the median. This keeps the time complexity O(log(min(m, n))).
 */
