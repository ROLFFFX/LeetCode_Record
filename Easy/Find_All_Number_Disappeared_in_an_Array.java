package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Find_All_Number_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(nums);
        System.out.println();

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 1){ return ans; }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0){
                nums[index] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
