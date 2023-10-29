public class BinaryTreeNode<T>{
    private T element;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T element) {
        this.element = element;
        leftChild = null;
        rightChild = null;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void addLeftChild(BinaryTreeNode<T> node) {
        if (leftChild == null) leftChild = node;
    }

    public void addRightChild(BinaryTreeNode<T> node) {
        if (rightChild == null) rightChild = node;
    }

    public void setLeftChild(BinaryTreeNode<T> node) {
        leftChild = node;
    }
    public void setRightChild(BinaryTreeNode<T> node) {
        rightChild = node;
    }
    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }
}
