# Search in Rotated Sorted Array

## Problem Description

You are given a sorted array that has been rotated at some unknown pivot. Given a target value, find the index of the target in the array. If the target is not found, return -1.

## Rules

* The array was originally sorted in ascending order
* The array has been rotated at some pivot
* All elements in the array are unique
* You must use O(log n) time complexity

## Examples

```
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
Explanation:
  Original: [0, 1, 2, 4, 5, 6, 7]
  Rotated at index 4: [4, 5, 6, 7, 0, 1, 2]
  Target 0 is at index 4
Output: 4

Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
Explanation:
  Target 3 is not in the array
Output: -1
```

## Test Cases

| Sr. No. | Array                   | Target | Expected Output |
| ------- | ----------------------- | ------ | --------------- |
| 1       | `[4, 5, 6, 7, 0, 1, 2]` | `0`    | `4`             |
| 2       | `[4, 5, 6, 7, 0, 1, 2]` | `3`    | `-1`            |
| 3       | `[1]`                   | `1`    | `0`             |
| 4       | `[1, 3]`                | `3`    | `1`             |
| 5       | `[3, 1]`                | `3`    | `0`             |
| 6       | `[1, 2, 3, 4, 5, 6, 7]` | `5`    | `4`             |
| 7       | `[7, 1, 2, 3, 4, 5, 6]` | `1`    | `1`             |
| 8       | `[3, 4, 5, 6, 1, 2]`    | `6`    | `3`             |