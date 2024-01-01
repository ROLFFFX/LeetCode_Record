package Easy;

public class Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int pivot = 0;
        while (pivot < nums.length){
            // System.out.println("--------");
            System.out.println(pivot);
            int left = 0;
            int right = 0;
            for (int i = 0; i < pivot; i++){
                left+=nums[i];
            }
            for (int i = nums.length -1 ; i > pivot; i--){
                right+=nums[i];
            }
            // System.out.println(left);
            // System.out.println(right);
            // System.out.println("--------");;

            if (left == right){
                return pivot;
            }
            pivot++;
        }
        return -1;
    }
}
