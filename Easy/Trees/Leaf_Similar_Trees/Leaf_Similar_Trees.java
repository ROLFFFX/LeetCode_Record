package Easy.Trees.Leaf_Similar_Trees;

import java.util.ArrayList;
import java.util.List;

public class Leaf_Similar_Trees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Perform DFS on both trees and store the leaf values
        List<Integer> leavesOfTree1 = traverseAndCollectLeaves(root1);
        List<Integer> leavesOfTree2 = traverseAndCollectLeaves(root2);

        // Return the comparison result of leaves
        return leavesOfTree1.equals(leavesOfTree2);
    }

    // Recursive method that performs DFS and collects leaf node's values
    private List<Integer> traverseAndCollectLeaves(TreeNode node) {
        // Base case: if the current node is null, return an empty list
        if (node == null) {
            return new ArrayList<>();
        }

        // Traverse the left subtree and collect its leaf nodes
        List<Integer> leaves = traverseAndCollectLeaves(node.left);

        // Traverse the right subtree and collect its leaf nodes
        leaves.addAll(traverseAndCollectLeaves(node.right));

        // Check if current node is a leaf node (as it will have no children after above traversals)
        if (leaves.isEmpty()) {
            // If it's a leaf, add its value to the list
            leaves.add(node.val);
        }

        // Return the list of leaf node's values
        return leaves;
    }
}
