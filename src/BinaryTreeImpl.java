import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTreeImpl implements BinaryTree
{
    private BinaryTreeNode root;
    private ArrayList binaryTreeArray = new ArrayList<>();

    @Override
    public BinaryTreeNode getRoot() {
        return root;
    }

    @Override
    public void setRoot(BinaryTreeNode binaryTreeNode) {

        root = binaryTreeNode;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(BinaryTreeNode node) {
        if (node == null) return 0;
        int leftSize = size(node.getLeftChild());
        int rightSize = size(node.getRightChild());
        return leftSize + rightSize + 1;
    }

    @Override
    public boolean contains(Object element) {
        return contains(root, element);
    }

    private boolean contains(BinaryTreeNode node, Object target) {
        if (node == null) return false;

        if (node.getElement().equals(target)) {
            return true;
        }
        boolean containsLeft = contains(node.getLeftChild(), target);
        boolean containsRight = contains(node.getRightChild(),target);

        return containsLeft || containsRight;
    }

    @Override
    public ArrayList inOrder(BinaryTreeNode node) {

        if (node != null) {
            inOrder(node.getLeftChild());
            binaryTreeArray.add(node.getElement());
            System.out.println("In order, visiting: " + node.getElement());
            inOrder(node.getRightChild());
        }
        return binaryTreeArray;
    }


    @Override
    public ArrayList preOrder(BinaryTreeNode node) {
        if (node != null) {
            binaryTreeArray.add(node.getElement());
            System.out.println("Pre order, visiting: " + node.getElement());
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
        return binaryTreeArray;
    }

    @Override
    public ArrayList postOrder(BinaryTreeNode node) {

        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            binaryTreeArray.add(node.getElement());
            System.out.println("Post order, visiting: " + node.getElement());
        }
        return binaryTreeArray;
    }

    @Override
    public ArrayList levelOrder(BinaryTreeNode node) {

        if (node != null) {

        Queue queue = new LinkedList();
        queue.add(node);

        while (!(queue.isEmpty())) {
            node = (BinaryTreeNode) queue.remove();
            binaryTreeArray.add(node.getElement());
            System.out.println("Level order, visiting: " + node.getElement());

            if (node.getLeftChild() != null) queue.add(node.getLeftChild());
            if (node.getRightChild() != null) queue.add(node.getRightChild());
        }
        }
        return binaryTreeArray;


    }

    @Override
    public int height() {
        return height(root);
    }

    private int height(BinaryTreeNode node) {

        int height = 0;
        if (node == null) return height;
        int heightLeft = height(node.getLeftChild());
        int heightRight = height(node.getRightChild());
        return heightLeft > heightRight  ? heightLeft + 1: heightRight + 1;

    }
}
