package Medium.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if (root == null) return ans;
        q.add(root);
        while (!q.isEmpty()){
            double sum = 0;
            int sz = q.size();
            int i = 0;
            for (; i < sz; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(sum/i);
        }
        return ans;
    }
}
