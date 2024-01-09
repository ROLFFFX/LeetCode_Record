package Easy;

public class Strong_Password_Checker_II {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        char prev = '/';
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean digit = false;
        for (char p : password.toCharArray()){
            if (p == prev) return false;
            prev = p;
            if (p >= 'a' && p <= 'z') lower = true;
            else if (p >= 'A' && p <= 'Z') upper = true;
            else if (p >= '0' && p <= '9') digit = true;
            else special = true;
        }
        return upper && lower && special && digit;
    }
}
