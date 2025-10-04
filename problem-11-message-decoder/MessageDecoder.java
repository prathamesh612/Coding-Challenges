public class MessageDecoder {
    public static void main(String[] args) {
        decode("Xlmw mw e wigvix qiwweki.", 4);
        decode("Byffi Qilfx!", 20);
        decode("Zqd xnt njzx?", -1);
        decode("oannLxmnLjvy", 9);
    }

    public static void decode(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                int base = Character.isUpperCase(ch) ? 'A' : 'a';
                int position = ch - base;
                System.out.println(((position - shift) % 26 + 26) % 26);
                int newPosition = ((position - shift) % 26 + 26) % 26;
                char decodedChar = (char) (base + newPosition);
                result.append(decodedChar);
            } else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
