public class GasStation {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));
        System.out.println(canCompleteCircuit(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 }));
        System.out.println(canCompleteCircuit(new int[] { 5, 1, 2, 3, 4 }, new int[] { 4, 4, 1, 5, 1 }));
        System.out.println(canCompleteCircuit(new int[] { 3, 3, 4 }, new int[] { 3, 4, 4 }));
        System.out.println(canCompleteCircuit(new int[] { 5, 8, 2, 8 }, new int[] { 6, 5, 6, 6 }));
        System.out.println(canCompleteCircuit(new int[] { 1 }, new int[] { 1 }));
    }

    // Returns starting index from where we can complete the circuit
    private static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0, totalCost = 0;

        // calculate total gas and total cost
        for (int g : gas)
            totalGas += g;
        for (int c : cost)
            totalCost += c;

        // if total gas is less, journey is impossible
        if (totalGas < totalCost)
            return -1;

        int currentGas = 0;
        int startIndex = 0;

        // try each station as potential start
        for (int i = 0; i < gas.length; i++) {

            currentGas += gas[i] - cost[i];

            // if fuel drops below zero, restart from next station
            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }

        return startIndex;
    }
}

/*
 * We first check if completing the circuit is even possible by comparing total gas
 * with the total travel cost. If total gas is enough, we scan from left to right,
 * adding gas[i] - cost[i]. Whenever this balance turns negative we cannot start
 * from the current segment, so we reset the starting index to the next station.
 * By the end, the saved index is the only valid starting point.
 */
