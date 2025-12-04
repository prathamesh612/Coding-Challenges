# Gas Station

### Question:
There are `n` gas stations along a circular route, where the amount of gas at the `i`th station is `gas[i]`.

You have a car with an **unlimited gas tank** and it costs `cost[i]` of gas to travel from the `i`th station to its next `(i + 1)`th station. You begin the journey with an **empty tank** at one of the gas stations.

Given two integer arrays `gas` and `cost`, return the **starting gas station's index** if you can travel around the circuit once in the clockwise direction, otherwise return `-1`. If there exists a solution, it is **guaranteed to be unique**.

### Rules:
- Start at one gas station with an **empty tank**
- Can only travel **clockwise** (circular route)
- At station `i`, you gain `gas[i]` and need `cost[i]` to reach station `i+1`
- Must complete the **full circle** to return to starting station
- Return the **starting station index**, or `-1` if impossible

### Examples:
```
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Starting at station 3:
  - gas = 4, cost to next = 1, remaining = 3
  - gas = 3+5=8, cost to next = 2, remaining = 6
  - gas = 6+1=7, cost to next = 3, remaining = 4
  - gas = 4+2=6, cost to next = 4, remaining = 2
  - gas = 2+3=5, cost to next = 5, remaining = 0 ✅
Output: 3

Input: gas = [2,3,4], cost = [3,4,3]
Total gas = 9, total cost = 10
Impossible to complete circuit
Output: -1
```

### Test Cases:
| **Sr. No.** | **Function Call**                                                | **Expected Output** |
| ----------- | ---------------------------------------------------------------- | ------------------- |
| 1           | `canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})` | `3`                 |
| 2           | `canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3})`         | `-1`                |
| 3           | `canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1})` | `4`                 |
| 4           | `canCompleteCircuit(new int[]{3,3,4}, new int[]{3,4,4})`         | `-1`                |
| 5           | `canCompleteCircuit(new int[]{5,8,2,8}, new int[]{6,5,6,6})`     | `3`                 |
| 6           | `canCompleteCircuit(new int[]{1}, new int[]{1})`                 | `0`                 |