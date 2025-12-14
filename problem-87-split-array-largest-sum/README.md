# Split Array Largest Sum

## Problem Description

Given an array `nums` and an integer `k`, split the array into `k` non-empty subarrays such that the largest sum of any subarray is minimized. Return the minimum largest sum among all possible splits.

## Rules

* You must split the array into exactly `k` subarrays
* Subarrays must be contiguous and in order
* Each subarray must have at least one element
* Find the split that minimizes the maximum sum
* You must use O(log n) time complexity

## Examples

```
Input: nums = [1, 2, 3, 4, 5], k = 2
Explanation:
  Split [1, 2, 3] | [4, 5] → max = 9
  Split [1, 2] | [3, 4, 5] → max = 12
  Split [1] | [2, 3, 4, 5] → max = 14
  Minimum largest sum = 9
Output: 9

Input: nums = [1, 4, 4], k = 3
Explanation:
  Split [1] | [4] | [4] → max = 4
Output: 4
```

## Test Cases

| Sr. No. | Array              | K   | Expected Output |
| ------- | ------------------ | --- | --------------- |
| 1       | `[1, 2, 3, 4, 5]`  | `2` | `9`             |
| 2       | `[1, 4, 4]`        | `3` | `4`             |
| 3       | `[1, 2, 3, 4, 5]`  | `1` | `15`            |
| 4       | `[1, 2, 3, 4, 5]`  | `5` | `5`             |
| 5       | `[4, 3, 4, 5]`     | `2` | `9`             |
| 6       | `[10]`             | `1` | `10`            |
| 7       | `[1, 1, 1, 1]`     | `2` | `2`             |
| 8       | `[7, 2, 5, 10, 8]` | `2` | `18`            |