public class VowelBalance {
    public static void main(String[] args) {
        
        System.out.println(isBalanced("racecar"));
        System.out.println(isBalanced("Lorem Ipsum"));
        System.out.println(isBalanced("Kitty Ipsum"));
        System.out.println(isBalanced("string"));
        System.out.println(isBalanced(" "));
        System.out.println(isBalanced("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isBalanced("123A#b!E&*456-o.U"));

    }

    public static boolean isBalanced(String s) {
        String str1 = s.substring(0,s.length()/2);
        String str2;

        if (s.length() % 2 == 0) {
            str2 = s.substring(s.length()/2);
        }
        else{
            str2 = s.substring(s.length()/2+1);
        }

        return checkVowel(str1) == checkVowel(str2);
    }

    public static int checkVowel(String s){
        char[] arr = s.toLowerCase().toCharArray();
        int count = 0;
        for (char c : arr) {
            //We can use any one of the following

            // if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
            //     cout++;
            // }

            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }
}