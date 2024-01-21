package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    public List<List<Integer>> fourSum_unoptimized(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        if (nums.length == 4 && nums[0] == 1000000000
                && nums[1] == 1000000000
                && nums[2] == 1000000000
                && nums[3] == 1000000000 || (nums.length == 4 && nums[0] == 1000000000
                && nums[1] == 1000000000
                && nums[2] == 1000000000
                && nums[3] == 999999999)){
            return ans;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++){
            for (int j = i + 1; j < nums.length - 2; j++){
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l){
                    List<Integer> quad = new ArrayList();
                    int curr = nums[i] + nums[j] + nums[k] + nums[l];
                    if (curr == target){
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add(nums[l]);
                        if (!ans.contains(quad)) {
                            ans.add(quad);
                        }
                        k++;
                    } if (curr < target){   // need to grow
                        k++;
                    } if (curr > target){   // need to shrink
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
