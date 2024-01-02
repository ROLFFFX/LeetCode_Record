package Medium;

import java.util.ArrayList;

public class Max_Number_Of_K_Sum_Pairs {
    public static void main(String[] args) {
        Max_Number_Of_K_Sum_Pairs solution = new Max_Number_Of_K_Sum_Pairs();
        System.out.println(solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList();
        for (int num : nums){
            list.add(num);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            int sum = 0;
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
                }
            }
        }
        return count;
    }
}
