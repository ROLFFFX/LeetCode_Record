package Medium.Trees;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
    public TreeNode lowestCommonAncestor_optimized(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left: right;
    }
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (findBoth(root, p, q)){
            ans = root;
            lowestCommonAncestor(root.left, p, q);
            lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
        return ans;
    }

    // return true if p and q are descendents of root
    public boolean findBoth(TreeNode root, TreeNode p, TreeNode q){
        return find(root, p) && find(root, q);
    }

    public boolean find(TreeNode root, TreeNode r){
        if (root == null) return false;
        if (root.val == r.val) return true;
        return find(root.left, r) || find(root.right, r);
    }
}
