package Easy.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Count_Complete_Tree_Nodes {
    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null) return count;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            int sz = q.size();
            count += sz;
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return count;
    }
}
