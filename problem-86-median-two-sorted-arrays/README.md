# Median of Two Sorted Arrays

## Problem Description

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays. You must use O(log(min(m, n))) time complexity.

## Rules

* Both arrays are sorted in ascending order
* Arrays can be of different sizes
* If total elements is odd, median is the middle element
* If total elements is even, median is the average of two middle elements
* Must achieve O(log(min(m, n))) time complexity

## Examples

```
Input: nums1 = [1, 3], nums2 = [2]
Explanation:
  Merged: [1, 2, 3]
  Median = 2.0
Output: 2.0

Input: nums1 = [1, 2], nums2 = [3, 4]
Explanation:
  Merged: [1, 2, 3, 4]
  Median = (2 + 3) / 2 = 2.5
Output: 2.5
```

## Test Cases

| Sr. No. | nums1          | nums2       | Expected Output |
| ------- | -------------- | ----------- | --------------- |
| 1       | `[1, 3]`       | `[2]`       | `2.0`           |
| 2       | `[1, 2]`       | `[3, 4]`    | `2.5`           |
| 3       | `[0, 0]`       | `[0, 0]`    | `0.0`           |
| 4       | `[]`           | `[1]`       | `1.0`           |
| 5       | `[2]`          | `[]`        | `2.0`           |
| 6       | `[1, 3, 4, 6]` | `[2]`       | `3.0`           |
| 7       | `[1, 2]`       | `[3]`       | `2.0`           |
| 8       | `[1, 1, 1]`    | `[1, 1, 1]` | `1.0`           |