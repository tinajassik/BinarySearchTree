import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeNodeTest {

    @Test
    public void testConstructorAndGetElement() {
        BinaryTreeNode<Integer> node = new BinaryTreeNode(42);
        assertEquals(Integer.valueOf(42), node.getElement());
    }

    @Test
    public void testAddLeftChildAndGetLeftChild() {
        BinaryTreeNode<Integer> parent = new BinaryTreeNode(10);
        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode(5);

        parent.addLeftChild(leftChild);
        assertEquals(leftChild, parent.getLeftChild());
    }

    @Test
    public void testAddRightChildAndGetRightChild() {
        BinaryTreeNode<Integer> parent = new BinaryTreeNode(10);
        BinaryTreeNode<Integer> rightChild = new BinaryTreeNode(20);

        parent.addRightChild(rightChild);
        assertEquals(rightChild, parent.getRightChild());
    }

    @Test
    public void testSetLeftChildAndGetLeftChild() {
        BinaryTreeNode<Integer> parent = new BinaryTreeNode(10);
        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode(5);

        parent.setLeftChild(leftChild);
        assertEquals(leftChild, parent.getLeftChild());
    }

    @Test
    public void testSetRightChildAndGetRightChild() {
        BinaryTreeNode<Integer> parent = new BinaryTreeNode(10);
        BinaryTreeNode<Integer> rightChild = new BinaryTreeNode(20);

        parent.setRightChild(rightChild);
        assertEquals(rightChild, parent.getRightChild());
    }
}
