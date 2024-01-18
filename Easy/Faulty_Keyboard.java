package Easy;

public class Faulty_Keyboard {
    public static void main(String[] args) {
        System.out.println(finalString("string"));
    }
    public static String finalString(String s) {
        String ans = "";
        for (char c : s.toCharArray()){
            if (c == 'i'){
                ans = reverse(ans);
            } else {
                ans += c;
            }
        }
        return ans;
    }

    // reverse a string
    public static String reverse(String s){
        String ans = "";
        for (char c : s.toCharArray()){
            ans = c + ans;
        }
        return ans;
    }
}
