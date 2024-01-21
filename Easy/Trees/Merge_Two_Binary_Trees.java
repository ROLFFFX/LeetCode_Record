package Easy.Trees;

public class Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        int val = ((root1 == null ? 0 : root1.val) + (root2 == null ? 0 : root2.val));
        TreeNode nn = new TreeNode(val);
        nn.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        nn.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);
        return nn;
    }
}
