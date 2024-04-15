package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
    public List<List<Integer>> res = new ArrayList();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>());
        return res;
    }

    public void dfs(int[] nums, int i, List<Integer> subset) {
        if (i >= nums.length) {
            List<Integer> temp = new ArrayList<Integer>(subset);
            if (!res.contains(temp)) res.add(temp);
            return;
        }
        subset.add(nums[i]);
        dfs(nums, i+1, subset);
        subset.remove(subset.size() - 1);
        dfs(nums, i+1, subset);
    }
}
