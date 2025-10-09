import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SecondBest1 {

    public static void main(String[] args) {
        getLaptopCost(new int[] { 1500, 2000, 1800, 1400 }, 1900);
        getLaptopCost(new int[] { 1500, 2000, 2000, 1800, 1400 }, 1900);
        getLaptopCost(new int[] { 2099, 1599, 1899, 1499 }, 2200);
        getLaptopCost(new int[] { 2099, 1599, 1899, 1499 }, 1000);
        getLaptopCost(new int[] { 1200, 1500, 1600, 1800, 1400, 2000 }, 1450);
    }

    private static void getLaptopCost(int[] laptops, int budget) {
        // Use TreeSet with reverse order to remove duplicates and sort descending
        Set<Integer> laptopsSet = new TreeSet<>(Collections.reverseOrder());
        
        for (int price : laptops) {
            laptopsSet.add(price);
        }
        
        // Convert to list for easy index access
        List<Integer> sortedPrices = new ArrayList<>(laptopsSet);
        
        int result = 0;
        
        // Check if we have at least 2 unique prices
        if (sortedPrices.size() >= 2) {
            // Get the second most expensive laptop
            int secondMostExpensive = sortedPrices.get(1);
            
            // If second most expensive is within budget, return it
            if (secondMostExpensive <= budget) {
                result = secondMostExpensive;
            } else {
                // Otherwise, find the most expensive within budget
                for (int price : sortedPrices) {
                    if (price <= budget) {
                        result = price;
                        break;
                    }
                }
            }
        } else if (sortedPrices.size() == 1) {
            // Only one unique price, check if it's within budget
            if (sortedPrices.get(0) <= budget) {
                result = sortedPrices.get(0);
            }
        }
        
        System.out.println(result);
    }
}

/*
 * This program finds the best laptop within budget using TreeSet for automatic sorting and duplicate removal.
 * TreeSet with Collections.reverseOrder() maintains prices in descending order automatically.
 * The approach:
 * 1. Add all prices to TreeSet (duplicates automatically removed, sorted descending)
 * 2. Convert to List for easy index access
 * 3. Check if second most expensive (index 1) is within budget - return it
 * 4. Otherwise, find and return the most expensive laptop within budget
 * 5. Return 0 if no laptops are affordable
 * This method prioritizes code readability and simplicity over performance.
 */