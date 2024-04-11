package Easy;

public class Strobogrammatic_Number
{
    public boolean isStrobogrammatic(String num) {
        if (num.length() == 1) return check(num.charAt(0));
        int i = 0;
        int j = num.length() - 1;
        while (i < j) {
            if (!check(num.charAt(i), num.charAt(j)) &&
                    !check(num.charAt(j), num.charAt(i))) return false;
            i++;
            j--;
        }
        if (i == j) return check(num.charAt(i));
        return true;
    }

    public boolean check(char c) {
        return c == '0' || c == '1' || c == '8';
    }

    public boolean check(char c1, char c2) {
        if ((c1 == '0' && c2 == '0') ||
                (c1 == '1' && c2 == '1') ||
                (c1 == '6' && c2 == '9') ||
                (c1 == '8' && c2 == '8')
        ) return true;
        return false;
    }
}
