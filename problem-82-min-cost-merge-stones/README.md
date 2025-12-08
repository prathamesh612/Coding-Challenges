# Minimum Cost to Merge Stones

## Problem Description

You have `n` piles of stones arranged in a row. In each move, you can merge exactly `k` consecutive piles into one pile with a cost equal to the sum of the stones in those `k` piles. Find the minimum cost to merge all piles into one pile, or return -1 if impossible.

## Rules

* You can only merge exactly `k` consecutive piles at a time
* The cost of merging is the sum of stones in those piles
* You need to merge all piles into one single pile
* If it's impossible to merge into one pile, return -1

## Examples

```
Input: stones = [3, 2, 4, 1], k = 2
Explanation:
  Merge [3, 2] → cost 5, stones = [5, 4, 1]
  Merge [4, 1] → cost 5, stones = [5, 5]
  Merge [5, 5] → cost 10, stones = [10]
  Total cost = 20
Output: 20

Input: stones = [3, 2, 4, 1], k = 3
Explanation:
  Cannot merge exactly 3 consecutive piles into 1
  Impossible to reach single pile
Output: -1
```

## Test Cases

| Sr. No. | Stones            | K   | Expected Output |
| ------- | ----------------- | --- | --------------- |
| 1       | `[3, 2, 4, 1]`    | `2` | `20`            |
| 2       | `[3, 2, 4, 1]`    | `3` | `-1`            |
| 3       | `[3, 4, 2]`       | `2` | `15`            |
| 4       | `[1, 1, 1, 1]`    | `2` | `8`             |
| 5       | `[1, 1, 1]`       | `2` | `5`             |
| 6       | `[6, 4, 4, 6]`    | `2` | `40`            |
| 7       | `[1, 2, 3, 4]`    | `3` | `-1`            |
| 8       | `[5, 4, 3, 2, 1]` | `3` | `21`            |