package Easy.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Subtree_of_Another_Tree {
    public boolean isSubtree_optimized(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (compare(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        int val = subRoot.val;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i = 0; i < sz; i++){
                TreeNode curr = q.poll();
                if (curr.val == val && compare(curr, subRoot)){
                    return true;
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return false;
    }

    public boolean compare(TreeNode r1, TreeNode r2){
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;
        if (r1.val != r2.val) return false;
        return compare(r1.left, r2.left) && compare(r1.right, r2.right);
    }
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        Queue<TreeNode> q = new LinkedList();
//        q.add(root);
//        while (!q.isEmpty()){
//            int sz = q.size();
//            for (int i = 0; i < sz; i++){
//                TreeNode curr = q.poll();
//
//                if (compare(curr, subRoot)) {
//                    System.out.println(curr.val);
//                    return true;
//                }
//                if (curr.left != null) q.add(curr.left);
//                if (curr.right != null) q.add(curr.right);
//            }
//        }
//        return false;
//    }
//
//    public boolean compare(TreeNode r1, TreeNode r2){
//        Queue<TreeNode> q1 = new LinkedList();
//        Queue<TreeNode> q2 = new LinkedList();
//        q1.add(r1);
//        q2.add(r2);
//        while (!q1.isEmpty() && !q2.isEmpty()){
//            int sz1 = q1.size();
//            int sz2 = q2.size();
//            if (sz1 != sz2) return false;
//            for (int i = 0; i < sz1; i++){
//                TreeNode curr_1 = q1.poll();
//                TreeNode curr_2 = q2.poll();
//                if (curr_1.val != curr_2.val) return false;
//                if (curr_1.left != null) q1.add(curr_1.left);
//                if (curr_1.right != null) q1.add(curr_1.right);
//                if (curr_2.left != null) q2.add(curr_2.left);
//                if (curr_2.right != null) q2.add(curr_2.right);
//            }
//        }
//        return q1.size() == q2.size();
//    }
}
