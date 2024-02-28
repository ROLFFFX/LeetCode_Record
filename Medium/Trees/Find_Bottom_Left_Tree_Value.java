package Medium.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Find_Bottom_Left_Tree_Value {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return -1;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int lft = root.val;
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                if (i == 0) lft = curr.val;
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }
        return lft;
    }
}
