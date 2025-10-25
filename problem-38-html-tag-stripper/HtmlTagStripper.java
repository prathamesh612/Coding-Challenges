public class HtmlTagStripper {

    public static void main(String[] args) {
        System.out.println(stripTags("<a href='#'>Click here</a>"));
        System.out.println(stripTags("<p class='center'>Hello <b>World</b>!</p>"));
        System.out.println(stripTags("<img src='cat.jpg' alt='Cat'>"));
        System.out.println(stripTags("<main id='main'><section class='section'>section</section><section class='section'>section</section></main>"));
    }

    // Removes all HTML tags and returns the plain text content.
    private static String stripTags(String html) {

        StringBuilder result = new StringBuilder();
        boolean insideTag = false;

        for (char c : html.toCharArray()) {
            if (c == '<') {
                insideTag = true;
            } else if (c == '>') {
                insideTag = false;
            } else if (!insideTag) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

/*
 * This method removes HTML tags by reading each character and keeping track of
 * whether the current position is inside a tag or not. When it encounters a
 * '<', it sets a flag to stop adding characters until the closing '>' appears.
 * Only characters outside of tags are appended to the final result.
 * This approach avoids hardcoding and uses a simple, clear logic that works for
 * well-formed HTML input.
 */
