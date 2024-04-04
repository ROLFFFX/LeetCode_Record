package Easy;

public class Check_if_All_As_Appears_Before_All_Bs {
    public boolean checkString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for (; i < s.length(); i++){
            if (arr[i] == 'b') break;
        }
        for (; i < s.length(); i++){
            if (arr[i] == 'a') return false;
        }
        return true;
    }
}
