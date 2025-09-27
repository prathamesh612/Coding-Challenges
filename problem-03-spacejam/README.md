### Question :
Write a function that takes a string, removes all spaces, inserts **two spaces between every character**, converts all alphabetical letters to **uppercase**, and returns the result.

- **Function Return Type:** void
- Non-alphabetical characters should remain unchanged (except for spaces, which are removed)
- All letters should be converted to uppercase

### Test Cases :
**Sr. No.** | **Function Call**                        | **Expected Output**
--------|--------------------------------------|----------------------------------------
1       | `spaceJam("Hello World?!")`            | `H  E  L  L  O  W  O  R  L  D  ?  !`
2       | `spaceJam("   great  day   ")`         | `G  R  E  A  T  D  A  Y`
3       | `spaceJam("allyourbase")`              | `A  L  L  Y  O  U  R  B  A  S  E`
4       | `spaceJam("C@t$ & D0g$")`              | `C  @  T  $  &  D  0  G  $`
5       | `spaceJam("programmingLanguage")`      | `P  R  O  G  R  A  M  M  I  N  G  L  A  N  G  U  A  G  E`
