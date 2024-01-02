package Medium;

import java.util.ArrayList;

public class Max_Number_Of_K_Sum_Pairs {
    public static void main(String[] args) {
        Max_Number_Of_K_Sum_Pairs solution = new Max_Number_Of_K_Sum_Pairs();
        System.out.println(solution.maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
    }

    public static int maxOperations(int[] nums, int k) {
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
//                    System.out.println("Removing: ");
//                    System.out.println(list.get(i));
//                    System.out.println(list.get(j));
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
