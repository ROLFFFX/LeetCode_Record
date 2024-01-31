package Medium.Trees;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode build(int[] inorder, int ins, int ine, int[] postorder, int poss, int pose){
        if (ins > ine || poss > pose) return null;
        TreeNode root = new TreeNode(postorder[pose]);
        int rooti = 0;
        for (int i = 0; i < inorder.length; i++){
            if (inorder[i] == root.val){
                rooti = i;
                break;
            }
        }
        root.left = build(inorder, ins, rooti - 1, postorder, poss, poss+rooti-ins-1);
        root.right = build(inorder, rooti+1, ine, postorder, poss+rooti-ins, pose-1);
        return root;
    }
}
