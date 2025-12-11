# Koko Eating Bananas

## Problem Description

Koko loves eating bananas. There are `n` piles of bananas, and she wants to finish all of them within `h` hours. In each hour, she chooses one pile and eats `k` bananas from it. If a pile has less than `k` bananas, she eats all of them in that hour. Find the minimum eating speed `k` (bananas per hour) so that Koko can finish all bananas within `h` hours.

## Rules

* Koko eats from one pile per hour
* If a pile has less than `k` bananas, she finishes it in 1 hour
* She must finish all bananas within `h` hours
* Find the minimum eating speed `k`
* Eating speed is in whole bananas per hour

## Examples

```
Input: piles = [1, 1, 1, 1], h = 4
Explanation:
  Speed 1: Takes 1+1+1+1 = 4 hours ✓
Output: 1

Input: piles = [312884132, 968299470, 310146514], h = 968299470
Explanation:
  Speed 312884132: Takes 1+4+1 = 6 hours
  Need to find minimum speed to finish in 968299470 hours
Output: 1
```

## Test Cases

| Sr. No. | Piles                               | H           | Expected Output |
| ------- | ----------------------------------- | ----------- | --------------- |
| 1       | `[1, 1, 1, 1]`                      | `4`         | `1`             |
| 2       | `[312884132, 968299470, 310146514]` | `968299470` | `2`             |
| 3       | `[1, 10, 6, 2]`                     | `7`         | `4`             |
| 4       | `[312884132]`                       | `968299470` | `1`             |
| 5       | `[4, 10, 19, 14, 13, 5, 2]`         | `12`        | `7`             |
| 6       | `[30, 23, 20, 11, 50]`              | `5`         | `50`            |
| 7       | `[1, 100, 50]`                      | `8`         | `25`            |