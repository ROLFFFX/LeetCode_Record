package Easy;

public class Maximum_69_Number {
    public static void main(String[] args) {
        int ans = maximum69Number(6999);
        System.out.println(ans);
    }
    // locate first occurrence of 6 and turn it to 9
    public static int maximum69Number (int num) {
        char[] arr = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return Integer.valueOf(ans);
    }

}
