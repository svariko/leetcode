package main.java;


import java.util.ArrayList;
import java.util.List;

public class ScratchPad {

    public static void addToQueue(TreeNode treeNode, List<Integer> queue) {
        if (treeNode == null) {
            return;
        }

        queue.add(treeNode.val);
        addToQueue(treeNode.left, queue);
        addToQueue(treeNode.right, queue);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);

        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);

        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        List<Integer> values = new ArrayList<>();

        addToQueue(root, values);

        for (Integer val: values) {
            System.out.println(val);
        }



    }

}
