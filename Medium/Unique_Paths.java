package Medium;

public class Unique_Paths {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
    // in another word, given m+n digits, how many combinations for m bits of m and n bits of n?
        // m + n - 2 steps, m - 1 steps of right and n - 1 steps of left
        // Total permutations = (m+n)! / (m! * n!)
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {              // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){       // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }

        return (int)res;
    }
}
