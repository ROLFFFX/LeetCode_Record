package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_the_People_Given_the_Group_Size_They_Belong_To {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap(); // number, size
        List<List<Integer>> ans = new ArrayList();
        for (int i = 0; i < groupSizes.length; i++){
            int size = groupSizes[i];
            map.putIfAbsent(size, new ArrayList());
            map.get(size).add(i);
            if (map.get(size).size() == size){
                ans.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }
        return ans;
    }
}
