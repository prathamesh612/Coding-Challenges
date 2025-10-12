public class IPv4Validator {
    
    public static void main(String[] args) {
        System.out.println(isValidIPv4("192.168.1.1"));
        System.out.println(isValidIPv4("0.0.0.0"));
        System.out.println(isValidIPv4("255.01.50.111"));
        System.out.println(isValidIPv4("255.00.50.111"));
        System.out.println(isValidIPv4("256.101.50.115"));
        System.out.println(isValidIPv4("192.168.101."));
        System.out.println(isValidIPv4("192168145213"));
    }

    // Validates if string is a proper IPv4 address
    private static boolean isValidIPv4(String ipAddress) {
        // Split by dot
        String[] parts = ipAddress.split("\\.");
        
        // Must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        // Validate each part
        for (String part : parts) {
            if (!isValidOctet(part)) {
                return false;
            }
        }

        return true;
    }

    // Validates a single octet (0-255, no leading zeros)
    private static boolean isValidOctet(String octet) {
        // Empty string is invalid
        if (octet.isEmpty()) {
            return false;
        }

        // Check for non-numeric characters
        for (char ch : octet.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        // Check for leading zeros (except "0" itself)
        if (octet.length() > 1 && octet.charAt(0) == '0') {
            return false;
        }

        // Parse and check range
        try {
            int value = Integer.parseInt(octet);
            return value >= 0 && value <= 255;
        } catch (NumberFormatException e) {
            return false;  // Number too large or invalid
        }
    }
}

/*
 * This program validates IPv4 address format.
 * An IPv4 address consists of four octets separated by dots.
 * Each octet must be a number between 0-255 with no leading zeros (except "0" itself).
 * The program splits the input by dots and validates each part separately.
 * It checks for correct length, numeric characters only, no leading zeros, and valid range.
 * Returns true only if all validation rules pass, false otherwise.
 */