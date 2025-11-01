import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } })));
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 4 }, { 4, 5 } })));
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 4 }, { 0, 4 } })));
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 4 }, { 2, 3 } })));
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 3 }, { 2, 4 }, { 5, 7 }, { 6, 8 } })));
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 10 }, { 2, 6 }, { 8, 9 } })));
        System.out.println(Arrays.deepToString(merge(new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } })));
    }

    // Merges overlapping intervals and returns non-overlapping intervals
    private static int[][] merge(int[][] intervals) {
        // Handle empty array edge case
        if (intervals.length == 0) {
            return new int[0][];
        }

        // Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        // Iterate through sorted intervals
        for (int i = 1; i < intervals.length; i++) {
            // Check if current interval overlaps with next
            if (intervals[i][0] <= current[1]) {
                // Overlapping → extend current interval's end
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → save current and move to next
                merged.add(current);
                current = intervals[i];
            }
        }

        // Don't forget to add the last interval
        merged.add(current);

        // Convert list to 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}

/*
 * This program merges overlapping intervals from a collection of time ranges.
 * First sorts all intervals by their start time for efficient processing.
 * Iterates through sorted intervals, checking if each overlaps with the current interval.
 * Two intervals overlap if the next start time is less than or equal to current end time.
 * When overlapping, extends the current interval by taking the maximum end time.
 * When not overlapping, saves the current interval and starts a new one.
 * Returns an array of non-overlapping merged intervals in sorted order.
 */