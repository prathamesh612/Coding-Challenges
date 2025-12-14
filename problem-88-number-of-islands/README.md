# Number of Islands

## Problem Description

Given a 2D grid where `'1'` represents land and `'0'` represents water, count the number of islands. An island is formed by connecting adjacent lands horizontally or vertically (not diagonally).

## Rules

* Grid contains `'1'` (land) and `'0'` (water)
* Islands are formed by adjacent `'1'` cells (horizontally or vertically)
* Diagonal connections do not form islands
* Return the total count of islands
* Each cell can be visited only once

## Examples

```
Input: grid = [
  ['1', '1', '0', '0', '0'],
  ['1', '1', '0', '0', '0'],
  ['0', '0', '1', '0', '0'],
  ['0', '0', '0', '1', '1']
]
Explanation:
  Island 1: Connected 1s in top-left
  Island 2: Single 1 at [2][2]
  Island 3: Connected 1s at bottom-right
Output: 3

Input: grid = [
  ['1', '1', '1'],
  ['0', '1', '0'],
  ['1', '1', '1']
]
Explanation:
  All 1s are connected (including the center)
Output: 1
```

## Test Cases

| Sr. No. | Grid                                                                                        | Expected Output |
| ------- | ------------------------------------------------------------------------------------------- | --------------- |
| 1       | `[['1','1','0','0','0'],['1','1','0','0','0'],['0','0','1','0','0'],['0','0','0','1','1']]` | `3`             |
| 2       | `[['1','1','1'],['0','1','0'],['1','1','1']]`                                               | `1`             |
| 3       | `[['1']]`                                                                                   | `1`             |
| 4       | `[['0']]`                                                                                   | `0`             |
| 5       | `[['1','0','1']]`                                                                           | `2`             |
| 6       | `[['1'],['0'],['1']]`                                                                       | `2`             |
| 7       | `[['1','1','0','1','1']]`                                                                   | `2`             |
| 8       | `[['1','0','1','0','1'],['0','1','0','1','0'],['1','0','1','0','1']]`                       | `9`             |