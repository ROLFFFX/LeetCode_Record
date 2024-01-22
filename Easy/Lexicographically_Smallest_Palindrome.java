package Easy;

public class Lexicographically_Smallest_Palindrome {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = s.length() / 2 - 1;
        int j = (s.length() % 2 == 1 ? i + 2 : i + 1);
        while (i >= 0){
            if (arr[i] != arr[j]){
                if (arr[i] < arr[j]){
                    arr[j] = arr[i];
                } else {
                    arr[i] = arr[j];
                }
            }
            i--;
            j++;
        }
        return new String(arr);
    }
}
