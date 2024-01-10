package Medium.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        // bfs, collect rightmost digit each level
        Queue<TreeNode> q = new LinkedList();
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;
        q.add(root);
        while (!q.isEmpty()){
            // for each layer
            int sz = q.size();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                if (i == sz - 1){ ans.add(curr.val); }
            }
        }
        return ans;
    }
}
