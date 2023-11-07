package Easy;

public class Sqrt_x_18_69 {
    public static void main(String[] args) {
        int x = 17;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    public static int mySqrt(int x){
        if (x == 0 || x == 1){  return x;   }
        return (int)Math.sqrt(x);

    }

    /** first attempt beats 15%**/
//    public static int mySqrt(int x) {
//        String ans = Double.toString(Math.sqrt(x));
//        StringBuilder sb = new StringBuilder();
//        int c = 0;
//        while (ans.charAt(c) != '.'){
//            sb.append(ans.charAt(c));
//            c++;
//        }
//        return Integer.parseInt(sb.toString());
//    }
}
