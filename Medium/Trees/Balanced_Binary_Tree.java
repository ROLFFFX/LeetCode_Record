package Medium.Trees;

public class Balanced_Binary_Tree {
    // find height in left and right subtree, return -1 if unbalanced
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
    public int height(TreeNode root){
        if (root == null) return 1;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
