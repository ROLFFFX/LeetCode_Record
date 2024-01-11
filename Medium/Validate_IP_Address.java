package Medium;

public class Validate_IP_Address {
    public String validIPAddress(String queryIP) {
        if (queryIP.length() < 6) return "Neither";
        if (isIPV4(queryIP)) return "IPv4";
        if (isIPV6(queryIP)) return "IPv6";
        return "Neither";
    }

    public boolean isIPV4(String queryIP) {
        String[] ip = queryIP.split("\\.", -1); // Split with limit to handle trailing dots
        if (ip.length != 4) return false;
        for (String s : ip) {
            if (!s.matches("\\d+") || hasLeadingZero(s)) return false; // Check if s is a number and has no leading zeros
            try {
                if (Integer.parseInt(s) > 255 || Integer.parseInt(s) < 0) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public boolean hasLeadingZero(String s) {
        if (s.length() > 1 && s.startsWith("0")) return true;
        return false;
    }

    public boolean isIPV6(String queryIP){
        String[] ip = queryIP.split(":");
        if (queryIP.charAt(queryIP.length() - 1) == ':') return false;
        if (ip.length != 8) return false;
        for (String s : ip){
            if (s.length() > 4 || s.length() < 1) return false;
            for (char c : s.toCharArray()){
                if (!isValidDigit(c)) return false;
            }
        }
        return true;
    }

    public boolean isValidDigit(char c) {
        return Character.isDigit(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }
}
