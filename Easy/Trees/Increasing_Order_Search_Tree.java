package Easy.Trees;

import java.util.ArrayList;
import java.util.List;

public class Increasing_Order_Search_Tree {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList();
        inOrder(list, root);
        TreeNode ans = new TreeNode(0);
        TreeNode dummy = ans;
        for (int i : list){
            dummy.right = new TreeNode(i);
            dummy = dummy.right;
        }
        return ans.right;
    }

    public void inOrder(List<Integer> list, TreeNode root){
        if (root == null) return;
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }
}
