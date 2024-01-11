package Medium.Trees;

public class Maximum_Difference_Between_Node_and_Ancestor {
    int diff = -Integer.MAX_VALUE;
    private void dfs(TreeNode root, int max, int min){
        if(root == null){
            return;
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        diff = Math.max(diff, Math.abs(max-min));

        dfs(root.left, max,min);
        dfs(root.right,max,min);

    }
    public int maxAncestorDiff(TreeNode root) {
        dfs(root,root.val,root.val);
        return diff;
    }
}
