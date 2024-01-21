package Easy.Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;
        traverse(root, ans);
        return ans;
    }

    public void traverse(TreeNode root, List<Integer> ans){
        if (root.left != null) {
            traverse(root.left, ans);
        }
        if (root.right != null){
            traverse(root.right, ans);
        }
        ans.add(root.val);
    }
}
