package main.java;

import main.java.TreeNode;

public class MaximumDepthBinaryTree {

    public int getMaximumDepth(TreeNode node, int depth) {

        if (node == null) {
            return depth - 1;
        }

        int maxLeft = getMaximumDepth(node.left, depth + 1);
        int maxRight = getMaximumDepth(node.right, depth + 1);

        return Math.max(maxLeft, maxRight);


    }


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return getMaximumDepth(root, 1);


    }

}
