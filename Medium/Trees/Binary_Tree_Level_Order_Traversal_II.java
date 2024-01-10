package Medium.Trees;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> ans = new Stack();
        Queue<TreeNode> q = new LinkedList();
        if (root == null) return ans;
        q.add(root);
        while (!q.isEmpty()){
            int sz = q.size();
            List<Integer> level = new ArrayList();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.push(level);
        }
        List<List<Integer>> ret = new ArrayList();
        while (!ans.isEmpty()){
            ret.add(ans.pop());
        }
        return ret;
    }
}
