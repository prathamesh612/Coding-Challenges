# Maximum Ascending Subarray Sum

## Problem Description

Given an array of positive integers, find the maximum sum of a subarray where each element is strictly greater than the previous element (ascending order).

## Rules

* Array contains positive integers
* Find a contiguous subarray where each element is strictly greater than the previous
* Return the maximum sum of all such ascending subarrays
* A single element is considered an ascending subarray

## Examples

```
Input: nums = [10, 20, 30, 5, 10, 50]
Explanation:
  [10, 20, 30] → sum = 60 (ascending)
  [5, 10, 50] → sum = 65 (ascending)
  Maximum = 65
Output: 65

Input: nums = [12, 17, 15, 13, 10, 5, 1]
Explanation:
  [12, 17] → sum = 29 (ascending)
  [15] → sum = 15
  [13] → sum = 13
  [10] → sum = 10
  [5] → sum = 5
  [1] → sum = 1
  Maximum = 29
Output: 29
```

## Test Cases

| Sr. No. | Input                        | Expected Output |
| ------- | ---------------------------- | --------------- |
| 1       | `[10, 20, 30, 5, 10, 50]`    | `65`            |
| 2       | `[12, 17, 15, 13, 10, 5, 1]` | `29`            |
| 3       | `[1, 2, 3, 4, 5]`            | `15`            |
| 4       | `[5, 4, 3, 2, 1]`            | `5`             |
| 5       | `[1]`                        | `1`             |
| 6       | `[10, 20, 30, 40]`           | `100`           |
| 7       | `[1, 3, 2, 4, 5]`            | `11`            |
| 8       | `[2, 1, 4, 3, 5]`            | `8`             |