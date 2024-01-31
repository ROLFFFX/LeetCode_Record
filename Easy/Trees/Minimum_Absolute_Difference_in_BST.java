package Easy.Trees;

public class Minimum_Absolute_Difference_in_BST {
    int prev = 100000;
    int ans = 100000;
    // inorder traversal guarantees that the nodes traversed will be increasing order
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root){
        if (root.left != null) inorder(root.left);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        if (root.right != null) inorder(root.right);
    }
}
