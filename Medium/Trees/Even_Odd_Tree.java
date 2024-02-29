package Medium.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Even_Odd_Tree {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        boolean even = true;
        while (!q.isEmpty()){
            int sz = q.size();
            even = !even;
            int curr = even ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            for (int i = 0; i < sz; i++){
                TreeNode curr_node = q.poll();
                // even case: strictly increasing
                if (even){
                    if (curr_node.val >= curr || curr_node.val % 2 != 0) return false;
                } else {    // odd case: strictly decreasing
                    if (curr_node.val <= curr || curr_node.val % 2 != 1) return false;
                }
                curr = curr_node.val;
                if (curr_node.left != null) q.add(curr_node.left);
                if (curr_node.right != null) q.add(curr_node.right);
            }
        }
        return true;
    }
}
