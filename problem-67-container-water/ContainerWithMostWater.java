public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        System.out.println(maxArea(new int[] { 1, 1 }));
        System.out.println(maxArea(new int[] { 4, 3, 2, 1, 4 }));
        System.out.println(maxArea(new int[] { 1, 2, 1 }));
        System.out.println(maxArea(new int[] { 2, 3, 4, 5, 18, 17, 6 }));
        System.out.println(maxArea(new int[] { 1, 3, 2, 5, 25, 24, 5 }));
        System.out.println(maxArea(new int[] { 1, 8, 100, 2, 100, 4, 8, 3, 7 }));
    }

    // Finds max water between two vertical lines using two-pointer approach
    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int curWater = Math.min(height[left], height[right]) * width;

            maxWater = Math.max(maxWater, curWater);

            // Move the pointer with smaller height to try finding a taller line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

/*
 * Two pointers start at both ends since maximum width is at the extremes.
 * At each step, compute area = min(height[left], height[right]) * width.
 * To possibly find a bigger area, move the pointer with the smaller height inward,
 * because moving the taller one won't increase height and width always decreases.
 * This ensures we explore only useful possibilities in O(n) time.
 */
