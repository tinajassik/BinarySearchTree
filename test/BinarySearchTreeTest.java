import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    private BinarySearchTree<Integer> binarySearchTree;

    @Before
    public void setUp() {
        BinaryTree binaryTree = new BinaryTreeImpl();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        binaryTree.setRoot(root);
        binarySearchTree = new BinarySearchTree<>(binaryTree);
    }

    @Test
    public void testInsert() {
        assertTrue(binarySearchTree.insert(5));
        assertTrue(binarySearchTree.insert(15));
        assertFalse(binarySearchTree.insert(10)); // Existing element
    }

    @Test
    public void testRemove() {
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        assertTrue(binarySearchTree.remove(5));
        assertTrue(binarySearchTree.remove(15));
        assertFalse(binarySearchTree.remove(100)); // Element not in the tree
    }

    @Test
    public void testFindMin() {
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        assertEquals(Integer.valueOf(5), binarySearchTree.findMin());
    }

    @Test
    public void testFindMax() {
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        assertEquals(Integer.valueOf(15), binarySearchTree.findMax());
    }

    @Test
    public void testRebalance() {
        binarySearchTree.insert(5);
        binarySearchTree.insert(15);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.rebalance();
        // You can add assertions to verify that the tree is balanced.
    }

    @Test
    public void testGetRoot() {
        assertNotNull(binarySearchTree.getRoot());
    }
}

