# Find First and Last Position of Element in Sorted Array

## Problem Description

Given a sorted array of integers and a target value, find the first and last position (indices) of the target in the array. If the target is not found, return [-1, -1].

## Rules

* The array is sorted in ascending order
* You must use O(log n) time complexity
* Return the first and last indices where target appears
* If target is not found, return [-1, -1]

## Examples

```
Input: nums = [5, 7, 7, 8, 8, 10], target = 8
Explanation:
  First occurrence of 8 is at index 3
  Last occurrence of 8 is at index 4
Output: [3, 4]

Input: nums = [5, 7, 7, 8, 8, 10], target = 6
Explanation:
  Target 6 is not in the array
Output: [-1, -1]
```

## Test Cases

| Sr. No. | Array                   | Target | Expected Output |
| ------- | ----------------------- | ------ | --------------- |
| 1       | `[5, 7, 7, 8, 8, 10]`   | `8`    | `[3, 4]`        |
| 2       | `[5, 7, 7, 8, 8, 10]`   | `6`    | `[-1, -1]`      |
| 3       | `[1]`                   | `1`    | `[0, 0]`        |
| 4       | `[1, 2, 3]`             | `2`    | `[1, 1]`        |
| 5       | `[1, 1, 1, 1]`          | `1`    | `[0, 3]`        |
| 6       | `[2, 2]`                | `2`    | `[0, 1]`        |
| 7       | `[1, 3, 5, 7]`          | `5`    | `[2, 2]`        |
| 8       | `[1, 2, 2, 2, 3, 4, 5]` | `2`    | `[1, 3]`        |