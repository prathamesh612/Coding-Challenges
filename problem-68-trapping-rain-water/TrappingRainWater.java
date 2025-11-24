public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        System.out.println(trap(new int[] { 4, 2, 0, 3, 2, 5 }));
        System.out.println(trap(new int[] { 3, 0, 2, 0, 4 }));
        System.out.println(trap(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(trap(new int[] { 5, 4, 3, 2, 1 }));
        System.out.println(trap(new int[] { 3, 0, 0, 2, 0, 4 }));
        System.out.println(trap(new int[] { 2, 1, 2 }));
    }

    // Calculates total trapped water using left max and right max arrays
    private static int trap(int[] height) {

        int len = height.length;

        // leftMax[i] means the highest bar from the left side up to that index
        int[] leftMax = new int[len];
        leftMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // rightMax[i] means the highest bar from the right side up to that index
        int[] rightMax = new int[len];
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // water at each index depends on the smaller wall between left and right
        int trappedWater = 0;
        for (int i = 0; i < len; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}

/*
 * For every index we check how much water can stay on top of it.
 * The amount of water depends on the tallest bar on the left and the tallest bar on the right.
 * We take the smaller one of the two sides because that decides the water level.
 * Then we subtract the current height to get how much water fits there.
 * This method runs in O(n) time since we scan the array a few times.
 */
