public class JumpGame {

    public static void main(String[] args) {
        System.out.println(canJump(new int[] { 2, 3, 1, 1, 4 }));
        System.out.println(canJump(new int[] { 3, 2, 1, 0, 4 }));
        System.out.println(canJump(new int[] { 0 }));
        System.out.println(canJump(new int[] { 1, 0, 1, 0 }));
        System.out.println(canJump(new int[] { 2, 0, 0 }));
        System.out.println(canJump(new int[] { 1, 1, 1, 0 }));
        System.out.println(canJump(new int[] { 0, 2, 3 }));
        System.out.println(canJump(new int[] { 4, 2, 1, 0, 3, 0, 5 }));
    }

    // returns true if we can reach the last index
    private static boolean canJump(int[] nums) {

        int reachable = 0; // keeps track of furthest reachable index

        for (int i = 0; i < nums.length; i++) {

            // if we reached an index we can't jump to, we fail
            if (i > reachable) {
                return false;
            }

            // update the maximum we can reach from here
            reachable = Math.max(reachable, i + nums[i]);

            // if we can already reach or cross last index, we succeed
            if (reachable >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}

/*
 * We walk through the array and keep track of the furthest position we can reach.
 * If at any point we land on an index that is beyond this reachable range, it means
 * we cannot move forward anymore and the answer is false. Otherwise, we update our
 * reach based on the jump length at each step. As soon as this reach touches or
 * crosses the last index, we know we can finish the game.
 */
