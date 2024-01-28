package Medium.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Count_Univalue_Subtrees {
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) return 0;
        int count = 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                if (check(curr, curr.val)){
                    count++;
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return count;
    }

    // check if this tree is univalue
    public boolean check(TreeNode root, int val){
        if (root == null) return true;
        if (root.val != val) return false;
        return check(root.left, val) && check(root.right, val);
    }
}
