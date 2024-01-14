package Easy;

public class Furthest_Point_From_Origin {
    public int furthestDistanceFromOrigin(String moves) {
        int ans = 0;
        int count = 0;
        for (char c : moves.toCharArray()){
            if (c == 'L') ans--;
            if (c == 'R') ans++;
            if (c == '_') count++;
        }
        return Math.abs(ans) + count;
    }
}
