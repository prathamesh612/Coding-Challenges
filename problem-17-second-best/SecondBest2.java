import java.util.Arrays;

public class SecondBest2 {

    public static void main(String[] args) {
        getLaptopCost(new int[] { 1500, 2000, 1800, 1400 }, 1900);
        getLaptopCost(new int[] { 1500, 2000, 2000, 1800, 1400 }, 1900);
        getLaptopCost(new int[] { 2099, 1599, 1899, 1499 }, 2200);
        getLaptopCost(new int[] { 2099, 1599, 1899, 1499 }, 1000);
        getLaptopCost(new int[] { 1200, 1500, 1600, 1800, 1400, 2000 }, 1450);
    }

    private static void getLaptopCost(int[] laptops, int budget) {
        // Sort array in ascending order
        Arrays.sort(laptops);
        System.out.println(Arrays.toString(laptops));
        
        // Find unique prices by iterating from highest to lowest
        int mostExpensive = -1;
        int secondMostExpensive = -1;
        
        // Iterate from end (highest prices) to find top 2 unique prices
        for (int i = laptops.length - 1; i >= 0; i--) {
            if (mostExpensive == -1) {
                // First unique price (most expensive)
                mostExpensive = laptops[i];
            } else if (laptops[i] != mostExpensive && secondMostExpensive == -1) {
                // Second unique price (second most expensive)
                secondMostExpensive = laptops[i];
                break; // We have top 2, no need to continue
            }
        }
        
        int result = 0;
        
        // Check if second most expensive is within budget
        if (secondMostExpensive != -1 && secondMostExpensive <= budget) {
            result = secondMostExpensive;
        } else {
            // Find the most expensive laptop within budget
            for (int i = laptops.length - 1; i >= 0; i--) {
                if (laptops[i] <= budget) {
                    result = laptops[i];
                    break;
                }
            }
        }
        
        System.out.println(result);
    }
}

/*
 * This program finds the best laptop within budget using Arrays.sort() for manual sorting and duplicate handling.
 * The array is sorted in ascending order, then iterated backwards to find unique prices.
 * The approach:
 * 1. Sort the array in ascending order using Arrays.sort()
 * 2. Iterate from end (highest prices) to manually identify top 2 unique prices
 * 3. Check if second most expensive is within budget - return it
 * 4. Otherwise, iterate backwards to find the most expensive laptop within budget
 * 5. Return 0 if no laptops are affordable
 * This method prioritizes memory efficiency and performance over code simplicity.
 */