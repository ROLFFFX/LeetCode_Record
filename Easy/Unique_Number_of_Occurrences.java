package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();  // num, freq
        for (int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> set = new HashSet();
        for (int entry : map.values()){
            if (!set.add(entry)){
                return false;
            }
        }
        return true;
    }
}
