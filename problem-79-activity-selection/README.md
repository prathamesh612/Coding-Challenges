# Activity Selection

### Question:
Given `n` activities with their **start** and **finish** times, select the **maximum number** of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

### Rules:
- Each activity has a **start time** and **finish time**
- Activities **cannot overlap** (if one finishes at time `t`, next can start at time `t`)
- Maximize the **number of activities** performed
- A person can only do **one activity** at a time

### Examples:
```
Input: 
start  = [1, 3, 0, 5, 8, 5]
finish = [2, 4, 6, 7, 9, 9]

Activities sorted by finish time:
  A1: [1, 2]   ✅ Select
  A2: [3, 4]   ✅ Select (starts after A1 finishes)
  A3: [0, 6]   ❌ Overlaps with A2
  A4: [5, 7]   ✅ Select (starts after A2 finishes)
  A5: [8, 9]   ✅ Select (starts after A4 finishes)
  A6: [5, 9]   ❌ Overlaps with A4

Maximum activities: 4
Output: 4

Input:
start  = [1, 3, 2]
finish = [2, 4, 3]

Activities: A1[1,2], A2[3,4], A3[2,3]
Select A1[1,2] and A2[3,4]
Output: 2
```

### Test Cases:
| **Sr. No.** | **Start Times**      | **Finish Times**     | **Expected Output** |
| ----------- | -------------------- | -------------------- | ------------------- |
| 1           | `[1, 3, 0, 5, 8, 5]` | `[2, 4, 6, 7, 9, 9]` | `4`                 |
| 2           | `[1, 3, 2]`          | `[2, 4, 3]`          | `3`                 |
| 3           | `[10, 12, 20]`       | `[20, 25, 30]`       | `2`                 |
| 4           | `[1, 2, 3, 4]`       | `[2, 3, 4, 5]`       | `4`                 |
| 5           | `[0, 5, 1, 3]`       | `[6, 7, 4, 5]`       | `2`                 |
| 6           | `[1]`                | `[2]`                | `1`                 |
| 7           | `[1, 3, 5, 7, 9]`    | `[3, 5, 7, 9, 11]`   | `5`                 |
| 8           | `[1, 3, 2, 5]`       | `[2, 4, 3, 6]`       | `4`                 |