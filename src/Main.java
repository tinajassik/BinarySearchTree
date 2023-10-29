public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTreeImpl();

        BinaryTreeNode root = new BinaryTreeNode<>(10);
        root.addLeftChild(new BinaryTreeNode(12));
        root.addRightChild(new BinaryTreeNode(22));
        BinaryTreeNode root2 = root.getLeftChild();
        root2.addRightChild(new BinaryTreeNode<>(40));
        root2.addLeftChild(new BinaryTreeNode(33));
        binaryTree.setRoot(root);

        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        binaryTreePrint.printTree(root);
        System.out.println();
        binaryTree.levelOrder(root);
        System.out.println("\nSize: " + binaryTree.size());
        System.out.println("\nHeight " + binaryTree.height());
        BinaryTreeNode rootsearch = new BinaryTreeNode<>(9);
        BinaryTree binaryTree1 = new BinaryTreeImpl();
        binaryTree1.setRoot(rootsearch);
        BinarySearchTree binarySearchTree = new BinarySearchTree<>(binaryTree1);
        binarySearchTree.insert(12);
        binarySearchTree.insert(19);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(100);
        binarySearchTree.insert(24);
        binarySearchTree.insert(5);
        binarySearchTree.insert(11);
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);
        binarySearchTree.insert(101);
        binarySearchTree.insert(102);
        binarySearchTree.insert(103);
        binarySearchTree.insert(104);






        System.out.println("\nSize: " + binaryTree1.size());
        System.out.println("\nHeight " + binaryTree1.height());

        binaryTreePrint.printTree(binaryTree1.getRoot());
        binaryTree.inOrder(rootsearch);
        binarySearchTree.rebalance();
        binaryTreePrint.printTree(binarySearchTree.getRoot());
    }
}
