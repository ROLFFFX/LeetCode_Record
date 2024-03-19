package Medium.Trees;

public class Count_Nodes_Equal_to_Average_of_Subtree {
    public int matchingSubtree = 0;
    public int[] calculateSubtreeValues(TreeNode currentNode) {
        if (currentNode == null) return new int[]{0,0};
        int[] leftSubtree = calculateSubtreeValues(currentNode.left);
        int[] rightSubtree = calculateSubtreeValues(currentNode.right);
        int sumOfValues = leftSubtree[0] + rightSubtree[0] + currentNode.val;
        int numberOfNodes = leftSubtree[1] + rightSubtree[1] + 1;
        if (sumOfValues / numberOfNodes == currentNode.val) matchingSubtree++;
        return new int[]{sumOfValues, numberOfNodes};
    }

    public int averageOfSubtree(TreeNode root) {
        calculateSubtreeValues(root);
        return matchingSubtree;
    }
}
