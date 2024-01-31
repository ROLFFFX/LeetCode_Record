package Easy;

public class Check_If_String_Is_a_Prefix_of_Array {
    public boolean isPrefixString(String s, String[] words) {
        String prefix = "";
        for (String word : words){
            prefix += word;
            if (prefix.length() > s.length() || !s.substring(0, prefix.length()).equals(prefix)){
                return false;
            } else if (prefix.equals(s)){
                return true;
            }
        }
        return false;
    }
}
