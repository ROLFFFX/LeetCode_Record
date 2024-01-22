package Easy.Trees;

public class Evaluate_Boolean_Binary_Tree {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null){
            return root.val == 1;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        return (root.val == 2 ? (left || right):(left && right));
    }
}
