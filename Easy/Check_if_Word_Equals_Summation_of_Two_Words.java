package Easy;

public class Check_if_Word_Equals_Summation_of_Two_Words {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return translate(firstWord) + translate(secondWord) == translate(targetWord);
    }

    // translate each digit of word to numerical val
    public static int translate(String word){
        String ans = "";
        for (int i = word.length() - 1; i >= 0; i--){
            ans = word.charAt(i) - 'a' + ans;
        }
        return Integer.valueOf(ans);
    }
}
