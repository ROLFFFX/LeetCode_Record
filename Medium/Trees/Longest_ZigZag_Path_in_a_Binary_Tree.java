package Medium.Trees;

public class Longest_ZigZag_Path_in_a_Binary_Tree {
    public int max = 0;
    public int longestZigZag(TreeNode root) {
        solve(root,0,0);
        solve(root,1,0);
        return max;
    }

    public void solve(TreeNode root, int dir, int curr){
        if (root == null) return;
        max = Math.max(curr, max);
        if (dir == 1) {
            solve(root.left, 0, curr + 1);
            solve(root.right, 1, 1);
        } else {
            solve(root.right, 1, curr + 1);
            solve(root.left,0, 1);
        }
    }
}
