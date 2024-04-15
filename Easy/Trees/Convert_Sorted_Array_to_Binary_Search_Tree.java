package Easy.Trees;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode head = find(nums, 0, nums.length - 1);
        return head;
    }

    public TreeNode find(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = find(nums, start, mid - 1);
        root.right = find(nums, mid + 1, end);
        return root;
    }
}
