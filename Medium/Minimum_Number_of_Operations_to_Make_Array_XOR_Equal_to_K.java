package Medium;

public class Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K {
    public int minOperations(int[] nums, int k) {
        int XOR = 0;
        for (int num:nums){
            XOR ^= num;
        }
        int diff = XOR ^ k;
        int op = 0;
        while (diff > 0){
            op += diff & 1;
            diff >>= 1;
        }
        return op;
    }
}
