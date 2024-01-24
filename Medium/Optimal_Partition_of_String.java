package Medium;

import java.util.HashSet;

public class Optimal_Partition_of_String {
    public int partitionString(String s) {
        int count = 1;
        HashSet<Character> set = new HashSet();
        for (char c : s.toCharArray()){
            if (set.contains(c)){
                set.clear();
                count++;
            }
            set.add(c);
        }
        return count;
    }
}
