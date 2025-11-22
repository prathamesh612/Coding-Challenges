# Find Peak Element

### Question:
A **peak element** is an element that is **strictly greater** than its neighbors. Given a **0-indexed** integer array `nums`, find a peak element and return its **index**.

If the array contains multiple peaks, return the index of **any one** of them.

### Rules:
- `nums[i] != nums[i + 1]` for all valid `i` (no adjacent elements are equal)
- You may imagine that `nums[-1] = nums[n] = -∞` (elements outside array are negative infinity)
- A peak must be **strictly greater** than both neighbors
- Return the index of **any** peak element
- Algorithm should run in **O(log n)** time for optimal solution

### Examples:
```
Input: nums = [1, 2, 3, 1]
Index:         0  1  2  3

Peak at index 2: nums[2] = 3
  - nums[1] = 2 < 3 ✅
  - nums[3] = 1 < 3 ✅
Output: 2

Input: nums = [1, 2, 1, 3, 5, 6, 4]
Index:         0  1  2  3  4  5  6

Peaks at index 1 and 5:
  - nums[1] = 2 > nums[0]=1 and > nums[2]=1 ✅
  - nums[5] = 6 > nums[4]=5 and > nums[6]=4 ✅
Output: 1 or 5 (any peak is valid)
```

### Visualization:
```
nums = [1, 2, 3, 1]

       3 ← Peak
      /\
     2  1
    /
   1

Index 2 is the peak
```

```
nums = [1, 2, 1, 3, 5, 6, 4]

           6 ← Peak
          /\
   2     5  4
  /\    /
 1  1  3
     
Index 1 and 5 are peaks
```

### Test Cases:
| **Sr. No.** | **Function Call**                                 | **Expected Output** |
| ----------- | ------------------------------------------------- | ------------------- |
| 1           | `findPeakElement(new int[]{1, 2, 3, 1})`          | `2`                 |
| 2           | `findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4})` | `1` or `5`          |
| 3           | `findPeakElement(new int[]{1})`                   | `0`                 |
| 4           | `findPeakElement(new int[]{1, 2})`                | `1`                 |
| 5           | `findPeakElement(new int[]{2, 1})`                | `0`                 |
| 6           | `findPeakElement(new int[]{1, 3, 2, 1})`          | `1`                 |
| 7           | `findPeakElement(new int[]{1, 2, 3, 4, 5})`       | `4`                 |

> [!NOTE]
> Multiple valid outputs may exist. Any peak index is acceptable.