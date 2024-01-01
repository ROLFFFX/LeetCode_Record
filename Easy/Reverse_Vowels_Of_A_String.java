package Easy;

public class Reverse_Vowels_Of_A_String {
    public String reverseVowels(String s) {
        char[] s_arr = s.toCharArray();
        int ptr1 = 0;
        int ptr2 = s_arr.length-1;
        while (ptr1 < ptr2) {
            if (isVowel(s_arr[ptr1])) {
                while (ptr2 > ptr1) {
                    if (isVowel(s_arr[ptr2])) {
                        char temp = s_arr[ptr1];
                        s_arr[ptr1] = s_arr[ptr2];
                        s_arr[ptr2] = temp;
                        ptr2--;
                        break;
                    }
                    ptr2--;
                }
            }
            ptr1++;
        }
        String ans = new String(s_arr);
        return ans;
    }

    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
