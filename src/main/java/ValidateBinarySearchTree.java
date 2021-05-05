package main.java;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

    private void populateInOrderList(TreeNode root, List<TreeNode> inOrderNodes) {
        if (root == null) {
            return;
        }

        populateInOrderList(root.left, inOrderNodes);

        inOrderNodes.add(root);

        populateInOrderList(root.right, inOrderNodes);

    }


    public boolean isValidBST(TreeNode root) {
        List<TreeNode> inOrderNodes = new ArrayList<>();

        populateInOrderList(root, inOrderNodes);


        int last = inOrderNodes.get(0).val;

        for (int i = 1; i < inOrderNodes.size(); i++) {
            if (inOrderNodes.get(i).val <= last) {
                return false;
            }
            last = inOrderNodes.get(i).val;
        }

        return true;

    }




}
