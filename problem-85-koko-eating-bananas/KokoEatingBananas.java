public class KokoEatingBananas {

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] { 1, 1, 1, 1 }, 4));
        System.out.println(minEatingSpeed(new int[] { 312884132, 968299470, 310146514 }, 968299470));
        System.out.println(minEatingSpeed(new int[] { 1, 10, 6, 2 }, 7));
        System.out.println(minEatingSpeed(new int[] { 312884132 }, 968299470));
        System.out.println(minEatingSpeed(new int[] { 4, 10, 19, 14, 13, 5, 2 }, 12));
        System.out.println(minEatingSpeed(new int[] { 30, 23, 20, 11, 50 }, 5));
        System.out.println(minEatingSpeed(new int[] { 1, 100, 50 }, 8));
    }

    // finds the minimum eating speed such that Koko finishes within h hours
    private static int minEatingSpeed(int[] piles, int h) {
        int left = 1; // lowest possible speed
        int right = getMax(piles); // highest possible speed

        while (left < right) {
            int mid = left + (right - left) / 2;

            // if she can finish at this speed, try a smaller one
            if (canFinish(piles, h, mid)) {
                right = mid;
            }
            // otherwise increase the speed
            else {
                left = mid + 1;
            }
        }

        return left;
    }

    // checks if Koko can finish all bananas within h hours using given speed
    private static boolean canFinish(int[] piles, int h, int speed) {
        long hours = 0;

        for (int pile : piles) {
            // each pile takes ceil(pile / speed) hours
            hours += (pile + speed - 1) / speed;
        }

        return hours <= h;
    }

    // returns the largest pile value
    private static int getMax(int[] piles) {
        int max = piles[0];
        for (int p : piles) {
            max = Math.max(max, p);
        }
        return max;
    }
}

/*
 * We apply binary search on the eating speed instead of on the piles.
 * The lowest speed is 1 and the highest possible speed is the size of
 * the biggest pile. For each speed we check if Koko can finish within
 * the allowed hours. If she can, we try a smaller speed; otherwise we
 * increase it. By narrowing the range this way we find the minimum
 * speed that still allows her to finish on time. Time complexity is
 * O(n log m), where m is the max pile size.
 */
