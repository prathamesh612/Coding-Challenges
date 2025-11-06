import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[] { 1 }, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[] { 4, 4, 4, 2, 2, 5 }, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[] { 1, 2, 3, 4, 5 }, 3)));
        System.out.println(Arrays.toString(topKFrequent(new int[] { 5, 5, 5, 3, 3, 1 }, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[] { 7, 7, 7, 7, 1, 1, 1, 2, 2, 3 }, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[] { -1, -1, -1, 2, 2, 3 }, 2)));
    }

    // Returns k most frequent elements from array
    private static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort entries by frequency (descending order)
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Extract top k keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}

/*
 * This program finds the k most frequent elements in an array.
 * First builds a frequency map counting occurrences of each number.
 * Then converts map entries to a list and sorts by frequency in descending order.
 * Finally extracts the keys (numbers) of the top k entries.
 * Time complexity: O(n log n) due to sorting.
 * Space complexity: O(n) for the HashMap and list.
 */