package Easy.Trees;

public class Search_in_a_Binary_Search_Tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val > val){
            return searchBST(root.left, val);
        } else if (root.val < val){
            return searchBST(root.right, val);
        }
        return root;
    }
}
