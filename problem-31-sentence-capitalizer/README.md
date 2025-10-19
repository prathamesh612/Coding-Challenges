# Sentence Capitalizer

### Question :

Given a **paragraph**, return a new paragraph where the **first letter of each sentence** is capitalized.

### Conditions :

* Sentences can end with a **period (.)**, **one or more question marks (?)**, or **one or more exclamation points (!)**.
* All other characters (spaces, punctuation, etc.) should be **preserved exactly**.
* Only the **first character of each sentence** should be converted to uppercase (if it’s a letter).

### Test Cases :

| **Sr. No.** | **Function Call**| **Expected Output**|
| ----------- | ---------------- | ------------------ |
| 1 | `capitalize("this is a simple sentence.")` | `"This is a simple sentence."` |
| 2 | `capitalize("hello world. how are you?")` | `"Hello world. How are you?"` |
| 3 | `capitalize("i did today's coding challenge... it was fun!!")`| `"I did today's coding challenge... It was fun!!"` |
| 4 | `capitalize("crazy!!!strange???unconventional...sentences.")` | `"Crazy!!!Strange???Unconventional...Sentences."` |
| 5 | `capitalize("there's a space before this period . why is there a space before that period ?")` | `"There's a space before this period . Why is there a space before that period ?"` |