package Medium.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        // BFS
        Queue<TreeNode> q = new LinkedList();   // q consists of nodes that have some children
        int depth = 1;
        q.add(root);
        while (!q.isEmpty()){
            // for each level, we explore nodes in q
            // if we find a leaf node, immediately return depth
            int size = q.size();
            for (int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if (curr.left == null && curr.right == null){
                    return depth;
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            depth++;
        }
        return depth;
    }
}
