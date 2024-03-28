package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Lucky_Integer_in_an_Array {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.get(arr[i]) == arr[i]) return arr[i];
        }
        return -1;
    }
}
