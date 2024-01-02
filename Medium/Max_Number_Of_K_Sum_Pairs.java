package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Max_Number_Of_K_Sum_Pairs {
    public static void main(String[] args) {
        Max_Number_Of_K_Sum_Pairs solution = new Max_Number_Of_K_Sum_Pairs();
        System.out.println(solution.maxOperations(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));
    }
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numCounts = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (num > k) continue;
            int complement = k - num;
            if (numCounts.getOrDefault(complement, 0) > 0) {
                count++;
                numCounts.put(complement, numCounts.get(complement) - 1);
            } else {
                numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

    public static int maxOperations_1(int[] nums, int k) {
        int[] index = new int[nums.length]; // to store removed index
        int count = 0;
        for (int i = 0; i < index.length; i++){
            if (index[i] == 1 || nums[i] > k){ continue; }
            for (int j = i + 1; j < index.length; j++){
                if (index[j] == 1 || nums[j] > k){ continue; }
                if (nums[i] + nums[j] == k){
                    count++;
                    index[i] = 1;
                    index[j] = 1;
                    break;
                }
            }
        }
        return count;
    }

    public static int maxOperations_2(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList();
        for (int num : nums){
            list.add(num);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            int curr = list.get(i);
            if (curr > k){
                continue;
            }
            for (int j = i + 1; j < list.size(); j++){
                if (curr + list.get(j) == k){
                    count++;
                    list.remove(i);
                    list.remove(j - 1);
                    i--;
                    break;
                }
            }
        }
        return count;
    }
}
