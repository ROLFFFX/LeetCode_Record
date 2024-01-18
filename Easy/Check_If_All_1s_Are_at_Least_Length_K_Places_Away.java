package Easy;

import java.util.ArrayList;
import java.util.List;

public class Check_If_All_1s_Are_at_Least_Length_K_Places_Away {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> indices = new ArrayList();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) indices.add(i);
        }
        for (int i = indices.size() - 1; i > 0; i--){
            if (indices.get(i) - indices.get(i - 1) <= k){
                return false;
            }
        }
        return true;
    }
}
