package Hard;

public class Count_the_Number_of_Powerful_Integers {
//    You are given three integers start, finish, and limit.
//    You are also given a 0-indexed string s representing a positive integer.
//    A positive integer x is called powerful if it ends with s (in other
//    words, s is a suffix of x) and each digit in x is at most limit.
//
//    Return the total number of powerful integers in the range [start..finish].
//
//    A string x is a suffix of a string y if and only if x is a substring
//    of y that starts from some index (including 0) in y and extends to the
//    index y.length - 1. For example, 25 is a suffix of 5125 whereas 512 is not.
    public static void main(String[] args) {
        long ans = numberOfPowerfulInt(1,6000,4,"124");
        System.out.println(ans);
    }
    public static long numberOfPowerfulInt(long start, long finish, int limit, String s) {


        return 1;   //dummy
    }
}
