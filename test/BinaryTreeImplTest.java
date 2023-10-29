import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeImplTest {
    private BinaryTree binaryTree;
    private BinaryTreeNode root;

    @Before
    public void setUp() {
        binaryTree = new BinaryTreeImpl();
        root = new BinaryTreeNode(1);
        root.addLeftChild(new BinaryTreeNode(2));
        root.addRightChild(new BinaryTreeNode(3));
        root.getLeftChild().addLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        binaryTree.setRoot(root);
    }

    @Test
    public void testIsEmpty() {
        assertFalse(binaryTree.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(5, binaryTree.size());
    }

    @Test
    public void testContains() {
        assertTrue(binaryTree.contains(2));
        assertTrue(binaryTree.contains(4));
        assertFalse(binaryTree.contains(6));
    }

    @Test
    public void testInOrder() {
        ArrayList<Integer> inOrderResult = binaryTree.inOrder(root);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(5);
        expected.add(1);
        expected.add(3);
        assertEquals(expected, inOrderResult);
    }

    @Test
    public void testPreOrder() {
        ArrayList<Integer> preOrderResult = binaryTree.preOrder(root);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);
        expected.add(3);
        assertEquals(expected, preOrderResult);
    }

    @Test
    public void testPostOrder() {
        ArrayList<Integer> postOrderResult = binaryTree.postOrder(root);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(5);
        expected.add(2);
        expected.add(3);
        expected.add(1);
        assertEquals(expected, postOrderResult);
    }

    @Test
    public void testLevelOrder() {
        ArrayList<Integer> levelOrderResult = binaryTree.levelOrder(root);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, levelOrderResult);
    }

    @Test
    public void testHeight() {
        assertEquals(3, binaryTree.height());
    }
}

