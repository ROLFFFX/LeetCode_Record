package Easy.Trees;

public class Binary_Tree_Tilt {
    public int ans = 0;
    public int findTilt(TreeNode root) {
        post(root);
        return ans;
    }

    public int post(TreeNode root){
        if (root == null) return 0;
        int left = post(root.left);
        int right = post(root.right);
        ans += Math.abs(left - right);
        return left + right + root.val;
    }
}
