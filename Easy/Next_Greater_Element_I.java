package Easy;

public class Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++){
            int curr = nums1[i];
            int starting_index = -1;
            for (int j = 0; j < nums2.length; j++){
                if (nums2[j] == nums1[i]){
                    starting_index = j;
                    break;
                }
            }
            if (starting_index == -1 || starting_index == nums2.length-1){
                ans[i] = -1;
            } else {
                int curr_ans = -1;
                for (int k = starting_index; k < nums2.length; k++){
                    if (nums2[k] > nums2[starting_index]){
                        curr_ans = nums2[k];
                        break;
                    }
                }
                ans[i] = curr_ans;
            }
        }
        return ans;
    }
}
