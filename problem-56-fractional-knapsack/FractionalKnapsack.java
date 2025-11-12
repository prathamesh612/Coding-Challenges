import java.util.*;

class FractionalKnapsack {

    // Class to represent an item with weight, profit, and profit-to-weight ratio
    static class Item {
        int weight, profit;
        double ratio;

        Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = (double) profit / weight; // calculate ratio for sorting
        }
    }

    public static void main(String[] args) {
        System.out.println(fractionalKnapsack(new int[] { 10, 20, 30 }, new int[] { 60, 100, 120 }, 50));
        System.out.println(fractionalKnapsack(new int[] { 5, 10, 15 }, new int[] { 30, 40, 45 }, 20));
        System.out.println(fractionalKnapsack(new int[] { 2, 3, 5, 7 }, new int[] { 10, 5, 15, 7 }, 10));
        System.out.println(fractionalKnapsack(new int[] { 1, 2, 3 }, new int[] { 6, 10, 12 }, 5));
        System.out.println(fractionalKnapsack(new int[] { 4, 8, 12 }, new int[] { 24, 40, 60 }, 16));
        System.out.println(fractionalKnapsack(new int[] { 10, 20, 30 }, new int[] { 100, 60, 120 }, 50));
        System.out.println(fractionalKnapsack(new int[] { 7, 3, 9 }, new int[] { 42, 12, 40 }, 15));
    }

    // Finds max profit for given weights, profits, and capacity using Fractional Knapsack (Greedy)
    private static double fractionalKnapsack(int[] weights, int[] profits, int capacity) {
        int n = weights.length;
        List<Item> items = new ArrayList<>();

        // Create list of items with weight and profit
        for (int i = 0; i < n; i++)
            items.add(new Item(weights[i], profits[i]));

        // Sort items by profit-to-weight ratio in descending order
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0.0;

        // Pick items greedily until capacity is full
        for (Item item : items) {
            if (capacity >= item.weight) {
                totalProfit += item.profit; // take full item
                capacity -= item.weight;
            } else {
                totalProfit += item.ratio * capacity; // take fractional part
                break;
            }
        }

        // Round profit to 2 decimal places
        return Math.round(totalProfit * 100.0) / 100.0;
    }
}

/*
 * This program solves the Fractional Knapsack problem using a greedy approach.
 * Each item’s profit-to-weight ratio is calculated and sorted in descending order.
 * Then items are added to the knapsack starting with the highest ratio.
 * If the remaining capacity can't hold the full item, it takes the fractional part.
 *
 * Time Complexity: O(n log n) due to sorting.
 * Space Complexity: O(n) for storing items.
 */