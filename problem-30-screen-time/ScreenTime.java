public class ScreenTime {

    // Constants for readability
    private static final int MAX_SINGLE_DAY_HOURS = 10;
    private static final double MAX_THREE_DAY_AVG = 8.0;
    private static final double MAX_WEEKLY_AVG = 6.0;
    private static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {
        System.out.println(tooMuchScreenTime(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
        System.out.println(tooMuchScreenTime(new int[] { 7, 8, 8, 4, 2, 2, 3 }));
        System.out.println(tooMuchScreenTime(new int[] { 5, 6, 6, 6, 6, 6, 6 }));
        System.out.println(tooMuchScreenTime(new int[] { 1, 2, 3, 11, 1, 3, 4 }));
        System.out.println(tooMuchScreenTime(new int[] { 1, 2, 3, 10, 2, 1, 0 }));
        System.out.println(tooMuchScreenTime(new int[] { 3, 3, 5, 8, 8, 9, 4 }));
        System.out.println(tooMuchScreenTime(new int[] { 3, 9, 4, 8, 5, 7, 6 }));
    }

    // Checks if weekly screen time exceeds healthy limits
    private static boolean tooMuchScreenTime(int[] hours) {
        int totalSum = 0;

        // For sliding window of 3 consecutive days
        int day1 = hours[0];
        int day2 = hours[1];

        for (int i = 0; i < hours.length; i++) {
            // Rule 1: Single day >= 10 hours
            if (hours[i] >= MAX_SINGLE_DAY_HOURS) {
                return true;
            }

            // Rule 2: Any 3 consecutive days average >= 8 hours
            if (i >= 2) {
                double threeDayAvg = (day1 + day2 + hours[i]) / 3.0;
                if (threeDayAvg >= MAX_THREE_DAY_AVG) {
                    return true;
                }

                // Slide the window
                day1 = day2;
                day2 = hours[i];
            }

            totalSum += hours[i];
        }

        // Rule 3: Weekly average >= 6 hours
        double weeklyAvg = totalSum / (double) DAYS_IN_WEEK;
        return weeklyAvg >= MAX_WEEKLY_AVG;
    }
}

/*
 * This program determines if weekly screen time is excessive based on health guidelines.
 * It checks three conditions: single day usage, rolling 3-day average, and weekly average.
 * Uses a sliding window technique to efficiently calculate 3-day averages in a single pass.
 * Returns true if any of the three health limits are exceeded.
 * Constants are defined for maintainability and clarity of health thresholds.
 */