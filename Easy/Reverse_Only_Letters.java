package Easy;

public class Reverse_Only_Letters {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j){
            if (!isLetter(arr[i])){
                i++;
            } else if (!isLetter(arr[j])){
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public boolean isLetter(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
