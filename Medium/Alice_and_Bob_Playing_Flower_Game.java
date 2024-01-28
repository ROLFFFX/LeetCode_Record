package Medium;

public class Alice_and_Bob_Playing_Flower_Game {
    public long flowerGame(int n, int m) {
        long count = 0;

        // Iterate through all possible values of x
        for (int x = 1; x <= n; x++) {
            // If x is odd, we need y to be even to make x + y odd, and vice versa
            if (x % 2 == 1) {
                // x is odd, count even y's
                count += m / 2;
            } else {
                // x is even, count odd y's
                count += (m + 1) / 2;
            }
        }

        return count;
    }
}
