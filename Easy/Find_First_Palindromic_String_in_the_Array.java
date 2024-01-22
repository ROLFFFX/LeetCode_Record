package Easy;

public class Find_First_Palindromic_String_in_the_Array {
    public String firstPalindrome(String[] words) {
        for (String word : words){
            if (find(word)){
                return word;
            }
        }
        return "";
    }

    public boolean find(String word){
        int i = 0;
        int j = word.length() - 1;
        while (i < j){
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
