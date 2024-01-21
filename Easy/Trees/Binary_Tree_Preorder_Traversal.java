package Easy.Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;
        traverse(root, ans);
        return ans;
    }

    public void traverse(TreeNode root, List<Integer> ans){
        ans.add(root.val);
        if (root.left != null){
            traverse(root.left, ans);
        }
        if (root.right != null){
            traverse(root.right, ans);
        }
    }
}
