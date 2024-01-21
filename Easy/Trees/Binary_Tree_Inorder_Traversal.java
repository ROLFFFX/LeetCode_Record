package Easy.Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        io(root, ans);
        return ans;
    }


    public static void io(TreeNode root, List<Integer> ans){
        if (root != null){
            io(root.left, ans);
            ans.add(root.val);
            io(root.right, ans);
        }
    }
}
