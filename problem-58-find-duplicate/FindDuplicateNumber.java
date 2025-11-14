public class FindDuplicateNumber {

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
        System.out.println(findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
        System.out.println(findDuplicate(new int[] { 1, 1 }));
        System.out.println(findDuplicate(new int[] { 1, 1, 2 }));
        System.out.println(findDuplicate(new int[] { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1, 4 }));
        System.out.println(findDuplicate(new int[] { 4, 3, 1, 4, 2 }));
        System.out.println(findDuplicate(new int[] { 1, 4, 4, 2, 3 }));
    }

    private static int findDuplicate(int[] nums) {

        int slow = nums[0]; // slow pointer starts at first element
        int fast = nums[0]; // fast pointer also starts at first element

        // First phase: find intersection point inside the "cycle"
        do {
            slow = nums[slow]; // slow moves 1 step
            fast = nums[nums[fast]]; // fast moves 2 steps
        } while (slow != fast); // loop until both pointers meet

        // Second phase: move slow to start and advance both by 1
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow]; // move slow 1 step
            fast = nums[fast]; // move fast 1 step
        }

        return slow; // This is the duplicate number
    }
}

/*
 * This program finds the duplicate number using Floyd’s Cycle Detection
 * algorithm.
 * The key idea is: treating array values as "next pointers" creates a cycle.
 * The duplicate number is the entry point of that cycle.
 *
 * Step 1: Move slow (1 step) and fast (2 steps) until they meet.
 * Step 2: Move slow to start, then move both 1 step at a time.
 * Step 3: The point where they meet again is the duplicate.
 */