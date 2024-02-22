package Easy;

public class Calculate_Digit_Sum_of_a_String {
    public String digitSum(String s, int k) {
        System.out.println(s.length());
        System.out.println(s);
        if (s.length() <= k) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i+=k){
            int curr = 0;
            for (int j = i; j < s.length() && j < i + k; j++){
                curr += arr[j] - '0';
            }
            sb.append(curr + "");
        }
        return digitSum(sb.toString(), k);
    }
}
