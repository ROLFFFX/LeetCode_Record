package Easy.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Univalued_Binary_Tree {
    public boolean isUnivalTree_DFS(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.left.val != root.val) return false;
        if (root.right != null && root.right.val != root.val) return false;
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
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
