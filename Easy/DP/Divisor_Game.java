package Easy.DP;

public class Divisor_Game {
    public boolean divisorGame(int N) {
        // game ends when n becomes 1.
        // in other words, when Alice changes n to one, return true.
        if (N==1) return false;
        if (N==2) return true;

        for (int i=1;i<=N;i++){
            if (N%i == 0)
                return !(divisorGame(N-i));
        }
        return false;
    }
}
