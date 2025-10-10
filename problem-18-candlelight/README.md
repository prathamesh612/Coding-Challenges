# Candlelight

### Question:
Given an **integer representing the number of candles** you start with, and an **integer representing how many burned candles** it takes to create a new one, return the **total number of candles burned** after creating and burning as many as possible.

### Example:
```
Input: 7 candles, 2 burned candles make 1 new candle

Step 1: Burn 7 candles → 7 leftovers
Step 2: Recycle 6 leftovers → 3 new candles (1 leftover remains)
Step 3: Burn 3 candles → 3 leftovers (4 total leftovers)
Step 4: Recycle 4 leftovers → 2 new candles
Step 5: Burn 2 candles → 2 leftovers
Step 6: Recycle 2 leftovers → 1 new candle
Step 7: Burn 1 candle → 1 leftover (can't recycle anymore)

Total burned: 7 + 3 + 2 + 1 = 13
```

### Test Cases:
| **Sr. No.** | **Function Call**      | **Expected Output** |
| ----------- | ---------------------- | ------------------- |
| 1           | `burnCandles(7, 2)`    | `13`                |
| 2           | `burnCandles(10, 5)`   | `12`                |
| 3           | `burnCandles(20, 3)`   | `29`                |
| 4           | `burnCandles(17, 4)`   | `22`                |
| 5           | `burnCandles(2345, 3)` | `3517`              |
