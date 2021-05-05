package main.test;

import main.java.TreeNode;
import main.java.ValidateBinarySearchTree;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {

    private ValidateBinarySearchTree validateBinarySearchTree;

    @Before
    public void setUp() {
        validateBinarySearchTree = new ValidateBinarySearchTree();
    }

    @Test
    public void testSmallValidBST() {
        TreeNode leftChild = new TreeNode(1);
        TreeNode rightChild = new TreeNode(3);
        TreeNode root = new TreeNode(2, leftChild, rightChild);

        assertTrue(validateBinarySearchTree.isValidBST(root));
    }
}
