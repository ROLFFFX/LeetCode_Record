package Medium;

public class Reverse_Integer {
    //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    public static void main(String[] args) {
        int x = -123;
        int ans = reverse(x);
        System.out.println(ans);

    }

    public static int reverse(int x) {
        boolean negative = false;
        int num = 0;
        /** If x is negative, set flag to true and flip x to postive **/
        if (x < 0) {
            x = -x;
            negative = true;
        }
        while(x!=0){
            int a=x%10; // a represents current digits.
            if (num > (Integer.MAX_VALUE-a)/10) return 0;   // edge case handling for big value
            num=num*10+a;   // add digit
            x=x/10; // for next iteration
        }
        return negative ? -num : num;
    }
}
