package Medium.Trees;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        find(root, targetSum, path, ans);
        return ans;
    }

    public void find(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans){
        if (root == null) return;
        path.add(root.val);
        if (root.val == targetSum && root.left == null && root.right == null){
            ans.add(new ArrayList<Integer>(path));
        } else {
            find(root.left, targetSum - root.val, path, ans);
            find(root.right, targetSum - root.val, path, ans);
        }
        path.remove(path.size() - 1);
    }
}
