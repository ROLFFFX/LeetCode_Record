package Easy.Trees;

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode r1, TreeNode r2){
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        boolean f1 = compare(r1.left, r2.right);
        boolean f2 = compare(r1.right, r2.left);
        return f1 && f2 && r1.val == r2.val;
    }
}
