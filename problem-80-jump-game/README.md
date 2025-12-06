# Jump Game

## Problem Description

Given an array of non-negative integers where each element represents the maximum jump length from that position, determine if you can reach the last index starting from the first index.

## Rules

* Each element represents the maximum jump length from that position
* A person can only jump forward
* You start at index 0
* You need to reach the last index

## Examples

```
Input: nums = [2, 3, 1, 1, 4]
Explanation:
  Index 0 (value: 2) → Jump 1 step to index 1
  Index 1 (value: 3) → Jump 3 steps to index 4 (last)
Output: true

Input: nums = [3, 2, 1, 0, 4]
Explanation:
  Index 0 → Index 3
  Index 3 (value: 0) → Stuck, cannot reach index 4
Output: false
```

## Test Cases

| Sr. No. | Input                   | Expected Output |
| ------- | ----------------------- | --------------- |
| 1       | `[2, 3, 1, 1, 4]`       | `true`          |
| 2       | `[3, 2, 1, 0, 4]`       | `false`         |
| 3       | `[0]`                   | `true`          |
| 4       | `[1, 0, 1, 0]`          | `false`         |
| 5       | `[2, 0, 0]`             | `true`          |
| 6       | `[1, 1, 1, 0]`          | `true`          |
| 7       | `[0, 2, 3]`             | `false`         |
| 8       | `[4, 2, 1, 0, 3, 0, 5]` | `true`          |