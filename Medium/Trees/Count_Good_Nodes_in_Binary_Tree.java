package Medium.Trees;

public class Count_Good_Nodes_in_Binary_Tree {
    public int goodNodes(TreeNode root) {
        return find(root, -10000);
    }

    public int find(TreeNode root, int max){
        if (root == null) return 0;
        int res = root.val >= max ? 1 : 0;
        res += find(root.left, Math.max(max, root.val));
        res += find(root.right, Math.max(max, root.val));
        return res;
    }
}
