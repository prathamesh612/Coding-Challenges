import java.util.*;

class Activity {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    public static void main(String[] args) {
        System.out.println(maxActivities(new int[] { 1, 3, 0, 5, 8, 5 }, new int[] { 2, 4, 6, 7, 9, 9 }));
        System.out.println(maxActivities(new int[] { 1, 3, 2 }, new int[] { 2, 4, 3 }));
        System.out.println(maxActivities(new int[] { 10, 12, 20 }, new int[] { 20, 25, 30 }));
        System.out.println(maxActivities(new int[] { 1, 2, 3, 4 }, new int[] { 2, 3, 4, 5 }));
        System.out.println(maxActivities(new int[] { 0, 5, 1, 3 }, new int[] { 6, 7, 4, 5 }));
        System.out.println(maxActivities(new int[] { 1 }, new int[] { 2 }));
        System.out.println(maxActivities(new int[] { 1, 3, 5, 7, 9 }, new int[] { 3, 5, 7, 9, 11 }));
        System.out.println(maxActivities(new int[] { 1, 3, 2, 5 }, new int[] { 2, 4, 3, 6 }));
    }

    // Returns maximum number of non-overlapping activities
    public static int maxActivities(int[] start, int[] finish) {
        int n = start.length;

        // create list of activity objects
        List<Activity> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new Activity(start[i], finish[i]));
        }

        // sort activities by their finish time
        activities.sort(Comparator.comparingInt(a -> a.finish));

        // choose the first activity by default
        int count = 1;
        int lastFinish = activities.get(0).finish;

        // go through the remaining activities
        for (int i = 1; i < n; i++) {

            // if current activity starts after previous one finished, select it
            if (activities.get(i).start >= lastFinish) {
                count++;
                lastFinish = activities.get(i).finish;
            }
        }

        return count;
    }
}

/*
 * We first convert start[] and finish[] arrays into a list of Activity objects.
 * Then we sort all activities by their finish time because finishing earlier
 * leaves more room for upcoming tasks. After picking the first activity, we keep
 * adding new ones only if their start time is not conflicting with the last
 * chosen activity. This greedy approach guarantees the maximum number of
 * non-overlapping activities.
 */
