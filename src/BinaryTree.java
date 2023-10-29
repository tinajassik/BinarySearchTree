import java.util.ArrayList;

public interface BinaryTree<T> {

    BinaryTreeNode getRoot();
    void setRoot(BinaryTreeNode binaryTreeNode);
    boolean isEmpty();
    int size();
    boolean contains(T element);
    ArrayList<T> inOrder(BinaryTreeNode node);
    ArrayList<T> preOrder(BinaryTreeNode node);
    ArrayList<T> postOrder(BinaryTreeNode node);
    ArrayList<T> levelOrder(BinaryTreeNode node);
    int height();
}
