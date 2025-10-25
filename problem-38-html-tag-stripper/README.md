# HTML Tag Stripper

### Question:
Given a string containing HTML code, remove all HTML tags and return only the visible text content. The goal is to extract the readable text by ignoring tags and their attributes.

### Rules:
1. The input will always be a valid HTML string.  
2. Tags may be nested at any level.  
3. All HTML tags and their attributes must be removed.  
4. The output should contain only the plain text.  
5. If the input contains tags with no text content, the result should be an empty string.  

For example, the string `<a href="#">Click here</a>` should return `Click here`.

### Test Cases:
| **Sr. No.** | **Function Call**| **Expected Output** |
| ----------- | ---------------- | ------------------- |
| 1 | `stripTags("<a href='#'>Click here</a>")`| `"Click here"`|
| 2 | `stripTags("<p class='center'>Hello <b>World</b>!</p>")`| `"Hello World!"`|
| 3 | `stripTags("<img src='cat.jpg' alt='Cat'>")`| `""`|
| 4 | `stripTags("<main id='main'><section class='section'>section</section><section class='section'>section</section></main>")`| `"sectionsection"`|
