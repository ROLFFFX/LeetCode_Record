package Medium.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> ans = new ArrayList();
        if (root == null) return ans;
        q.add(root);
        while (!q.isEmpty()){
            // for each level
            List<Integer> level = new ArrayList();
            int sz = q.size();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
