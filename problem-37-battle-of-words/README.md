# Battle of Words

### Question:
Given two sentences, each representing a team, determine which team wins the battle of words based on the value of their letters. Each word from your team competes against the word in the same position from the opposing team.

### Rules:
1. Both sentences will always have the same number of words.  
2. Words are separated by a single space and contain only letters.  
3. The value of a word is the total of its letters’ values.  
4. The letters `a` to `z` have values from `1` to `26`.  
5. A capital letter counts as double its lowercase value. For example, `A` is `2` and `Z` is `52`.  
6. Words battle in order: the first word of your team battles the first word of the opposing team, and so on.  
7. A word wins if its value is greater than the corresponding word in the opposing team.  
8. The team with more winning words is the overall winner.  

Return `"We win"` if your team wins, `"We lose"` if the other team wins, or `"Draw"` if both teams have the same number of wins.

### Test Cases:
| **Sr. No.** | **Function Call**                                                  | **Expected Output** |
| ----------- | ------------------------------------------------------------------ | ------------------- |
| 1           | `battle("hello world", "hello word")`                              | `"We win"`          |
| 2           | `battle("Hello world", "hello world")`                             | `"We win"`          |
| 3           | `battle("lorem ipsum", "kitty ipsum")`                             | `"We lose"`         |
| 4           | `battle("hello world", "world hello")`                             | `"Draw"`            |
| 5           | `battle("git checkout", "git switch")`                             | `"We win"`          |
| 6           | `battle("Cheeseburger with fries", "Cheeseburger with Fries")`     | `"We lose"`         |
| 7           | `battle("We must never surrender", "Our team must win")`           | `"Draw"`            |
