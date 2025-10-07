import java.util.Arrays;

public class CaughtSpeeding {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(speeding(new int[] { 50, 60, 55 }, 60)));
        System.out.println(Arrays.toString(speeding(new int[] { 58, 50, 60, 55 }, 55)));
        System.out.println(Arrays.toString(speeding(new int[] { 61, 81, 74, 88, 65, 71, 68 }, 70)));
        System.out.println(Arrays.toString(speeding(new int[] { 100, 105, 95, 102 }, 100)));
        System.out.println(Arrays.toString(speeding(new int[] { 40, 45, 44, 50, 112, 39 }, 55)));
        System.out.println(Arrays.toString(speeding(new int[] { 70, 75, 80, 85, 90 }, 65)));
        System.out.println(Arrays.toString(speeding(new int[] { 45, 50, 55 }, 60)));
        System.out.println(Arrays.toString(speeding(new int[] { 120, 130, 140 }, 100)));
        System.out.println(Arrays.toString(speeding(new int[] { 100 }, 100)));
        System.out.println(Arrays.toString(speeding(new int[] { 101 }, 100)));
    }

    private static double[] speeding(int[] speeds, int limit) {
        // Initialize result array
        double[] result = new double[2];

        int speedingCount = 0;
        double totalExcessSpeed = 0;

        // Calculate speeding vehicles and total excess speed
        for (int speed : speeds) {
            if (speed > limit) {
                speedingCount++;
                totalExcessSpeed += (speed - limit);
            }
        }

        // Store count
        result[0] = speedingCount;

        // Calculate average excess speed
        if (speedingCount > 0) {
            result[1] = totalExcessSpeed / speedingCount;
        } else {
            result[1] = 0;
        }

        return result;
    }
}

/*
 * This program analyzes vehicle speeds and identifies speeding violations.
 * It takes an array of vehicle speeds and a speed limit, then calculates:
 * 1. The count of vehicles exceeding the speed limit
 * 2. The average amount by which speeding vehicles exceeded the limit
 * The program iterates through the speed array, identifies speeders, sums their excess speeds, and computes the average. 
 * If no vehicles are speeding, it returns [0, 0]. 
 * Results are returned as a double array and displayed using Arrays.toString() for proper formatting.
 */