package Medium;

import java.util.ArrayList;
import java.util.List;

public class Find_Triangular_Sum_of_an_Array {
    public int triangularSum(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int num : nums) list.add(num);
        while (list.size() != 1){
            List<Integer> aux = new ArrayList();
            for (int i = 0; i < list.size() - 1; i++){
                int ans = list.get(i) + list.get(i + 1);
                aux.add(ans % 10);
            }
            list = aux;
        }
        return list.get(0);
    }
}
