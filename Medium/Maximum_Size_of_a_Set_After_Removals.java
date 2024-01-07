package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Maximum_Size_of_a_Set_After_Removals {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int n = nums1.length;
        HashMap<Integer,Integer> map2 = new HashMap<>();
        Set set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums1.length; i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
            set.add(nums2[i]);
        }
        if(map1.size()>=n/2) ans+=n/2;
        else ans+=map1.size();
        if(map2.size()>=n/2) ans+=n/2;
        else ans+=map2.size();
        if(set.size()>=ans)
            return ans;
        return set.size();
    }
}
