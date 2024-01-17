package Easy.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Univalued_Binary_Tree {
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode curr = q.poll();
            if (curr.val != val) return false;
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        return true;
    }
}
