package Easy.Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList();
        if (root != null) {
            find(root, "", ans);
        }
        return ans;
    }

    public void find(TreeNode root, String path, List<String> ans){
        if (root.left == null && root.right == null) ans.add(path+root.val);
        if (root.left != null) find(root.left, path+root.val+"->", ans);
        if (root.right != null) find(root.right, path+root.val+"->", ans);

    }
}
