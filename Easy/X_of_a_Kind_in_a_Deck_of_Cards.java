package Easy;

import java.util.HashMap;

public class X_of_a_Kind_in_a_Deck_of_Cards {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : deck){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int ans = 0;
        for(int key : map.keySet()){
            ans = hasGCD(ans, map.get(key));
        }
        return ans >= 2;
    }

    public int hasGCD(int a, int b){
        return b == 0 ? a : hasGCD(b, a%b);
    }
}
