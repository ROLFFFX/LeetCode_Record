package Medium.Trees;

public class Palindromic_Paths_in_a_Binary_Tree {
    int result = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] map = new int[10];
        find(root, map);
        return result;
    }

    public void find(TreeNode root, int[] map){
        if (root == null) return;
        map[root.val]++;
        if (root.left == null && root.right == null){
            if (isPalindrome(map)) result++;
        }
        find(root.left, map);
        find(root.right, map);
        map[root.val]--;
    }

    public boolean isPalindrome(int[] map){
        int miss = 0;
        for (int i = 0; i<= 9; i++){
            if (map[i] % 2 != 0) miss++;
            if (miss > 1) return false;
        }
        return true;
    }
}
