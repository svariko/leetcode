package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SymmetricTree {

    public boolean helper(TreeNode leftChild, TreeNode rightChild) {
        if (leftChild == null && rightChild == null) {
            return true;
        }

        if (leftChild == null && rightChild != null) {
            return false;
        }

        if (leftChild != null && rightChild == null) {
            return false;
        }

        if (leftChild.val != rightChild.val) {
            return false;
        }

        boolean first = helper(leftChild.left, rightChild.right);

        if (!first) {
            return false;
        }

        boolean second = helper(leftChild.right, rightChild.left);

        if (!second) {
            return false;
        }

        return true;

    }

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);

    }

}
