package Easy.Trees;

import java.util.ArrayList;
import java.util.List;

public class Find_All_The_Lonely_Nodes {
    public List<Integer> ans = new ArrayList();

    public List<Integer> getLonelyNodes(TreeNode root) {
        find(root);
        return ans;
    }

    public void find(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right != null) {
            ans.add(root.right.val);
        }
        if (root.right == null && root.left != null) {
            ans.add(root.left.val);
        }
        find(root.left);
        find(root.right);
    }
}
