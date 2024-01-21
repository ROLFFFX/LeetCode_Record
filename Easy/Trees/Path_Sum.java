package Easy.Trees;

public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return add(root, 0, targetSum);
    }

    public boolean add(TreeNode root, int sum, int targetSum){
        if (root == null) return false;
        sum += root.val;
        if (root.left == null && root.right == null) return sum == targetSum;
        return add(root.left, sum, targetSum) || add(root.right, sum, targetSum);
    }
}
