package Easy.Trees;

public class Construct_String_from_Binary_Tree {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        pre(root, sb);
        return sb.toString();
    }

    public void pre(TreeNode root, StringBuilder sb){
        if (root == null) return;
        sb.append(root.val);
        if (root.left != null || root.right != null){
            sb.append("(");
            pre(root.left, sb);
            sb.append(")");
        }
        if (root.right != null){
            sb.append("(");
            pre(root.right, sb);
            sb.append(")");
        }
    }
}
