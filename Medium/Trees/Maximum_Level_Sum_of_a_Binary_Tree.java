package Medium.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Level_Sum_of_a_Binary_Tree {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int ans = 1;    // depth with first occurrence of max level sum
        int depth = 1;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            int level_sum = 0;
            int sz = q.size();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                level_sum += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            if (level_sum > max){
                max = level_sum;
                ans = depth;
            }
            depth++;
        }
        return ans;
    }
}
