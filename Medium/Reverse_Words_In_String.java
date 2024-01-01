package Medium;

public class Reverse_Words_In_String {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String ans = "";
        for (int i = split.length - 1; i >= 0; i--){
            if (!split[i].isBlank()){
                ans += split[i];
                ans+=" ";
            }
        }
        return ans.substring(0, ans.length()-1);
    }
}
