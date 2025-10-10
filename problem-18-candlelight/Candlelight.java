public class Candlelight {

    public static void main(String[] args) {
        System.out.print("Test 1: ");
        burnCandles(7, 2);

        System.out.print("Test 2: ");
        burnCandles(10, 5);

        System.out.print("Test 3: ");
        burnCandles(20, 3);

        System.out.print("Test 4: ");
        burnCandles(17, 4);

        System.out.print("Test 5: ");
        burnCandles(2345, 3);
    }

    /**
     * Calculates total candles burned including recycled ones
     * 
     * @param candles         Starting number of candles
     * @param leftoversNeeded Number of burned candles needed to make 1 new candle
     */
    private static void burnCandles(int candles, int leftoversNeeded) {
        int totalBurned = 0;
        int leftovers = 0;

        // Step 1: Burn all starting candles
        totalBurned += candles;
        leftovers = candles;

        // Step 2: Keep recycling leftovers into new candles
        while (leftovers >= leftoversNeeded) {
            // Calculate how many new candles we can make
            int newCandles = leftovers / leftoversNeeded;

            // Calculate remaining leftovers after making new candles
            leftovers = leftovers % leftoversNeeded;

            // Burn the new candles
            totalBurned += newCandles;

            // Add the burned candles to leftovers pool
            leftovers += newCandles;
        }

        System.out.println(totalBurned);
    }
}

/*
 * This program calculates the total number of candles burned including recycled
 * ones.
 * Starting with a given number of candles, it burns them all and recycles the
 * leftovers.
 * Each time enough leftovers accumulate, they are converted into new candles.
 * The process continues until there are not enough leftovers to make new
 * candles.
 * Returns the total count of all candles burned throughout the process.
 */