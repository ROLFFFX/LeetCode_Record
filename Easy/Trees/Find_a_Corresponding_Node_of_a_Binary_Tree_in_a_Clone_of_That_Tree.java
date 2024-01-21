package Easy.Trees;

public class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {
    public TreeNode reference;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(original, cloned, target);
        return reference;
    }

    public void dfs(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return;
        if (original.val == target.val) this.reference = cloned;
        dfs(original.left, cloned.left, target);
        dfs(original.right, cloned.right, target);
    }
}
