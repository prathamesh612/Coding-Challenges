### Question :
Write a function that takes two strings and determines if they are **anagrams** of each other.

### Conditions :
- Ignore **casing** (treat uppercase and lowercase as the same).
- Ignore **white spaces**.
- Print a **string message** like  
  "Yes, they are anagrams!"  
  or  
  "No, they are not anagrams."

### Test Cases :

**Sr. No.** | **Function Call**                                    | **Expected Output**
--------|----------------------------------------------------------|----------------------------
1       | areAnagrams("listen", "silent")                          | Yes, they are anagrams!
2       | areAnagrams("School master", "The classroom")            | Yes, they are anagrams!
3       | areAnagrams("A gentleman", "Elegant man")                | Yes, they are anagrams!
4       | areAnagrams("Astronomer", "Moon starer")                 | Yes, they are anagrams!
5       | areAnagrams("Dormitory", "Dirty room")                   | Yes, they are anagrams!
6       | areAnagrams("Hello", "O hell")                           | Yes, they are anagrams!
7       | areAnagrams("Tom Marvolo Riddle", "I am Lord Voldemort") | Yes, they are anagrams!
8       | areAnagrams("Debit card", "Bad credit")                  | Yes, they are anagrams!
9       | areAnagrams("Hello", "World")                            | No, they are not anagrams.
10      | areAnagrams("apple", "banana")                           | No, they are not anagrams.
11      | areAnagrams("cat", "dog")                                | No, they are not anagrams.
12      | areAnagrams("Listen", "Silentt")                         | No, they are not anagrams.
