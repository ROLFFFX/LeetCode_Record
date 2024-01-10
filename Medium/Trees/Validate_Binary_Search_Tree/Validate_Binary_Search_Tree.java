package Medium.Trees.Validate_Binary_Search_Tree;

import java.util.Stack;

public class Validate_Binary_Search_Tree {
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            // fill up the stack with left child. traverse all the way down to the leftest child.
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // start popping parent value
            root = stack.pop();
            // check if parent is greater than left child
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

}
