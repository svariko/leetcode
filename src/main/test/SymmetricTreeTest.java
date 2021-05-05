package main.test;

import main.java.SymmetricTree;
import main.java.TreeNode;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SymmetricTreeTest {
    private SymmetricTree symmetricTree;

    @Before
    public void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    public void testValidSimple() {
        TreeNode root = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        assertTrue(symmetricTree.isSymmetric(root));

    }

    @Test
    public void testInvalidSimple() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(3);

        assertFalse(symmetricTree.isSymmetric(root));

    }
}
