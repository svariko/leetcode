package main.java;

import java.util.*;

public class BinaryTreeLevelOrder {

    public void helper(TreeNode node, List<List<Integer>> values, int level) {
        if (node == null) {
            return;
        }

        if (values.size() < level) {
            values.add(new ArrayList<Integer>());
        }

        List<Integer> levelValues = values.get(level - 1);
        levelValues.add(node.val);

        helper(node.left, values, level + 1);
        helper(node.right, values, level + 1);





    }



    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> values = new ArrayList<>();

        helper(root, values, 1);

        return values;

    }
}
