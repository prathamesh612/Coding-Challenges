public class CamelCaseConverter {
    
    public static void main(String[] args) {
        System.out.println(toCamelCase("hello world"));
        System.out.println(toCamelCase("HELLO WORLD"));
        System.out.println(toCamelCase("secret agent-X"));
        System.out.println(toCamelCase("the_quick_brown_fox"));
        System.out.println(toCamelCase("convert-this-to-camel"));
        System.out.println(toCamelCase("___multiple___separators___"));
        System.out.println(toCamelCase("user ID-number_123"));
        System.out.println(toCamelCase("--leading-and-trailing--"));
        System.out.println(toCamelCase("single"));
        System.out.println(toCamelCase("MiXeD_CaSe-StRiNg"));
    }

    /*
     * Converts a string to camelCase format
     * Words are separated by space, dash, or underscore
     * First word is lowercase, subsequent words are capitalized
    */
    private static String toCamelCase(String str) {
        StringBuilder camelCaseStr = new StringBuilder();
        
        // Split by space, dash, or underscore (one or more)
        String[] words = str.split("[ _-]+");
        
        for (int i = 0; i < words.length; i++) {
            // Skip empty strings that result from leading/trailing separators
            if (words[i].isEmpty()) {
                continue;
            }
            
            // First non-empty word: convert to all lowercase
            if (camelCaseStr.length() == 0) {
                camelCaseStr.append(words[i].toLowerCase());
            } 
            // Subsequent words: capitalize first letter, lowercase the rest
            else {
                String firstLetter = words[i].substring(0, 1).toUpperCase();
                String restOfString = words[i].substring(1).toLowerCase();
                camelCaseStr.append(firstLetter).append(restOfString);
            }
        }
        
        return camelCaseStr.toString();
    }
}