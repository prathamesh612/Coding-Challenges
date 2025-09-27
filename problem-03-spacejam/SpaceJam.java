public class SpaceJam {
    public static void main(String[] args) {
        // Test Cases
        spaceJam("Hello World?!");
        spaceJam("   great  day   ");
        spaceJam("allyourbase");
        spaceJam("C@t$ & D0g$");
        spaceJam("programmingLanguage");
    }

    private static void spaceJam(String string) {

        // -------- Approach 1: Using simple String concatenation --------
        char[] chars = string.replace(" ", "").toUpperCase().toCharArray();
        String newString = "";
        for (Character ch : chars) {
            newString += ch + "  ";
        }
        System.out.println(newString.trim());

        // // -------- Approach 2: Using String.join --------
        // String result = String.join("  ", string.replace(" ", "").toUpperCase().split(""));
        // System.out.println(result);

        // You can use either Approach 1 or Approach 2. Both produce the same output.

    }
}
