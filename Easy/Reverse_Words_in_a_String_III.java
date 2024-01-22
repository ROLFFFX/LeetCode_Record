package Easy;

public class Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        return sb.toString().trim();
    }
    public String reverseWords_unoptimized(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for (int i = 0; i < arr.length; i++){
            ans += rev(arr[i]) + " ";
        }
        return ans.substring(0, ans.length() - 1);
    }

    public String rev(String s){
        String ans = "";
        for (char c : s.toCharArray()){
            ans = c + ans;
        }
        return ans;
    }
}
