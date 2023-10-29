import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T> {

    private BinaryTree binaryTree;
    private BinaryTreeNode root;

    public BinarySearchTree(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
        root = binaryTree.getRoot();
    }

    public boolean insert(T element) {
        if (binaryTree.contains(element)) return false;
        root =  insert(root, element);
        return true;
    }

    private BinaryTreeNode<T> insert(BinaryTreeNode<T> current, T element) {

        if (current == null) {
            return new BinaryTreeNode<T>(element);
        }

        Element newElement = new Element(element);
        Element root = new Element(current.getElement());

        if (newElement.compareTo(root) < 0) {
            current.addLeftChild(insert(current.getLeftChild(), element));
        } else {
            current.addRightChild(insert(current.getRightChild(), element));
        }
        return current;
    }

    public boolean remove(T element) {
        if (!binaryTree.contains(element)) return false;
        remove(root, element);
        return true;
    }

    private BinaryTreeNode<T> remove(BinaryTreeNode current, T element) {
        if (current == null) return null;

        if (element.equals(current.getElement())) {
            if (current.getLeftChild() == null && current.getRightChild() == null) return null;
            if (current.getRightChild() == null) return current.getLeftChild();
            if (current.getLeftChild() == null) return current.getRightChild();

            T smallestValue = findMin(current.getRightChild());
            current.setElement(smallestValue);
            current.setRightChild(remove(current.getRightChild(),smallestValue));
            return current;

        }
        Element newElement = new Element(element);
        Element root = new Element(current.getElement());

        if (newElement.compareTo(root) < 0) {
            current.setLeftChild(remove(current.getLeftChild(), element));
            return current;
        }
        current.setRightChild((remove(current.getRightChild(), element)));

        return current;
    }

    public T findMin() {
        return findMin(root);
    }

    private T findMin(BinaryTreeNode current) {
        return current.getLeftChild() == null ? (T) current.getElement() : findMin(current.getLeftChild());
    }

    public T findMax() {
        return findMax(root);
    }

    private T findMax(BinaryTreeNode current) {
        return current.getRightChild() == null ? (T) current.getElement() : findMax(current.getRightChild());
    }

    public void rebalance() {
        root = rebalance(binaryTree.inOrder(root));
    }
    
    
    private BinaryTreeNode<T> rebalance(List<T> sortedTreeList) {

        if (sortedTreeList.size() == 0) {
            return null;
        }
        BinaryTreeNode<T> currentRoot = new BinaryTreeNode<>(sortedTreeList.get(sortedTreeList.size() / 2)) ;

        List<T> leftSubtree = sortedTreeList.subList(0, sortedTreeList.size()/2);
        currentRoot.setLeftChild(rebalance(leftSubtree));
        List<T> rightSubtree = sortedTreeList.subList(sortedTreeList.size()/2 + 1, sortedTreeList.size());
        currentRoot.setRightChild(rebalance(rightSubtree));

        return currentRoot;
    }


    public BinaryTreeNode getRoot() {
        return root;
    }



}
