public class RgbToHex {

    public static void main(String[] args) {
        System.out.println(rgbToHex("rgb(255, 255, 255)"));
        System.out.println(rgbToHex("rgb(1, 2, 3)"));
        System.out.println(rgbToHex("rgb(1, 11, 111)"));
        System.out.println(rgbToHex("rgb(173, 216, 230)"));
        System.out.println(rgbToHex("rgb(79, 123, 201)"));
    }

    // Converts RGB color string to hexadecimal format
    private static String rgbToHex(String rgbString) {
        // Extract numbers from "rgb(r, g, b)" format
        String numbers = rgbString.substring(4, rgbString.length() - 1);
        
        // Split by comma and/or spaces
        String[] rgbValues = numbers.split("[, ]+");
        
        StringBuilder hexColor = new StringBuilder("#");

        // Convert each RGB value to 2-digit hex
        for (String value : rgbValues) {
            String hex = Integer.toHexString(Integer.parseInt(value));
            
            // Pad with leading zero if single digit
            hexColor.append(hex.length() < 2 ? "0" + hex : hex);
        }

        return hexColor.toString();
    }
}

/*
 * This program converts CSS RGB color strings to hexadecimal format.
 * It extracts the three RGB values from the string using substring and regex splitting.
 * Each RGB value (0-255) is converted to its hexadecimal equivalent using Integer.toHexString().
 * Values are padded with a leading zero if they result in a single hex digit.
 * Returns a lowercase hex color string in the format #rrggbb.
 */