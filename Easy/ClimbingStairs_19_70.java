package Easy;

public class ClimbingStairs_19_70 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(climbStairs(x));
    }

    //get the nth item: n = n(k-1) + n(k-2)
    /** its your first time beating 100% on your first attempt**/
    public static int climbStairs(int n) {
        if (n == 1){ return 1; }
        int[] arr = populateArr(n);
        return arr[n - 1];
    }

    public static int[] populateArr(int n){ //n = 4.
        int[] fibonacci_arr = new int[n];   //[0, 0, 0, 0]
        fibonacci_arr[0] = 1;
        fibonacci_arr[1] = 2;
        int counter = 2;
        while (counter < n){
            fibonacci_arr[counter] = fibonacci_arr[counter-1]+fibonacci_arr[counter-2];
            counter++;
        }
        return fibonacci_arr;
    }
}

//1 1   1
//2 2   1+1 2
//3 3   1+1+1 1+2 2+1
//4 5   1+1+1+1 1+2+1 1+1+2 2+1+1 2+2
//5 8   1+1+1+1+1   1+1+1+2 1+1+2+1 1+2+1+1 2+1+1+1 2+2+1 1+2+2 2+1+2
//6 13