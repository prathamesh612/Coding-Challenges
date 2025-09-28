### Question :
Write a function that takes a string and returns a **jumbled version** of it where:  
- The **first and last letters** of each word remain unchanged.  
- All letters **between the first and last letter** of each word are **sorted alphabetically**.  
- The input string will contain **no punctuation** and will be entirely **lowercase**.  
- Words should remain in the same order.  
- Only the internal letters of each word should be rearranged.  

### Test Cases :  

**Sr. No.** | **Function Call**                                          | **Expected Output**  
--------|----------------------------------------------------------------|-----------------------------------------------------
1       | `jbelmu("hello world")`                                        | `hello wlord`  
2       | `jbelmu("i love jumbled text")`                                | `i love jbelmud text`  
3       | `jbelmu("freecodecamp is my favorite place to learn to code")` | `faccdeeemorp is my faiortve pacle to laern to cdoe`  
4       | `jbelmu("the quick brown fox jumps over the lazy dog")`        | `the qciuk borwn fox jmpus oevr the lazy dog`  
